package cafe.D_nuevoEditarProducto.modelo.tabla;

import cafe.A_BD.ConnectionBD;
import cafe.D_nuevoEditarProducto.modelo.Producto;
import cafe.D_nuevoEditarProducto.vista.FrmCrearNuevoProducto;

import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;

public class GuardarNuevoProducto {
    FrmCrearNuevoProducto crearNuevoProducto = FrmCrearNuevoProducto.getInstancia();
    LocalDate todayLocalDate = LocalDate.now(ZoneId.of("America/Montreal"));
    Producto producto = new Producto();

    public GuardarNuevoProducto() {
        if (datosProductosCompletos()) {
            try {
                producto.setsID(Integer.parseInt(FrmCrearNuevoProducto.crearNuevoProducto.getTxtID().getText()));
                producto.setsNombreProducto(FrmCrearNuevoProducto.crearNuevoProducto.getTxtNombreProducto().getText());
                producto.setsReferencia(FrmCrearNuevoProducto.crearNuevoProducto.getTxtReferencia().getText());
                producto.setsPrecio(Integer.parseInt(FrmCrearNuevoProducto.crearNuevoProducto.getTxtPrecio().getText()));
                producto.setsPeso(Integer.parseInt(FrmCrearNuevoProducto.crearNuevoProducto.getTxtPeso().getText()));
                producto.setsCategoria(FrmCrearNuevoProducto.crearNuevoProducto.getTxtCategoria().getText());
                producto.setsStock(Integer.parseInt(FrmCrearNuevoProducto.crearNuevoProducto.getTxtStock().getText()));
                producto.setsFecha(todayLocalDate);
                guardarNuevoProductoBD();
                JOptionPane.showMessageDialog(null, "Registro exitoso!", "GUARDAR TIPO MUNICIÓN", JOptionPane.DEFAULT_OPTION,
                        new ImageIcon(getClass().getResource("/cafe/imagen/Guardar.png")));
                limpiarDeProducto();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Servidor dice: "+e, "GUARDAR PRODUCTO", JOptionPane.DEFAULT_OPTION,
                        new ImageIcon(getClass().getResource("/cafe/imagen/xRoja.png")));

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Recuerda que:\n " +
                                "\uF0D8 ID -> ENTERO OBLIGATORIO \n" +
                                "\uF0D8 Nombre de producto -> TEXTO OBLIGATORIO\n" +
                                "\uF0D8 Referencia -> TEXTO OBLIGATORIO\n" +
                                "\uF0D8 Precio -> ENTERO OBLIGATORIO\n" +
                                "\uF0D8 Peso -> TEXTO OBLIGATORIO\n" +
                                "\uF0D8 Categoría -> TEXTO OBLIGATORIO\n" +
                                "\uF0D8 Stock -> ENTERO OBLIGATORIO \n", "GUARDAR PRODUCTO", JOptionPane.DEFAULT_OPTION,
                        new ImageIcon(getClass().getResource("/cafe/imagen/xRoja.png")));
            }

        } else {
            JOptionPane.showMessageDialog(null, "Algo salio mal", "GUARDAR PRODUCTO", JOptionPane.DEFAULT_OPTION,
                    new ImageIcon(getClass().getResource("/cafe/imagen/xRoja.png")));
        }
    }


    public boolean datosProductosCompletos() {
        if (!crearNuevoProducto.getTxtID().getText().trim().isEmpty() &&
                !crearNuevoProducto.getTxtNombreProducto().getText().trim().isEmpty() &&
                !crearNuevoProducto.getTxtReferencia().getText().trim().isEmpty() &&
                !crearNuevoProducto.getTxtPrecio().getText().trim().isEmpty() &&
                !crearNuevoProducto.getTxtPeso().getText().trim().isEmpty() &&
                !crearNuevoProducto.getTxtCategoria().getText().trim().isEmpty() &&
                !crearNuevoProducto.getTxtStock().getText().trim().isEmpty() &&
                !crearNuevoProducto.getTxtFecha().getText().trim().isEmpty()) {
            return true;

        }
        JOptionPane.showMessageDialog(null, "Recuerda que:\n " +
                        "\uF0D8 ID -> ENTERO OBLIGATORIO \n" +
                        "\uF0D8 Nombre de producto -> TEXTO OBLIGATORIO\n" +
                        "\uF0D8 Referencia -> TEXTO OBLIGATORIO\n" +
                        "\uF0D8 Precio -> ENTERO OBLIGATORIO\n" +
                        "\uF0D8 Peso -> TEXTO OBLIGATORIO\n" +
                        "\uF0D8 Categoría -> TEXTO OBLIGATORIO\n" +
                        "\uF0D8 Stock -> ENTERO OBLIGATORIO \n", "GUARDAR PRODUCTO", JOptionPane.DEFAULT_OPTION,
                new ImageIcon(getClass().getResource("/cafe/imagen/xRoja.png")));
        return false;
    }

    public boolean limpiarDeProducto() {
        crearNuevoProducto.getTxtID().setText("");
        crearNuevoProducto.getTxtNombreProducto().setText("");
        crearNuevoProducto.getTxtReferencia().setText("");
        crearNuevoProducto.getTxtPrecio().setText("");
        crearNuevoProducto.getTxtPeso().setText("");
        crearNuevoProducto.getTxtCategoria().setText("");
        crearNuevoProducto.getTxtStock().setText("");
        crearNuevoProducto.getTxtID().requestFocus();
        return true;
    }

    public void guardarNuevoProductoBD() throws SQLException {
        PreparedStatement ps;
        String sql;

        ConnectionBD con = new ConnectionBD();
        sql = "insert into producto(id, nombre_producto, referencia,precio,Peso,Categoría,Stock,Fecha) values(?,?,?,?,?,?,?,?)";
        ps = con.connection().prepareStatement(sql);
        ps.setInt(1, producto.getsID());
        ps.setString(2, producto.getsNombreProducto());
        ps.setString(3, producto.getsReferencia());
        ps.setInt(4, producto.getsPrecio());
        ps.setInt(5, producto.getsPeso());
        ps.setString(6, producto.getsCategoria());
        ps.setInt(7, producto.getsStock());
        ps.setDate(8, Date.valueOf(producto.getsFecha().toString()));
        ps.executeUpdate();


    }

}

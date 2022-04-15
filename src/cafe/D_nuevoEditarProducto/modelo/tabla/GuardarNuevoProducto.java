package cafe.D_nuevoEditarProducto.modelo.tabla;

import cafe.D_nuevoEditarProducto.control.AlmacenProductos;
import cafe.D_nuevoEditarProducto.modelo.Producto;
import cafe.D_nuevoEditarProducto.vista.FrmCrearNuevoProducto;

import javax.swing.*;
import java.text.SimpleDateFormat;

public class GuardarNuevoProducto {
    FrmCrearNuevoProducto crearNuevoProducto = FrmCrearNuevoProducto.getInstancia();
    SimpleDateFormat formato = new SimpleDateFormat("HH:mm - yyyy/MM/dd ");

    public GuardarNuevoProducto() {
        if (datosProductosCompletos()) {
            try {
                Producto producto = new Producto();
                producto.setsID(Integer.parseInt(FrmCrearNuevoProducto.crearNuevoProducto.getTxtID().getText()));
                producto.setsNombreProducto(FrmCrearNuevoProducto.crearNuevoProducto.getTxtNombreProducto().getText());
                producto.setsReferencia(FrmCrearNuevoProducto.crearNuevoProducto.getTxtReferencia().getText());
                producto.setsPrecio(Integer.parseInt(FrmCrearNuevoProducto.crearNuevoProducto.getTxtPrecio().getText()));
                producto.setsPeso(Integer.parseInt(FrmCrearNuevoProducto.crearNuevoProducto.getTxtPeso().getText()));
                producto.setsCategoria(FrmCrearNuevoProducto.crearNuevoProducto.getTxtCategoria().getText());
                producto.setsStock(Integer.parseInt(FrmCrearNuevoProducto.crearNuevoProducto.getTxtStock().getText()));
                producto.setsFecha(formato.parse(FrmCrearNuevoProducto.crearNuevoProducto.getTxtFecha().getText()));
                AlmacenProductos.addTipoMuni(producto);

                JOptionPane.showMessageDialog(null, "Registro exitoso!", "GUARDAR TIPO MUNICIÓN", JOptionPane.DEFAULT_OPTION,
                        new ImageIcon(getClass().getResource("/cafe/imagen/Guardar.png")));
                limpiarDeProducto();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Recuerda que:\n " +
                                "\uF0D8 ID -> ENTERO OBLIGATORIO \n" +
                                "\uF0D8 Nombre de producto -> TEXTO OBLIGATORIO\n" +
                                "\uF0D8 Referencia -> TEXTO OBLIGATORIO\n" +
                                "\uF0D8 Precio -> ENTERO OBLIGATORIO\n" +
                                "\uF0D8 Peso -> TEXTO OBLIGATORIO\n" +
                                "\uF0D8 Categoría -> TEXTO OBLIGATORIO\n" +
                                "\uF0D8 Stock -> ENTERO OBLIGATORIO \n" , "GUARDAR PRODUCTO", JOptionPane.DEFAULT_OPTION,
                        new ImageIcon(getClass().getResource("/cafe/imagen/xRoja.png")));
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debes completar toda la información", "GUARDAR PRODUCTO", JOptionPane.DEFAULT_OPTION,
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
        return true;
    }

}

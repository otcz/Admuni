package cafe.D_nuevoEditarProducto.control;

import cafe.A_BD.ConnectionBD;
import cafe.D_nuevoEditarProducto.modelo.Producto;
import cafe.D_nuevoEditarProducto.vista.FrmEditarProducto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EventoBotonBuscarID implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        FrmEditarProducto editarProducto = FrmEditarProducto.getInstancia();
        Producto producto = AlmacenProductos.getProducto(Integer.parseInt(editarProducto.getTxtID().getText()));
        if (producto != null) {
            editarProducto.getTxtNombreProducto().setText(producto.getsNombreProducto());
            editarProducto.getTxtReferencia().setText(producto.getsReferencia());
            editarProducto.getTxtPrecio().setText(String.valueOf(producto.getsPrecio()));
            editarProducto.getTxtPeso().setText(String.valueOf(producto.getsPeso()));
            editarProducto.getTxtCategoria().setText(producto.getsCategoria());
            editarProducto.getTxtStock().setText(String.valueOf(producto.getsStock()));
        } else {
            editarProducto.getTxtNombreProducto().setText("");
            editarProducto.getTxtReferencia().setText("");
            editarProducto.getTxtPrecio().setText("");
            editarProducto.getTxtPeso().setText("");
            editarProducto.getTxtCategoria().setText("");
            editarProducto.getTxtStock().setText("");
            JOptionPane.showMessageDialog(null, "No se encontro este producto", "VALIDACIÓN USUARIO", JOptionPane.DEFAULT_OPTION,
                    new ImageIcon(getClass().getResource("/cafe/imagen/Userx.png")));
        }


    }



    public Producto obtenerProductos(int id) {
        Producto producto = new Producto();

        try {
            Connection con = new ConnectionBD().connection();
            String SQL = "SELECT * FROM producto WHERE '" + id + "'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                producto.setsID(rs.getInt("id"));
                producto.setsNombreProducto(rs.getString("nombre_producto"));
                producto.setsReferencia(rs.getString("referencia"));
                producto.setsPrecio(rs.getInt("precio"));
                producto.setsPeso(rs.getInt("Peso"));
                producto.setsCategoria(rs.getString("Categoría"));
                producto.setsStock(rs.getInt("Stock"));
                producto.setsFecha(rs.getDate("fecha").toLocalDate());
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontro este producto", "VALIDACIÓN USUARIO", JOptionPane.DEFAULT_OPTION,
                    new ImageIcon(getClass().getResource("/cafe/imagen/Userx.png")));
        }
        return producto;
    }
}

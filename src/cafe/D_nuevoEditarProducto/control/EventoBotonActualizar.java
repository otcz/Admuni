package cafe.D_nuevoEditarProducto.control;

import cafe.A_BD.ConnectionBD;
import cafe.D_nuevoEditarProducto.modelo.Producto;
import cafe.D_nuevoEditarProducto.vista.FrmEditarProducto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class EventoBotonActualizar implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        FrmEditarProducto editarProducto = FrmEditarProducto.getInstancia();
        update(Integer.parseInt(editarProducto.getTxtID().getText()));

    }

    public void update(int id) {
        FrmEditarProducto editarProducto = FrmEditarProducto.getInstancia();
        try {
            Connection connection = new ConnectionBD().connection();
            String sSQL = "UPDATE producto SET nombre_producto=?, referencia=?, precio=?, peso=?, Categoría=?, stock=? where id = '" + id + "'";

            PreparedStatement pst = connection.prepareStatement(sSQL);
            pst.setString(1, editarProducto.getTxtNombreProducto().getText());
            pst.setString(2, editarProducto.getTxtReferencia().getText());
            pst.setInt(3, Integer.parseInt(editarProducto.getTxtPrecio().getText()));
            pst.setInt(4, Integer.parseInt(editarProducto.getTxtPeso().getText()));
            pst.setString(5, editarProducto.getTxtCategoria().getText());
            pst.setInt(6, Integer.parseInt(editarProducto.getTxtStock().getText()));

            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Producto actualizado correctamente", "VALIDACIÓN USUARIO", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon(getClass().getResource("/cafe/imagen/Userx.png")));
                AlmacenProductos.getProducto(id).setsNombreProducto((editarProducto.getTxtNombreProducto().getText()));
                AlmacenProductos.getProducto(id).setsReferencia((editarProducto.getTxtReferencia().getText()));
                AlmacenProductos.getProducto(id).setsPrecio(Integer.parseInt(editarProducto.getTxtPrecio().getText()));
                AlmacenProductos.getProducto(id).setsPeso(Integer.parseInt(editarProducto.getTxtPeso().getText()));
                AlmacenProductos.getProducto(id).setsCategoria((editarProducto.getTxtCategoria().getText()));
                AlmacenProductos.getProducto(id).setsStock(Integer.parseInt(editarProducto.getTxtStock().getText()));

                editarProducto.getTxtNombreProducto().setText("");
                editarProducto.getTxtReferencia().setText("");
                editarProducto.getTxtPrecio().setText("");
                editarProducto.getTxtPeso().setText("");
                editarProducto.getTxtCategoria().setText("");
                editarProducto.getTxtStock().setText("");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}

package cafe.D_nuevoEditarProducto.control;

import cafe.A_BD.ConnectionBD;
import cafe.D_nuevoEditarProducto.vista.FrmEditarProducto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;

public class EventoBotonEliminarProdcuto implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        FrmEditarProducto editarProducto = FrmEditarProducto.getInstancia();
        eliminarProductoID(Integer.parseInt(editarProducto.getTxtID().getText()));

    }

    public void eliminarProductoID(int productoID) {
        FrmEditarProducto editarProducto = FrmEditarProducto.getInstancia();
        Connection connection = new ConnectionBD().connection();
        try {
            String sql = "Delete from producto where id = " + productoID;
            Statement statement = connection.createStatement();
            int iRespuestaSQL = statement.executeUpdate(sql);
            if (iRespuestaSQL > 0) {
                JOptionPane.showMessageDialog(null, "Producto eliminado correctamente", "PRODUCTO", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon(getClass().getResource("/cafe/imagen/Userx.png")));

                AlmacenProductos.remover(productoID);

                editarProducto.getTxtNombreProducto().setText("");
                editarProducto.getTxtReferencia().setText("");
                editarProducto.getTxtPrecio().setText("");
                editarProducto.getTxtPeso().setText("");
                editarProducto.getTxtCategoria().setText("");
                editarProducto.getTxtStock().setText("");


            }
            connection.close();
            statement.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "EL producto no fue eliminado, servidor dice: "+e, "PRODUCTO", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(getClass().getResource("/cafe/imagen/Userx.png")));
        }
    }
}

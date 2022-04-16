package cafe.D_nuevoEditarProducto.control;

import cafe.A_BD.ConnectionBD;
import cafe.D_nuevoEditarProducto.modelo.Producto;
import cafe.D_nuevoEditarProducto.vista.FrmEditarProducto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
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
            Statement st = null;
            st = connection.createStatement();
            String query = "UPDATE producto SET  stock= '"+ editarProducto.getTxtStock().getText() +"' AND nombre_producto= '"+ editarProducto.getTxtNombreProducto().getText() +"'   where id = '"+ id +"'";
            st.executeUpdate(query);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

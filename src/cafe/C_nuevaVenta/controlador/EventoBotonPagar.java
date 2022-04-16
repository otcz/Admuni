package cafe.C_nuevaVenta.controlador;

import cafe.A_BD.ConnectionBD;
import cafe.C_nuevaVenta.modelo.Ventas;
import cafe.C_nuevaVenta.vista.FrmNuevaVenta;
import cafe.D_nuevoEditarProducto.control.AlmacenProductos;
import cafe.D_nuevoEditarProducto.modelo.Producto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class EventoBotonPagar implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        FrmNuevaVenta nuevaVenta = FrmNuevaVenta.getInstancia();
        DefaultTableModel modelo = (DefaultTableModel) nuevaVenta.getJtResgistro().getModel();
        int valorPgar = 0;
        int cantidadVentas = 0;

        AlmacenarVenta almacenarVenta = new AlmacenarVenta();
        for (int i = 0; i < almacenarVenta.getVentas().size(); i++) {
            Ventas ventas = almacenarVenta.getVentas().get(i);
            int pago = Integer.parseInt(ventas.getsPrecioTotal());
            valorPgar = valorPgar + pago;
            cantidadVentas++;

            update(Integer.parseInt(ventas.getsID()));
        }


        JOptionPane.showMessageDialog(null, "Cantidad de productos-->" + cantidadVentas + "\n" +
                        "Valor a Pagar--> " + valorPgar, "GUARDAR MUNICIÓN", JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(getClass().getResource("/cafe/imagen/xRoja.png")));

        for (int ventas = (cantidadVentas - 1); ventas >= 0; ventas--) {
            modelo.removeRow(ventas);
        }


    }

    public void update(int id) {

        try {
          Producto producto=AlmacenProductos.getProducto(id);
            Connection connection = new ConnectionBD().connection();
            Statement st = null;
            st = connection.createStatement();
            String query = "UPDATE producto SET  stock= '"+ producto.getsStock() +"'  where id = '"+ id +"'";
            st.executeUpdate(query);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

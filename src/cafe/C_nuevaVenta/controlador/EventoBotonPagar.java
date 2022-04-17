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
import java.sql.*;

public class EventoBotonPagar implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        FrmNuevaVenta nuevaVenta = FrmNuevaVenta.getInstancia();
        DefaultTableModel modelo = (DefaultTableModel) nuevaVenta.getJtResgistro().getModel();
        int valorPgar = 0;
        int cantidadVentas = 0;


        for (int i = 0; i < modelo.getRowCount(); i++) {
            Ventas ventas = AlmacenarVenta.getVentas(Integer.parseInt(modelo.getValueAt(i,0).toString()));
            int pago = ventas.getsPrecioTotal();
            valorPgar = valorPgar + pago;
            cantidadVentas++;
            update((ventas.getsIDProdcuto()));
            guardarNuevoProductoBD(ventas);
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
            FrmNuevaVenta nuevaVenta = FrmNuevaVenta.getInstancia();
            Producto producto = AlmacenProductos.getProducto(id);
            Connection connection = new ConnectionBD().connection();
            Statement statement = connection.createStatement();
            String query = "UPDATE producto SET  stock= '" + producto.getsStock() + "'  where id = '" + id + "'";
            int n = statement.executeUpdate(query);
            if (n > 0) {
                nuevaVenta.getTxtNombreProducto().setText("");
                nuevaVenta.getTxtStock().setText("");
                nuevaVenta.getTxtCantidad().setText("");
                nuevaVenta.getTxtPrecioTotal().setText("");
                nuevaVenta.getTxtPrecioUnidad().setText("");
                nuevaVenta.getTxtID().setText("");


            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void guardarNuevoProductoBD(Ventas ventas) {
        try {
            ConnectionBD connection = new ConnectionBD();
            String INSERT_ = "INSERT INTO ventas (id_venta, id, cantidad, fecha) value (?, ?, ?, ?)";
            Connection conn = connection.connection();
            PreparedStatement statement = conn.prepareStatement(INSERT_);
            statement.setInt(1, ventas.getsIDVenta());
            statement.setInt(2, ventas.getsIDProdcuto());
            statement.setInt(3, ventas.getsCantidad());
            statement.setDate(4, Date.valueOf(ventas.getFecha().toString()));
            System.out.println(ventas.getsCantidad());
            int iRespuestaSQL =  statement.executeUpdate();
            if (iRespuestaSQL > 0) {

            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

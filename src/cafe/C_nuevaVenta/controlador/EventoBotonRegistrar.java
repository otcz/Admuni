package cafe.C_nuevaVenta.controlador;

import cafe.C_nuevaVenta.modelo.Ventas;
import cafe.C_nuevaVenta.vista.FrmNuevaVenta;
import cafe.D_nuevoEditarProducto.control.AlmacenProductos;
import cafe.D_nuevoEditarProducto.modelo.Producto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoBotonRegistrar implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
        Ventas venta = new RecoletarDatosVenta().recolectar();
        Producto producto = AlmacenProductos.getProducto(Integer.parseInt(FrmNuevaVenta.getInstancia().getTxtID().getText()));
        int stock = Integer.parseInt(FrmNuevaVenta.getInstancia().getTxtStock().getText());
        int cantidad = Integer.parseInt(FrmNuevaVenta.getInstancia().getTxtCantidad().getText());
        int id=Integer.parseInt(FrmNuevaVenta.getInstancia().getTxtID().getText());

            if (venta != null&&stock>=cantidad&&cantidad>0) {
                MostrarDatosVentaEnTabla mostrarDatosVentaEnTabla = new MostrarDatosVentaEnTabla(venta);
                AlmacenarVenta.addVenta(venta);
                mostrarDatosVentaEnTabla.addVentaATable();

                FrmNuevaVenta.getInstancia().getTxtStock().setText(String.valueOf(stock - cantidad));
               // producto.setsStock(stock - cantidad);
                AlmacenProductos.setProducto(id,(stock - cantidad));

            }
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Verifica la información de la venta", "GUARDAR MUNICIÓN", JOptionPane.DEFAULT_OPTION,
                    new ImageIcon(getClass().getResource("/cafe/imagen/xRoja.png")));
        }
    }
}

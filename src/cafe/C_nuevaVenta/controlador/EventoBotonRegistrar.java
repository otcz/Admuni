package cafe.C_nuevaVenta.controlador;

import cafe.C_nuevaVenta.modelo.Venta;
import cafe.C_nuevaVenta.vista.FrmNuevaVenta;
import cafe.D_nuevoEditarProducto.modelo.Producto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoBotonRegistrar implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Venta venta = new RecoletarDatosVenta().recolectar();
        if (venta != null) {
            MostrarDatosVentaEnTabla mostrarDatosVentaEnTabla = new MostrarDatosVentaEnTabla(venta);
            AlmacenarNuevoProducto.addProducto(venta);
            mostrarDatosVentaEnTabla.addVentaATable();
            FrmNuevaVenta.getInstancia().getTxtStock().setText(String.valueOf(Integer.parseInt(FrmNuevaVenta.getInstancia().getTxtStock().getText()) - Integer.parseInt(venta.getsCantidad())));
          //  Producto producto =AlmacenProductos.getProducto(Integer.parseInt(FrmNuevaVenta.getInstancia().getTxtID().getText()));


        } else {
            JOptionPane.showMessageDialog(null, "Debes completar toda la información", "GUARDAR MUNICIÓN", JOptionPane.DEFAULT_OPTION,
                    new ImageIcon(getClass().getResource("/administrarMunicion/imagen/xRoja.png")));
        }
    }
}

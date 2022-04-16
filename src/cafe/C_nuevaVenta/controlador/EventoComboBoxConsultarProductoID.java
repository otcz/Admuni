package cafe.C_nuevaVenta.controlador;

import cafe.C_nuevaVenta.vista.FrmNuevaVenta;
import cafe.D_nuevoEditarProducto.control.AlmacenProductos;
import cafe.D_nuevoEditarProducto.modelo.Producto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoComboBoxConsultarProductoID implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Producto producto= AlmacenProductos.getProductos().get(FrmNuevaVenta.getInstancia().getCbProducto().getSelectedIndex());
            FrmNuevaVenta.getInstancia().getTxtID().setText(String.valueOf(producto.getsID()));
            FrmNuevaVenta.getInstancia().getTxtNombreProducto().setText(producto.getsNombreProducto());
            FrmNuevaVenta.getInstancia().getTxtPrecioUnidad().setText(String.valueOf(producto.getsPrecio()));
            FrmNuevaVenta.getInstancia().getTxtStock().setText(String.valueOf(producto.getsStock()));
        } catch (NumberFormatException i) {

        }
    }
}

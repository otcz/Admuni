package cafe.C_nuevaVenta.controlador;

import cafe.C_nuevaVenta.modelo.Venta;
import cafe.C_nuevaVenta.vista.FrmNuevaVenta;
import cafe.D_nuevoEditarProducto.control.AlmacenProductos;

import javax.swing.*;
import java.io.IOException;

public class RecoletarDatosVenta {

    public Venta recolectar() throws NumberFormatException {

        Venta ventas = new Venta();
        FrmNuevaVenta nuevaVenta = FrmNuevaVenta.getInstancia();
        if (nuevaVenta.getTxtID().getText().trim().isEmpty() | nuevaVenta.getTxtNombreProducto().getText().trim().isEmpty() |
                nuevaVenta.getTxtCantidad().getText().trim().isEmpty() | nuevaVenta.getTxtPrecioUnidad().getText().trim().isEmpty() |
                nuevaVenta.getTxtPrecioTotal().getText().trim().isEmpty()) {
            return null;
        } else {

            ventas.setsID(nuevaVenta.getTxtID().getText());
            ventas.setsNombreProducto(nuevaVenta.getTxtNombreProducto().getText());
            ventas.setsCantidad(nuevaVenta.getTxtCantidad().getText());
            ventas.setsPrecioUnidad(nuevaVenta.getTxtPrecioUnidad().getText());
            ventas.setsPrecioTotal(nuevaVenta.getTxtPrecioTotal().getText());
            return ventas;
        }
    }
}

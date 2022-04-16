package cafe.C_nuevaVenta.controlador;

import cafe.C_nuevaVenta.vista.FrmNuevaVenta;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventoTeclaCalculaPrecioTotal implements KeyListener {


    @Override
    public void keyTyped(KeyEvent e) {


    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        try {
            if (!FrmNuevaVenta.getInstancia().getTxtCantidad().getText().isEmpty()) {
                int cantidad = Integer.parseInt(FrmNuevaVenta.getInstancia().getTxtCantidad().getText());
                int precioUnidad = Integer.parseInt(FrmNuevaVenta.getInstancia().getTxtPrecioUnidad().getText());
                int stock = Integer.parseInt(FrmNuevaVenta.getInstancia().getTxtStock().getText());

                if (cantidad > stock) {
                    FrmNuevaVenta.getInstancia().getBtnRegistrar().setEnabled(false);
                } else {
                    FrmNuevaVenta.getInstancia().getBtnRegistrar().setEnabled(true);
                    FrmNuevaVenta.getInstancia().getTxtPrecioTotal().setText(String.valueOf((cantidad * precioUnidad)));
                }

            } else {
                FrmNuevaVenta.getInstancia().getTxtPrecioTotal().setText("");
            }


        } catch (NumberFormatException i) {

        }
    }


}

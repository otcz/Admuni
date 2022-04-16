package cafe.C_nuevaVenta.controlador;

import cafe.C_nuevaVenta.vista.FrmNuevaVenta;
import cafe.D_nuevoEditarProducto.control.AlmacenProductos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventoTeclaConsultarProductoID implements KeyListener {
    int keyEventTipo;


    public EventoTeclaConsultarProductoID(int keyEventTipo) {
        this.keyEventTipo = keyEventTipo;

    }

    public EventoTeclaConsultarProductoID() {

    }

    @Override
    public void keyTyped(KeyEvent e) {


    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        try {
            if (!FrmNuevaVenta.getInstancia().getTxtID().getText().isEmpty()) {
                for (int i = 0; i < AlmacenProductos.getProductos().size(); i++) {
                    if (Integer.parseInt(FrmNuevaVenta.getInstancia().getTxtID().getText()) == AlmacenProductos.getProductos().get(i).getsID()) {
                        FrmNuevaVenta.getInstancia().getTxtNombreProducto().setText(AlmacenProductos.getProductos().get(i).getsNombreProducto());
                        FrmNuevaVenta.getInstancia().getTxtPrecioUnidad().setText(String.valueOf(AlmacenProductos.getProductos().get(i).getsPrecio()));
                        FrmNuevaVenta.getInstancia().getTxtStock().setText(String.valueOf(AlmacenProductos.getProductos().get(i).getsStock()));
                        i = AlmacenProductos.getProductos().size() - 1;

                    } else {
                        limpiarCampos();
                    }
                }
            } else {
                limpiarCampos();
            }

        } catch (NumberFormatException i) {

        }
    }

    public void limpiarCampos() {
        FrmNuevaVenta.getInstancia().getTxtNombreProducto().setText("");
        FrmNuevaVenta.getInstancia().getTxtPrecioUnidad().setText("");
        FrmNuevaVenta.getInstancia().getTxtPrecioTotal().setText("");
        FrmNuevaVenta.getInstancia().getTxtStock().setText("");
    }

    public int getKeyEventTipo() {
        return keyEventTipo;
    }

    public void setKeyEventTipo(int keyEventTipo) {
        this.keyEventTipo = keyEventTipo;
    }
}

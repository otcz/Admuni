package cafe.C_nuevaVenta.controlador;

import cafe.D_nuevoProducto.vista.FrmCrearNuevoProducto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoBotonNuevaVenta implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        FrmCrearNuevoProducto crearNuevoProducto = FrmCrearNuevoProducto.getInstancia();
        crearNuevoProducto.setVisible(true);
    }
}

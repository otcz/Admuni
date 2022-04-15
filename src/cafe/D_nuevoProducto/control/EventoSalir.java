package cafe.D_nuevoProducto.control;

import cafe.D_nuevoProducto.vista.FrmCrearNuevoProducto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoSalir implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        FrmCrearNuevoProducto crearTipoMuni= FrmCrearNuevoProducto.getInstancia();
        crearTipoMuni.setVisible(false);

    }
}

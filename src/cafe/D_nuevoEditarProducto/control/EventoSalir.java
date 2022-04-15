package cafe.D_nuevoEditarProducto.control;

import cafe.D_nuevoEditarProducto.vista.FrmCrearNuevoProducto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoSalir implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        FrmCrearNuevoProducto crearTipoMuni= FrmCrearNuevoProducto.getInstancia();
        crearTipoMuni.setVisible(false);

    }
}

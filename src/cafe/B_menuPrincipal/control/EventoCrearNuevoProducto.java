package cafe.B_menuPrincipal.control;

import cafe.D_nuevoProducto.vista.FrmCrearNuevoProducto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoCrearNuevoProducto implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        FrmCrearNuevoProducto nuevoTipoMunicion = FrmCrearNuevoProducto.getInstancia();
        nuevoTipoMunicion.setVisible(true);
    }
}

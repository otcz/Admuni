package municione.C_nuevoRegistro.controlador;

import municione.D_nuevoTipoMunicion.vista.CrearNuevoTipoMunicion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoBotonNuevoTipoMuni implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        CrearNuevoTipoMunicion crearNuevoTipoMunicion = CrearNuevoTipoMunicion.getInstancia();
        crearNuevoTipoMunicion.setVisible(true);
    }
}

package municione.B_menuPrincipal.control;

import municione.B_menuPrincipal.vista.Principal;
import municione.C_nuevoRegistro.vista.NuevoRegistro;
import municione.D_nuevoTipoMunicion.vista.CrearNuevoTipoMunicion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoCrearTipoMuni implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        CrearNuevoTipoMunicion nuevoTipoMunicion = CrearNuevoTipoMunicion.getInstancia();
        nuevoTipoMunicion.setVisible(true);
    }
}

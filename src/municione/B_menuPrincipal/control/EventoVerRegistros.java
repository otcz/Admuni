package municione.B_menuPrincipal.control;

import municione.D_nuevoTipoMunicion.vista.CrearNuevoTipoMunicion;
import municione.E_verRegistro.vista.VerRegistro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoVerRegistros implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        VerRegistro verRegistro = VerRegistro.getInstancia();
        verRegistro.setVisible(true);
    }
}

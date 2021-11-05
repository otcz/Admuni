package municione.D_nuevoTipoMunicion.control;

import municione.C_nuevoRegistro.vista.NuevoRegistro;
import municione.D_nuevoTipoMunicion.modelo.GuardarTipoMuni;
import municione.D_nuevoTipoMunicion.modelo.TipoMuni;
import municione.D_nuevoTipoMunicion.vista.CrearNuevoTipoMunicion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoBotonGuardarLote implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        new GuardarTipoMuni();
    }
}

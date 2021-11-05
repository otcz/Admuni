package municione.B_menuPrincipal.control;

import municione.E_verRegistro.vista.VerRegistro;
import municione.F_estadisticaLoteMuni.vista.LoteMuni;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoEstadisticaLoteMuni implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        LoteMuni loteMuni = LoteMuni.getInstancia();
        loteMuni.setVisible(true);
    }
}

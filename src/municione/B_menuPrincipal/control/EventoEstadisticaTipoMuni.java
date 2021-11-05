package municione.B_menuPrincipal.control;

import municione.F_estadisticaLoteMuni.vista.LoteMuni;
import municione.G_estadisticaTipoMuni.vista.TipoMuni;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoEstadisticaTipoMuni implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        TipoMuni tipoMuni = TipoMuni.getInstancia();
        tipoMuni.setVisible(true);
    }
}

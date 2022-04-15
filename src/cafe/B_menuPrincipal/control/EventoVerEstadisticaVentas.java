package cafe.B_menuPrincipal.control;

import cafe.F_estadisticaVentas.vista.FrmVerEstadisticaVentas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoVerEstadisticaVentas implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        FrmVerEstadisticaVentas estadisticaVentas = new FrmVerEstadisticaVentas();
        estadisticaVentas.setVisible(true);
    }
}

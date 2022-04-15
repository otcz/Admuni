package cafe.B_menuPrincipal.control;

import cafe.E_verProductos.vista.FrmVerProductos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoVerProductos implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        FrmVerProductos verRegistro = FrmVerProductos.getInstancia();
        verRegistro.setVisible(true);
    }
}

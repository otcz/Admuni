package cafe.B_menuPrincipal.control;

import cafe.B_menuPrincipal.vista.FrmPrincipal;
import cafe.C_nuevaVenta.vista.FrmNuevaVenta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoMenuNuevoVenta implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        FrmNuevaVenta nuevaVenta = FrmNuevaVenta.getInstancia();
        FrmPrincipal principal = FrmPrincipal.getInstancia();
        principal.setVisible(false);
        nuevaVenta.setVisible(true);
    }
}

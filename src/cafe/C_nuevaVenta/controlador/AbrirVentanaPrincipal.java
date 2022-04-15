package cafe.C_nuevaVenta.controlador;

import cafe.B_menuPrincipal.vista.FrmPrincipal;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AbrirVentanaPrincipal implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        FrmPrincipal principal = FrmPrincipal.getInstancia();
        principal.setVisible(true);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}

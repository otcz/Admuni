package municione.inicio.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValidarUsuario implements ActionListener {

    String usuario, clave;
    DatosUsuarioBD datosUsuarioBD = new DatosUsuarioBD();

    public ValidarUsuario(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (usuario.equals(datosUsuarioBD.getUsurio()) && clave.equals(datosUsuarioBD.getClave())) {
            
        }
    }
}

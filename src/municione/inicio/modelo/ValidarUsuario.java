package municione.inicio.modelo;

import municione.MenuPrincipal.vista.Principal;
import municione.inicio.vista.Inicio;

import javax.swing.*;

public class ValidarUsuario {
    public void ValidarUsuario(String usuario, String clave) {
        if (usuario.equals(DatosUsuarioBD.usurio) && clave.equals(DatosUsuarioBD.clave)) {
            Inicio inicio = Inicio.getInstancia();
            inicio.setVisible(false);
            Principal principal = Principal.getInstancia();
            principal.setVisible(true);
        } else if (usuario.trim().isEmpty() || clave.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Datos vacios!", "VALIDACIÓN USUARIO", JOptionPane.DEFAULT_OPTION,
                    new ImageIcon(getClass().getResource("/municione/imagen/xRoja.png")));
        } else {
            JOptionPane.showMessageDialog(null, "Verificar usuario y contraseña", "VALIDACIÓN USUARIO", JOptionPane.DEFAULT_OPTION,
                    new ImageIcon(getClass().getResource("/municione/imagen/Userx.png")));
        }
    }
}

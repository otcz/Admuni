package cafe.A_inicio.modelo;

import cafe.B_menuPrincipal.vista.FrmPrincipal;
import cafe.A_inicio.vista.FrmInicio;

import javax.swing.*;

public class ValidarUsuario {
    public void ValidarUsuario(String usuario, String clave) {
        DatosUsuarioBD datosUsuarioBD=new DatosUsuarioBD();
        if (usuario.equals(datosUsuarioBD.usurio) && clave.equals(datosUsuarioBD.clave)) {
            FrmInicio inicio = FrmInicio.getInstancia();
            inicio.setVisible(false);
            FrmPrincipal principal = FrmPrincipal.getInstancia();
            principal.setVisible(true);
        } else if (usuario.trim().isEmpty() || clave.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Datos vacios!", "VALIDACIÓN USUARIO", JOptionPane.DEFAULT_OPTION,
                    new ImageIcon(getClass().getResource("/cafe/imagen/xRoja.png")));
        } else {
            JOptionPane.showMessageDialog(null, "Verificar usuario y contraseña", "VALIDACIÓN USUARIO", JOptionPane.DEFAULT_OPTION,
                    new ImageIcon(getClass().getResource("/cafe/imagen/Userx.png")));
        }
    }
}

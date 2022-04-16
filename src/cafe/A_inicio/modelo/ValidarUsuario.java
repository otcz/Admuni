package cafe.A_inicio.modelo;

import cafe.A_inicio.control.IniciarAlmacenProductos;
import cafe.A_BD.ConnectionBD;
import cafe.B_menuPrincipal.vista.FrmPrincipal;
import cafe.A_inicio.vista.FrmInicio;

import javax.swing.*;

public class ValidarUsuario {
    public void ValidarUsuario(String usuario, String clave) {
        DatosUsuarioBD datosUsuarioBD=new DatosUsuarioBD();
        if (usuario.equals(datosUsuarioBD.getUsurio()) && clave.equals(datosUsuarioBD.getClave())) {
            FrmInicio inicio = FrmInicio.getInstancia();
            inicio.setVisible(false);
            FrmPrincipal principal = FrmPrincipal.getInstancia();
            principal.setVisible(true);
            IniciarAlmacenProductos.obtenerProductos(new ConnectionBD().connection());
        } else if (usuario.trim().isEmpty() || clave.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Datos vacios!", "VALIDACIÓN USUARIO", JOptionPane.DEFAULT_OPTION,
                    new ImageIcon(getClass().getResource("/cafe/imagen/xRoja.png")));
        } else {
            JOptionPane.showMessageDialog(null, "Verificar usuario y contraseña", "VALIDACIÓN USUARIO", JOptionPane.DEFAULT_OPTION,
                    new ImageIcon(getClass().getResource("/cafe/imagen/Userx.png")));
        }
    }
}

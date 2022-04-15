package cafe.D_nuevoProducto.modelo;

import cafe.D_nuevoProducto.vista.FrmCrearNuevoProducto;

import javax.swing.*;

public class GuardarNuevoProducto {
    public GuardarNuevoProducto() {
        FrmCrearNuevoProducto crearNuevoProducto = FrmCrearNuevoProducto.getInstancia();
        if (!crearNuevoProducto.getTxtID().getText().trim().isEmpty()) {
            //TipoMuni tipoMuni = new TipoMuni();
            //tipoMuni.setLote(crearNuevoTipoMunicion.getTextTipoLote().getText());
            //AlmacenTipoMuni.addTipoMuni(tipoMuni);
            //crearNuevoTipoMunicion.getCbTiposMuni().addItem(crearNuevoTipoMunicion.getTextTipoLote().getText());
            //NuevoRegistro nuevoRegistro = NuevoRegistro.getInstancia();
            //nuevoRegistro.getCbTipoMuni().addItem(crearNuevoTipoMunicion.getTextTipoLote().getText());
            //JOptionPane.showMessageDialog(null, "Registro exitoso!", "GUARDAR TIPO MUNICIÓN", JOptionPane.DEFAULT_OPTION,
            //        new ImageIcon(getClass().getResource("/administrarMunicion/imagen/Guardar.png")));
            //crearNuevoTipoMunicion.getCbTiposMuni().showPopup();

        } else {
            JOptionPane.showMessageDialog(null, "Debes completar toda la información", "GUARDAR TIPO MUNICIÓN", JOptionPane.DEFAULT_OPTION,
                    new ImageIcon(getClass().getResource("/administrarMunicion/imagen/xRoja.png")));
        }
    }

}

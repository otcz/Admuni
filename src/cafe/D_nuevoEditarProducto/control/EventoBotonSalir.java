package cafe.D_nuevoEditarProducto.control;

import cafe.D_nuevoEditarProducto.vista.FrmEditarProducto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoBotonSalir implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        FrmEditarProducto editarProducto = FrmEditarProducto.getInstancia();
        editarProducto.setVisible(false);
    }
}

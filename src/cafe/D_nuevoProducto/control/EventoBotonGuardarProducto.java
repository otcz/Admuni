package cafe.D_nuevoProducto.control;

import cafe.D_nuevoProducto.modelo.GuardarNuevoProducto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoBotonGuardarProducto implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        new GuardarNuevoProducto();
    }
}

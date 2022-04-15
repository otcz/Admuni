package cafe.D_nuevoEditarProducto.control;

import cafe.D_nuevoEditarProducto.modelo.tabla.GuardarNuevoProducto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoBotonGuardarProducto implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        new GuardarNuevoProducto();
    }
}

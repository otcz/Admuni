package cafe.C_nuevaVenta.controlador;

import cafe.C_nuevaVenta.modelo.Venta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoBotonRegistrar implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Venta venta = new RecoletarDatosVenta().recolectar();
        if (venta != null) {
            MostrarDatosVentaEnTabla mostrarDatosVentaEnTabla = new MostrarDatosVentaEnTabla(venta);
            AlmacenarNuevoProducto.addProducto(venta);
            mostrarDatosVentaEnTabla.addVentaATable();
        } else {
            JOptionPane.showMessageDialog(null, "Debes completar toda la información", "GUARDAR MUNICIÓN", JOptionPane.DEFAULT_OPTION,
                    new ImageIcon(getClass().getResource("/administrarMunicion/imagen/xRoja.png")));
        }
    }
}

package cafe.B_menuPrincipal.control;

import cafe.C_nuevaVenta.controlador.AlmacenarVenta;
import cafe.C_nuevaVenta.modelo.Ventas;
import cafe.D_nuevoEditarProducto.control.AlmacenProductos;
import cafe.D_nuevoEditarProducto.modelo.Producto;
import cafe.E_verProductos.vista.FrmVerProductos;
import cafe.F_estadisticaVentas.vista.FrmVerEstadisticaVentas;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EventoVerEstadisticaVentas implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        FrmVerEstadisticaVentas estadisticaVentas = new FrmVerEstadisticaVentas();
        estadisticaVentas.setVisible(true);

    }



}

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

public class EventoVerProductos implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        FrmVerProductos verRegistro = FrmVerProductos.getInstancia();
        verRegistro.setVisible(true);
        addVentaATable();
    }
    public void addVentaATable() {
        FrmVerProductos verProductos = FrmVerProductos.getInstancia();
        DefaultTableModel model = (DefaultTableModel) verProductos.getJtRegistros().getModel();
        for (int rowCount = model.getRowCount() - 1; rowCount >= 0; rowCount--) {
            model.removeRow(rowCount);
        }
        for (int i = 0; i < AlmacenProductos.getProductos().size(); i++) {
            Producto producto = AlmacenProductos.getProductos().get(i);
            model.addRow(producto.getPropiedades());
        }

    }
}

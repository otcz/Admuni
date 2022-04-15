package cafe.E_verProductos.control;

import cafe.C_nuevaVenta.controlador.AlmacenarNuevoProducto;
import cafe.C_nuevaVenta.modelo.Venta;
import cafe.E_verProductos.vista.FrmVerProductos;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class PonerRegistrosEnTabla {

    public void ventas() {
        ArrayList<Venta> municions = AlmacenarNuevoProducto.getArrayList();
        FrmVerProductos verRegistro = FrmVerProductos.getInstancia();
        DefaultTableModel defaultTableModel = (DefaultTableModel) verRegistro.getJtRegistros().getModel();
        for (int i = 0; i < defaultTableModel.getRowCount(); i++) {
            defaultTableModel.removeRow(i);
        }

        for (int i = 0; i < municions.size(); i++) {
            Venta municion = municions.get(i);
            defaultTableModel.addRow(municion.venta());
        }
    }

}

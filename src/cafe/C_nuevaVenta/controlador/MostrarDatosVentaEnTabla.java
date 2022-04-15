package cafe.C_nuevaVenta.controlador;

import cafe.C_nuevaVenta.modelo.Venta;
import cafe.C_nuevaVenta.vista.FrmNuevaVenta;
import cafe.E_verProductos.control.PonerRegistrosEnTabla;

import javax.swing.table.DefaultTableModel;

public class MostrarDatosVentaEnTabla {
    Venta venta;

    public MostrarDatosVentaEnTabla(Venta venta) {
        this.venta = venta;
    }

    public void addVentaATable() {
        FrmNuevaVenta nuevaVenta = FrmNuevaVenta.getInstancia();
        DefaultTableModel model = (DefaultTableModel) nuevaVenta.getJtResgistro().getModel();
        model.addRow(getVenta().venta());
        nuevaVenta.limpiarCampos();
        PonerRegistrosEnTabla ponerRegistrosEnTabla= new PonerRegistrosEnTabla();
        ponerRegistrosEnTabla.ventas();
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
}

package cafe.C_nuevaVenta.controlador;

import cafe.C_nuevaVenta.modelo.Ventas;
import cafe.C_nuevaVenta.vista.FrmNuevaVenta;
import cafe.E_verProductos.control.PonerRegistrosEnTabla;

import javax.swing.table.DefaultTableModel;

public class MostrarDatosVentaEnTabla {
    Ventas venta;

    public MostrarDatosVentaEnTabla(Ventas venta) {
        this.venta = venta;
    }

    public void addVentaATable() {
        FrmNuevaVenta nuevaVenta = FrmNuevaVenta.getInstancia();
        DefaultTableModel model = (DefaultTableModel) nuevaVenta.getJtResgistro().getModel();
        model.addRow(getVenta().venta());
        PonerRegistrosEnTabla ponerRegistrosEnTabla= new PonerRegistrosEnTabla();
        ponerRegistrosEnTabla.ventas();
    }

    public Ventas getVenta() {
        return venta;
    }

    public void setVenta(Ventas venta) {
        this.venta = venta;
    }
}

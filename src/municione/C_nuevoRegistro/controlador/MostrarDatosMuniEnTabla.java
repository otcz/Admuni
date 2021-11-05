package municione.C_nuevoRegistro.controlador;

import municione.C_nuevoRegistro.modelo.Municion;
import municione.C_nuevoRegistro.vista.NuevoRegistro;

import javax.swing.table.DefaultTableModel;

public class MostrarDatosMuniEnTabla {
    Municion municion;

    public MostrarDatosMuniEnTabla(Municion municion) {
        this.municion = municion;
    }

    public void addMuniToTable() {
        NuevoRegistro nuevoRegistro = NuevoRegistro.getInstancia();
        DefaultTableModel model = (DefaultTableModel) nuevoRegistro.getJtResgistro().getModel();
        model.addRow(getMunicion().municio());
    }

    public Municion getMunicion() {
        return municion;
    }

    public void setMunicion(Municion municion) {
        this.municion = municion;
    }
}

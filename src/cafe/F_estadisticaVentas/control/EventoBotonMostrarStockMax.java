package cafe.F_estadisticaVentas.control;

import cafe.A_BD.ConnectionBD;
import cafe.E_verProductos.vista.FrmVerProductos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EventoBotonMostrarStockMax {
    public EventoBotonMostrarStockMax() {
        FrmVerProductos frmVerProductos=FrmVerProductos.getInstancia();

        try {
            Connection con = new ConnectionBD().connection();
            String SQL = "SELECT MAX(stock) FROM producto";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                frmVerProductos.getLbBuscar().setText(rs.getObject(1).toString());
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

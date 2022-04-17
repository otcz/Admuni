package cafe.C_nuevaVenta.controlador;

import cafe.A_BD.ConnectionBD;
import cafe.F_estadisticaVentas.vista.FrmVerEstadisticaVentas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EventoBuscarMayorStock implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        FrmVerEstadisticaVentas estadisticaVentas=FrmVerEstadisticaVentas.getInstancia();

        estadisticaVentas.getLbBuscar().setText("Max de ventas de "+maximoValorDe("nombre_prodcuto"));


    }




    public static String maximoValorDe(String st) {
        try {
            ConnectionBD connectionBD = new ConnectionBD();
            Connection con = connectionBD.connection();
            String SQL = "select MAX("+st+") from ventas";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {

               return rs.getString(1);

            }

            rs.close();
            stmt.close();


        } catch (SQLException r) {

        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(maximoValorDe("nombre_producto"));

    }
}

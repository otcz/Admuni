package cafe.C_nuevaVenta.controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TraerProductosBD {

    public TraerProductosBD() {

    }

    public void ejecutarConsulta(Connection con) {
        try {
            String SQL = "SELECT * FROM login";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
               //usurio = rs.getString("usuario");
               //clave = rs.getString("clave");
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

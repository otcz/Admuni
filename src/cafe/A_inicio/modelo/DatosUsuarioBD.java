package cafe.A_inicio.modelo;

import cafe.BD.ConnectionBD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatosUsuarioBD {

    ConnectionBD connectionBD = new ConnectionBD();

    public DatosUsuarioBD() {
        ejecutarConsulta(connectionBD.connection());
        System.out.println("OSCAR");
    }

    public static String usurio = null, clave = null;


    public void ejecutarConsulta(Connection con) {
        try {
            String SQL = "SELECT * FROM login";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                usurio = rs.getString("usuario");
                clave = rs.getString("clave");
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

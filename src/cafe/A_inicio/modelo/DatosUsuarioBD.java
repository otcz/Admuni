package cafe.A_inicio.modelo;

import cafe.A_BD.ConnectionBD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatosUsuarioBD {

    private  String usurio = null, clave = null;

    ConnectionBD connectionBD = new ConnectionBD();

    public DatosUsuarioBD() {
        ejecutarConsulta(connectionBD.connection());
    }


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


    public String getUsurio() {
        return usurio;
    }

    public void setUsurio(String usurio) {
        this.usurio = usurio;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public ConnectionBD getConnectionBD() {
        return connectionBD;
    }

    public void setConnectionBD(ConnectionBD connectionBD) {
        this.connectionBD = connectionBD;
    }
}

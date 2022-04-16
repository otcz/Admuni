package cafe.A_BD;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionBD {

    public Connection connection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10485901", "sql10485901", "898CxAtiPM");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("show databases;");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay conexión al servidor", "SERVIFOR", JOptionPane.DEFAULT_OPTION,
                    new ImageIcon(getClass().getResource("/cafe/imagen/Userx.png")));
        }
       return con;
    }

}

package cafe.A_inicio.control;

import cafe.D_nuevoEditarProducto.control.AlmacenProductos;
import cafe.D_nuevoEditarProducto.modelo.Producto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class IniciarAlmacenProductos {

    public static void obtenerProductos(Connection con) {


        try {
            String SQL = "SELECT * FROM producto";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                Producto producto=new Producto();
                producto.setsID(rs.getInt("id"));
                producto.setsNombreProducto(rs.getString("nombre_producto"));
                producto.setsReferencia(rs.getString("referencia"));
                producto.setsPrecio(rs.getInt("precio"));
                producto.setsPeso(rs.getInt("Peso"));
                producto.setsCategoria(rs.getString("Categoría"));
                producto.setsStock(rs.getInt("Stock"));
                producto.setsFecha(rs.getDate("fecha").toLocalDate());
                AlmacenProductos.addProducto(producto);

            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

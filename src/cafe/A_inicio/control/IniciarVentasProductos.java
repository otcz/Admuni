package cafe.A_inicio.control;

import cafe.A_BD.ConnectionBD;
import cafe.C_nuevaVenta.controlador.AlmacenarVenta;
import cafe.C_nuevaVenta.modelo.Ventas;
import cafe.D_nuevoEditarProducto.control.AlmacenProductos;
import cafe.D_nuevoEditarProducto.modelo.Producto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class IniciarVentasProductos {

    public static void obtenerProductos(Connection con) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String SQL = "SELECT * FROM producto";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(SQL);
                    while (rs.next()) {
                        Producto producto = new Producto();
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

                }
            }
        });
        thread.start();
    }

    public static void obtenerVentas(Connection con) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Connection con = new ConnectionBD().connection();
                    String SQL = "SELECT * FROM ventas, producto WHERE ventas.id=producto.id";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(SQL);

                    while (rs.next()) {
                        Ventas producto = new Ventas();
                        producto.setsIDProdcuto(rs.getInt("id"));
                        producto.setsIDVenta(rs.getInt("id"));
                        producto.setsNombreProducto(rs.getString("nombre_producto"));
                        producto.setCategoria(rs.getString("Categoría"));
                        producto.setsPrecioUnidad(rs.getInt("precio"));
                        producto.setsCantidad(rs.getInt("cantidad"));
                        producto.setsPrecioTotal(producto.getsPrecioUnidad() * producto.getsCantidad());
                        producto.setPeso(rs.getInt("peso"));
                        producto.setFecha(rs.getDate("fecha").toLocalDate());
                        AlmacenarVenta.addVenta(producto);
                        AlmacenarVenta.idVenta++;
                    }
                    rs.close();
                    stmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        thread.start();
    }


}

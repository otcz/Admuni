El programa KONECTA – CAFE permite hacer el registro, visualización y venta de productos.
Realiza las consultas a una base de datos MySQL alojadas en un servidor personal.
La copia de la BD se encuentra en la siguiente carpeta: src\cafe\A_BD\sql10485901.sql

El usuario es KONECTA
La clave es: 2022

Se emplean sentencia básica para los ataques de entrada y salida de datos como la siguiente.
String SQL = "SELECT * FROM login";

String query = "UPDATE producto SET  stock= '" + producto.getsStock() + "'  where id = '" + id + "'";


PRODCUTO MAS VENDIDO
String SQL = "SELECT SUM( DISTINCT cantidad) FROM ventas;";


PRODUCTO CON MAYOR STOCK
"SELECT MAX(stock) FROM producto"







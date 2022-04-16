package cafe.D_nuevoEditarProducto.control;

import cafe.D_nuevoEditarProducto.modelo.Producto;

import java.util.ArrayList;

public class AlmacenProductos {
    public static ArrayList<Producto> productos = new ArrayList();

    public static boolean addProducto(Producto tipoMuni) {
        return productos.add(tipoMuni);
    }

    public static Producto getProducto(int i) {
        return productos.get(i);
    }

    public static ArrayList<Producto> getProductos() {
        return productos;
    }

    public static void setProductos(ArrayList<Producto> productos) {
        AlmacenProductos.productos = productos;
    }
}
package cafe.D_nuevoEditarProducto.control;

import cafe.D_nuevoEditarProducto.modelo.Producto;

import java.util.ArrayList;

public class AlmacenProductos {
    public static ArrayList<Producto> productos = new ArrayList();

    public static boolean addProducto(Producto producto) {
        return productos.add(producto);
    }

    public static void setProducto(int idProdcuto, int stock) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getsID() == idProdcuto) {
                productos.get(i).setsStock(stock);
            }
        }
    }

    public static Producto getProducto(int idProducto) {
        for (int i1 = 0; i1 < productos.size(); i1++) {
            if (productos.get(i1).getsID() == idProducto) {
                return productos.get(i1);
            }
        }
        return null;

    }

    public static ArrayList<Producto> getProductos() {
        return productos;
    }

    public static void setProductos(ArrayList<Producto> productos) {
        AlmacenProductos.productos = productos;
    }
}
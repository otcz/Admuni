package cafe.D_nuevoEditarProducto.control;

import cafe.D_nuevoEditarProducto.modelo.Producto;

import java.util.ArrayList;

public class AlmacenProductos {
    public static ArrayList<Producto> arrayList = new ArrayList();

    public static boolean addTipoMuni(Producto tipoMuni) {
        return arrayList.add(tipoMuni);
    }

    public static ArrayList<Producto> getArrayList() {
        return arrayList;
    }

    public static void setArrayList(ArrayList<Producto> arrayList) {
        AlmacenProductos.arrayList = arrayList;
    }
}

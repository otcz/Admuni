package cafe.D_nuevoProducto.control;

import cafe.D_nuevoProducto.modelo.Producto;

import java.util.ArrayList;

public class AlmacenTipoMuni {
    public static ArrayList<Producto> arrayList = new ArrayList();

    public static boolean addTipoMuni(Producto tipoMuni) {
        return arrayList.add(tipoMuni);
    }

    public static ArrayList<Producto> getArrayList() {
        return arrayList;
    }

    public static void setArrayList(ArrayList<Producto> arrayList) {
        AlmacenTipoMuni.arrayList = arrayList;
    }
}

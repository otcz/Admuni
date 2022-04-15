package cafe.C_nuevaVenta.controlador;

import cafe.C_nuevaVenta.modelo.Venta;

import java.util.ArrayList;

public class AlmacenarNuevoProducto {
    public static ArrayList<Venta> arrayList = new ArrayList();

    public static boolean addProducto(Venta venta) {
        return arrayList.add(venta);
    }

    public static ArrayList<Venta> getArrayList() {
        return arrayList;
    }

    public static void setArrayList(ArrayList<Venta> arrayList) {
        AlmacenarNuevoProducto.arrayList = arrayList;
    }
}

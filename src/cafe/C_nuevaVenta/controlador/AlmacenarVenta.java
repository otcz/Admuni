package cafe.C_nuevaVenta.controlador;

import cafe.C_nuevaVenta.modelo.Ventas;

import java.util.ArrayList;

public class AlmacenarVenta {
    public static ArrayList<Ventas> ventas = new ArrayList();

    public static boolean addVenta(Ventas venta) {
        return ventas.add(venta);
    }

    public static ArrayList<Ventas> getVentas() {
        return ventas;
    }

    public  void setVentas(ArrayList<Ventas> ventas) {
        AlmacenarVenta.ventas = ventas;
    }


}

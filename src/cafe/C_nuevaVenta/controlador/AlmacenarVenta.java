package cafe.C_nuevaVenta.controlador;

import cafe.C_nuevaVenta.modelo.Ventas;

import java.util.ArrayList;

public class AlmacenarVenta {
    public static ArrayList<Ventas> ventas = new ArrayList();
    public static ArrayList<Ventas> ventasEstadistica = new ArrayList<>();
    public static int idVenta = 0;


    public static boolean addVenta(Ventas venta) {
        return ventas.add(venta);
    }

    public static Ventas getVentas(int idVenta) {
        for (int i1 = 0; i1 < ventas.size(); i1++) {
            if (ventas.get(i1).getsIDVenta() == idVenta) {
                return ventas.get(i1);
            }
        }
        return null;

    }


    public static ArrayList<Ventas> getVentas() {
        return ventas;
    }





    public void setVentas(ArrayList<Ventas> ventas) {
        AlmacenarVenta.ventas = ventas;
    }


}

package cafe.C_nuevaVenta.modelo;

import java.util.ArrayList;

public class Ventas {
    String sID, sNombreProducto, sPrecioUnidad, sPrecioTotal, sCantidad;
    ArrayList Ventas = new ArrayList();


    public Object[] venta() {
        Object[] object = new Object[]{getsID(), getsNombreProducto(), getsCantidad(), getsPrecioUnidad(), getsPrecioTotal(),};
        Ventas.add(object);
        return object;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public String getsNombreProducto() {
        return sNombreProducto;
    }

    public void setsNombreProducto(String sNombreProducto) {
        this.sNombreProducto = sNombreProducto;
    }

    public String getsPrecioUnidad() {
        return sPrecioUnidad;
    }

    public void setsPrecioUnidad(String sPrecioUnidad) {
        this.sPrecioUnidad = sPrecioUnidad;
    }

    public String getsPrecioTotal() {
        return sPrecioTotal;
    }

    public void setsPrecioTotal(String sPrecioTotal) {
        this.sPrecioTotal = sPrecioTotal;
    }

    public String getsCantidad() {
        return sCantidad;
    }

    public void setsCantidad(String sCantidad) {
        this.sCantidad = sCantidad;
    }
}

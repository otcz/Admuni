package cafe.C_nuevaVenta.modelo;

public class Venta {
    String sID, sNombreProducto, sFecha, sStock;

    public Venta() {

    }
    public Object [] venta()
    {
        return new Object[]{getsID(), getsNombreProducto(), getsFecha(), getsStock()};
    }

    public Object [] tipoMuni()
    {
        return new Object[]{ getsNombreProducto(), getsFecha(), getsStock()};
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

    public String getsFecha() {
        return sFecha;
    }

    public void setsFecha(String sFecha) {
        this.sFecha = sFecha;
    }

    public String getsStock() {
        return sStock;
    }

    public void setsStock(String sStock) {
        this.sStock = sStock;
    }

}

package cafe.D_nuevoProducto.modelo;

import java.util.ArrayList;

public class Producto {
    ArrayList<Producto> productos = new ArrayList<>();
    String sID;
    String sNombreProducto;
    String sReferencia;
    String sPrecio;
    String sPeso;
    String sCategoria;
    String sStock;
    String sFecha;

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
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

    public String getsReferencia() {
        return sReferencia;
    }

    public void setsReferencia(String sReferencia) {
        this.sReferencia = sReferencia;
    }

    public String getsPrecio() {
        return sPrecio;
    }

    public void setsPrecio(String sPrecio) {
        this.sPrecio = sPrecio;
    }

    public String getsPeso() {
        return sPeso;
    }

    public void setsPeso(String sPeso) {
        this.sPeso = sPeso;
    }

    public String getsCategoria() {
        return sCategoria;
    }

    public void setsCategoria(String sCategoria) {
        this.sCategoria = sCategoria;
    }

    public String getsStock() {
        return sStock;
    }

    public void setsStock(String sStock) {
        this.sStock = sStock;
    }

    public String getsFecha() {
        return sFecha;
    }

    public void setsFecha(String sFecha) {
        this.sFecha = sFecha;
    }
}

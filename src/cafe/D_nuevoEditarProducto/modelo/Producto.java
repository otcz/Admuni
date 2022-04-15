package cafe.D_nuevoEditarProducto.modelo;

import java.util.ArrayList;
import java.util.Date;

public class Producto {
    ArrayList<Producto> productos = new ArrayList<>();
    int sID;
    String sNombreProducto;
    String sReferencia;
    int sPrecio;
    int sPeso;
    String sCategoria;
    int sStock;
    Date sFecha;

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
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

    public String getsCategoria() {
        return sCategoria;
    }

    public void setsCategoria(String sCategoria) {
        this.sCategoria = sCategoria;
    }

    public int getsStock() {
        return sStock;
    }

    public void setsStock(int sStock) {
        this.sStock = sStock;
    }

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public int getsPrecio() {
        return sPrecio;
    }

    public void setsPrecio(int sPrecio) {
        this.sPrecio = sPrecio;
    }

    public int getsPeso() {
        return sPeso;
    }

    public void setsPeso(int sPeso) {
        this.sPeso = sPeso;
    }

    public Date getsFecha() {
        return sFecha;
    }

    public void setsFecha(Date sFecha) {
        this.sFecha = sFecha;
    }
}

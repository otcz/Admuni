package cafe.C_nuevaVenta.modelo;

import java.time.LocalDate;


public class Ventas {
    String sNombreProducto,sReferencia,categoria;
    int sPrecioUnidad, sPrecioTotal, sCantidad, sIDProdcuto, sIDVenta,peso;
    LocalDate fecha;

    Object[] propiedades;

    public Object[] objetoVentaParaTabla() {
        Object[] object = new Object[]{getsIDVenta(), getsIDProdcuto(), getsNombreProducto(), getsCantidad(), getsPrecioUnidad(), getsPrecioTotal(),};
        return object;
    }


    public int getsIDProdcuto() {
        return sIDProdcuto;
    }

    public void setsIDProdcuto(int sIDProdcuto) {
        this.sIDProdcuto = sIDProdcuto;
    }

    public String getsNombreProducto() {
        return sNombreProducto;
    }

    public void setsNombreProducto(String sNombreProducto) {
        this.sNombreProducto = sNombreProducto;
    }

    public int getsPrecioUnidad() {
        return sPrecioUnidad;
    }

    public void setsPrecioUnidad(int sPrecioUnidad) {
        this.sPrecioUnidad = sPrecioUnidad;
    }

    public int getsPrecioTotal() {
        return sPrecioTotal;
    }

    public void setsPrecioTotal(int sPrecioTotal) {
        this.sPrecioTotal = sPrecioTotal;
    }

    public int getsCantidad() {
        return sCantidad;
    }

    public void setsCantidad(int sCantidad) {
        this.sCantidad = sCantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Object[] getPropiedades() {
        this.propiedades = new Object[]{getFecha(), getsIDVenta(), getsIDProdcuto(), getsNombreProducto(), getsCantidad(), getsPrecioUnidad(), getsPrecioUnidad() * getsCantidad()};
        return propiedades;
    }

    public void setPropiedades(Object[] propiedades) {

        this.propiedades = propiedades;
    }

    public int getsIDVenta() {
        return sIDVenta;
    }

    public String getsReferencia() {
        return sReferencia;
    }

    public void setsReferencia(String sReferencia) {
        this.sReferencia = sReferencia;
    }

    public void setsIDVenta(int sIDVenta) {
        this.sIDVenta = sIDVenta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}

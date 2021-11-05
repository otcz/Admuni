package municione.C_nuevoRegistro.modelo;

import java.util.ArrayList;

public class Municion {
    String sTipoMuni, sLoteMuni, sCantidad, sFecha, sUbicacion;

    public Municion() {

    }
    public Object [] municio()
    {
        return new Object[]{getsLoteMuni(), getsCantidad(), getsFecha(),getsUbicacion()};
    }

    public String getsTipoMuni() {
        return sTipoMuni;
    }

    public void setsTipoMuni(String sTipoMuni) {
        this.sTipoMuni = sTipoMuni;
    }

    public String getsLoteMuni() {
        return sLoteMuni;
    }

    public void setsLoteMuni(String sLoteMuni) {
        this.sLoteMuni = sLoteMuni;
    }

    public String getsCantidad() {
        return sCantidad;
    }

    public void setsCantidad(String sCantidad) {
        this.sCantidad = sCantidad;
    }

    public String getsFecha() {
        return sFecha;
    }

    public void setsFecha(String sFecha) {
        this.sFecha = sFecha;
    }

    public String getsUbicacion() {
        return sUbicacion;
    }

    public void setsUbicacion(String sUbicacion) {
        this.sUbicacion = sUbicacion;
    }

}

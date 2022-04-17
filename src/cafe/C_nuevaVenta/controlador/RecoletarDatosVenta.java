package cafe.C_nuevaVenta.controlador;

import cafe.C_nuevaVenta.modelo.Ventas;
import cafe.C_nuevaVenta.vista.FrmNuevaVenta;

import java.time.LocalDate;
import java.time.ZoneId;

public class RecoletarDatosVenta {

    public Ventas recolectar() throws NumberFormatException {
        LocalDate todayLocalDate = LocalDate.now(ZoneId.of("America/Montreal"));
        Ventas ventas = new Ventas();
        FrmNuevaVenta nuevaVenta = FrmNuevaVenta.getInstancia();

        if (nuevaVenta.getTxtID().getText().trim().isEmpty() | nuevaVenta.getTxtNombreProducto().getText().trim().isEmpty() |
                nuevaVenta.getTxtCantidad().getText().trim().isEmpty() | nuevaVenta.getTxtPrecioUnidad().getText().trim().isEmpty() |
                nuevaVenta.getTxtPrecioTotal().getText().trim().isEmpty()) {
            return null;
        } else {
            ventas.setsIDProdcuto(Integer.parseInt(nuevaVenta.getTxtID().getText()));
            AlmacenarVenta.idVenta++;
            ventas.setsIDVenta(AlmacenarVenta.idVenta);
            ventas.setsNombreProducto(nuevaVenta.getTxtNombreProducto().getText());
            ventas.setsCantidad(Integer.parseInt(nuevaVenta.getTxtCantidad().getText()));
            ventas.setsPrecioUnidad(Integer.parseInt(nuevaVenta.getTxtPrecioUnidad().getText()));
            ventas.setsPrecioTotal(Integer.parseInt(nuevaVenta.getTxtPrecioTotal().getText()));
            ventas.setFecha(todayLocalDate);
            return ventas;
        }
    }
}

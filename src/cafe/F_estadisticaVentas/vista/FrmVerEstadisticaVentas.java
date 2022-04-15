/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe.F_estadisticaVentas.vista;


import cafe.C_nuevaVenta.controlador.AlmacenarNuevoProducto;
import cafe.C_nuevaVenta.modelo.Venta;
import cafe.E_verProductos.modelo.TituloTabla;
import cafe.F_estadisticaVentas.modelo.Jtable;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

import static cafe.A_inicio.vista.FrmInicio.colorPrimary;

public class FrmVerEstadisticaVentas extends JFrame {

    private JScrollPane jScrollPane1;
    private JTable jtRegistros;
    private JPanel pnInferior;
    private JPanel pnPrincipal;
    private JPanel pnSuperior;
    public static FrmVerEstadisticaVentas estadisticaVentas;


    public FrmVerEstadisticaVentas() {
        ImageIcon icono =  new ImageIcon(getClass().getResource("/cafe/imagen/ICONO.png"));
        this.setIconImage(icono.getImage());

        pnPrincipal = new JPanel();
        pnSuperior = new JPanel();
        pnInferior = new JPanel();
        jScrollPane1 = new JScrollPane();
        jtRegistros = new Jtable(TituloTabla.Nuevo_registro, new Object[0][0]);

        setBackground(colorPrimary);
        setForeground(colorPrimary);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.LINE_AXIS));

        pnPrincipal.setBackground(colorPrimary);
        pnPrincipal.setLayout(new BoxLayout(pnPrincipal, BoxLayout.Y_AXIS));

        pnSuperior.setBackground(colorPrimary);
        pnSuperior.setLayout(new BorderLayout());
        pnPrincipal.add(pnSuperior);

        pnInferior.setBackground(new Color(255, 255, 255));
        pnInferior.setLayout(new BorderLayout());

        jScrollPane1.setBackground(colorPrimary);

        jScrollPane1.setViewportView(jtRegistros);

        pnInferior.add(jScrollPane1, BorderLayout.CENTER);

        pnPrincipal.add(pnInferior);

        getContentPane().add(pnPrincipal);

        pack();
        DefaultPieDataset defaultpiedataset = new DefaultPieDataset();
        for (int i = 0; i < AlmacenarNuevoProducto.getArrayList().size(); i++) {
            Venta ventas = AlmacenarNuevoProducto.getArrayList().get(i);
            defaultpiedataset.setValue(ventas.getsID(), Double.parseDouble(ventas.getsNombreProducto()));
            DefaultTableModel model = (DefaultTableModel) jtRegistros.getModel();
            model.addRow(ventas.venta());
        }

        JFreeChart chart = ChartFactory.createPieChart3D("ESTADISTICA VENTAS", defaultpiedataset, true, true, false);
        PiePlot3D pieplot3d = (PiePlot3D) chart.getPlot();
        pieplot3d.setDepthFactor(0.5);
        pieplot3d.setStartAngle(290D);
        pieplot3d.setDirection(Rotation.CLOCKWISE);
        pieplot3d.setForegroundAlpha(0.5F);

        ChartPanel chartPanel = new ChartPanel(chart);

        pnSuperior.add(chartPanel);
    }


    public static FrmVerEstadisticaVentas getInstancia() {
        if (estadisticaVentas == null) {
            estadisticaVentas = new FrmVerEstadisticaVentas();
        } else {
            return estadisticaVentas;
        }
        return estadisticaVentas;
    }
}

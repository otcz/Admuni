/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package municione.G_estadisticaTipoMuni.vista;


import municione.E_verRegistro.modelo.TituloTabla;
import municione.F_estadisticaLoteMuni.modelo.Jtable;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

import javax.swing.*;
import java.awt.*;

public class TipoMuni extends JFrame {

    private JScrollPane jScrollPane1;
    private JTable jtRegistros;
    private JPanel pnInferior;
    private JPanel pnPrincipal;
    private JPanel pnSuperior;
    public static TipoMuni loteMuni;

    public TipoMuni() {
        initComponents();

        // Fuente de Datos
        DefaultPieDataset defaultpiedataset = new DefaultPieDataset();
        defaultpiedataset.setValue("SOL060", new Double(10));
        defaultpiedataset.setValue("2009 - 15", new Double(11));
        defaultpiedataset.setValue("ERT5", new Double(12));
        defaultpiedataset.setValue("P4", new Double(80));
        defaultpiedataset.setValue("DFOL89", new Double(2D));

        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart3D("ESTADISTICA LOTE", defaultpiedataset, true, true, false);
        PiePlot3D pieplot3d = (PiePlot3D) chart.getPlot();
        pieplot3d.setDepthFactor(0.5);
        pieplot3d.setStartAngle(290D);
        pieplot3d.setDirection(Rotation.CLOCKWISE);
        pieplot3d.setForegroundAlpha(0.5F);

        // Mostrar Grafico
        ChartPanel chartPanel = new ChartPanel(chart);

        pnSuperior.add(chartPanel);
    }


    private void initComponents() {

        pnPrincipal = new JPanel();
        pnSuperior = new JPanel();
        pnInferior = new JPanel();
        jScrollPane1 = new JScrollPane();
        jtRegistros = new Jtable(TituloTabla.Nuevo_registro, new Object[0][0]);
        
        setBackground(new Color(1, 135, 134));
        setForeground(new Color(1, 135, 134));
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.LINE_AXIS));

        pnPrincipal.setBackground(new Color(1, 135, 134));
        pnPrincipal.setLayout(new BoxLayout(pnPrincipal, BoxLayout.Y_AXIS));

        pnSuperior.setBackground(new Color(1, 135, 134));
        pnSuperior.setLayout(new BorderLayout());
        pnPrincipal.add(pnSuperior);

        pnInferior.setBackground(new Color(255, 255, 255));
        pnInferior.setLayout(new BorderLayout());

        jScrollPane1.setBackground(new Color(1, 135, 134));

        jScrollPane1.setViewportView(jtRegistros);

        pnInferior.add(jScrollPane1, BorderLayout.CENTER);

        pnPrincipal.add(pnInferior);

        getContentPane().add(pnPrincipal);

        pack();
    }

    public static TipoMuni getInstancia() {
        if (loteMuni == null) {
            loteMuni = new TipoMuni();
        } else {
            return loteMuni;
        }
        return loteMuni;
    }
}

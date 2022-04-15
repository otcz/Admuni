package cafe.B_menuPrincipal.vista;

import cafe.B_menuPrincipal.control.*;

import javax.swing.*;
import java.awt.*;

import static cafe.A_inicio.vista.FrmInicio.colorPrimary;

public class FrmPrincipal extends JFrame {
    private JLabel lbFondo;
    private JMenuBar jMenuBar1;
    private JPanel jPanel2;
    private JMenu jmArchivo, jmArchivo1, jmArchivo2;
    private JMenuItem jmIngresarProducto, jmVerStock, jmiNuevaVenta, jmiCrearMunicion1, jmiCrearMunicion2;

    public static FrmPrincipal principal = null;

    public FrmPrincipal() {
        ImageIcon icono =  new ImageIcon(getClass().getResource("/cafe/imagen/ICONO.png"));
        this.setIconImage(icono.getImage());

        jPanel2 = new JPanel();
        lbFondo = new JLabel();
        jMenuBar1 = new JMenuBar();
        jmArchivo = new JMenu();
        jmiNuevaVenta = new JMenuItem();
        jmIngresarProducto = new JMenuItem();
        jmArchivo1 = new JMenu();
        jmiCrearMunicion1 = new JMenuItem();
        jmVerStock = new JMenuItem();
        jmArchivo2 = new JMenu();
        jmiCrearMunicion2 = new JMenuItem();


        jPanel2.setBackground(new Color(153, 153, 153));
        jPanel2.setLayout(new BorderLayout());
        lbFondo.setIcon(new ImageIcon(getClass().getResource("/cafe/imagen/logoKonecta.jpeg")));
        jPanel2.add(lbFondo, BorderLayout.CENTER);

        getContentPane().add(jPanel2, BorderLayout.CENTER);

        jMenuBar1.setPreferredSize(new Dimension(66, 50));

        jmArchivo.setBackground(colorPrimary);
        jmArchivo.setBorder(BorderFactory.createLineBorder(colorPrimary));
        jmArchivo.setIcon(new ImageIcon(getClass().getResource("/cafe/imagen/Archivo.png"))); // NOI18N
        jmArchivo.setText("ARCHIVO     ");
        jmArchivo.setAlignmentX(2.0F);
        jmArchivo.setFont(new Font("Roboto", 1, 12)); // NOI18N

        jmiNuevaVenta.setFont(new Font("Roboto", 0, 12)); // NOI18N
        jmiNuevaVenta.setIcon(new ImageIcon(getClass().getResource("/cafe/imagen/nuevaventa.png"))); // NOI18N
        jmiNuevaVenta.setText("NUEVA VENTA");
        jmiNuevaVenta.setActionCommand("");
        jmiNuevaVenta.setAlignmentX(2.0F);
        jmiNuevaVenta.setAlignmentY(2.0F);
        jmiNuevaVenta.setMaximumSize(new Dimension(200, 40));
        jmiNuevaVenta.setMinimumSize(new Dimension(200, 40));
        jmiNuevaVenta.setPreferredSize(new Dimension(200, 40));

        jmArchivo.add(jmiNuevaVenta);

        jmIngresarProducto.setFont(new Font("Roboto", 0, 12)); // NOI18N
        jmIngresarProducto.setIcon(new ImageIcon(getClass().getResource("/cafe/imagen/Nuevo.png"))); // NOI18N
        jmIngresarProducto.setText("INGRESAR PRODUCTO");
        jmIngresarProducto.setAlignmentX(2.0F);
        jmIngresarProducto.setAlignmentY(2.0F);
        jmIngresarProducto.setAutoscrolls(true);
        jmIngresarProducto.setMaximumSize(new Dimension(200, 40));
        jmIngresarProducto.setMinimumSize(new Dimension(200, 40));
        jmIngresarProducto.setPreferredSize(new Dimension(200, 40));

        jmArchivo.add(jmIngresarProducto);

        jMenuBar1.add(jmArchivo);

        jmArchivo1.setBackground(colorPrimary);
        jmArchivo1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jmArchivo1.setIcon(new ImageIcon(getClass().getResource("/cafe/imagen/estadistica.png"))); // NOI18N
        jmArchivo1.setText("ADMINISTRAR");
        jmArchivo1.setAlignmentX(2.0F);
        jmArchivo1.setFont(new Font("Roboto", 1, 12)); // NOI18N

        jmiCrearMunicion1.setFont(new Font("Roboto", 0, 12)); // NOI18N
        jmiCrearMunicion1.setIcon(new ImageIcon(getClass().getResource("/cafe/imagen/pago.png"))); // NOI18N
        jmiCrearMunicion1.setText("VENTAS");
        jmiCrearMunicion1.setActionCommand("");
        jmiCrearMunicion1.setAlignmentX(2.0F);
        jmiCrearMunicion1.setAlignmentY(2.0F);
        jmiCrearMunicion1.setMaximumSize(new Dimension(200, 40));
        jmiCrearMunicion1.setMinimumSize(new Dimension(200, 40));
        jmiCrearMunicion1.setPreferredSize(new Dimension(200, 40));

        jmArchivo1.add(jmiCrearMunicion1);

        jmVerStock.setFont(new Font("Roboto", 0, 12)); // NOI18N
        jmVerStock.setIcon(new ImageIcon(getClass().getResource("/cafe/imagen/productos.png"))); // NOI18N
        jmVerStock.setText("VER STOCK");
        jmVerStock.setActionCommand("");
        jmVerStock.setAlignmentX(2.0F);
        jmVerStock.setAlignmentY(2.0F);
        jmVerStock.setAutoscrolls(true);
        jmVerStock.setMaximumSize(new Dimension(200, 40));
        jmVerStock.setMinimumSize(new Dimension(200, 40));
        jmVerStock.setPreferredSize(new Dimension(200, 40));
        jmArchivo1.add(jmVerStock);
        jMenuBar1.add(jmArchivo1);

        jmArchivo2.setBackground(colorPrimary);
        jmArchivo2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jmArchivo2.setIcon(new ImageIcon(getClass().getResource("/cafe/imagen/ayuda.png"))); // NOI18N
        jmArchivo2.setText("AYUDA");
        jmArchivo2.setAlignmentX(2.0F);
        jmArchivo2.setFont(new Font("Roboto", 1, 12)); // NOI18N

        jmiCrearMunicion2.setFont(new Font("Roboto", 0, 12)); // NOI18N
        jmiCrearMunicion2.setIcon(new ImageIcon(getClass().getResource("/cafe/imagen/ayuda.png"))); // NOI18N
        jmiCrearMunicion2.setText("SOPORTE TÉCNICO");
        jmiCrearMunicion2.setActionCommand("");
        jmiCrearMunicion2.setAlignmentX(2.0F);
        jmiCrearMunicion2.setAlignmentY(2.0F);
        jmiCrearMunicion2.setMaximumSize(new Dimension(200, 40));
        jmiCrearMunicion2.setMinimumSize(new Dimension(200, 40));
        jmiCrearMunicion2.setPreferredSize(new Dimension(200, 40));
        jmArchivo2.add(jmiCrearMunicion2);
        jMenuBar1.add(jmArchivo2);
        setJMenuBar(jMenuBar1);

        jmiNuevaVenta.addActionListener(new EventoMenuNuevoVenta());
        jmIngresarProducto.addActionListener(new EventoCrearNuevoProducto());
        jmVerStock.addActionListener(new EventoVerProductos());
        jmiCrearMunicion1.addActionListener(new EventoVerEstadisticaVentas());
        pack();


    }

    public static FrmPrincipal getInstancia() {
        if (principal == null) {
            principal = new FrmPrincipal();
        } else {
            return principal;
        }
        return principal;
    }

}

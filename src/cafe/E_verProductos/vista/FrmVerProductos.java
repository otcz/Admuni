
package cafe.E_verProductos.vista;


import cafe.C_nuevaVenta.controlador.AlmacenarVenta;
import cafe.C_nuevaVenta.modelo.Ventas;
import cafe.E_verProductos.modelo.Jtable;
import cafe.E_verProductos.modelo.TituloTabla;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

import static cafe.A_inicio.vista.FrmInicio.colorPrimary;


public class FrmVerProductos extends JFrame {

    private JButton btnBuscar;
    private JScrollPane jScrollPane1;
    private JTable jtRegistros;
    private JPanel pnNorte;
    private JPanel pnPrincipal;
    private JPanel pnSur;
    private JTextField textBuscar;
    public static FrmVerProductos verRegistro;

    public FrmVerProductos() {
        ImageIcon icono =  new ImageIcon(getClass().getResource("/cafe/imagen/ICONO.png"));
        this.setIconImage(icono.getImage());
        GridBagConstraints gridBagConstraints;

        pnPrincipal = new JPanel();
        pnNorte = new JPanel();
        textBuscar = new JTextField();
        btnBuscar = new JButton();
        pnSur = new JPanel();
        jScrollPane1 = new JScrollPane();
        jtRegistros = new Jtable(TituloTabla.Nuevo_registro, new Object[0][0]);


        setBackground(colorPrimary);
        setForeground(colorPrimary);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.LINE_AXIS));

        pnPrincipal.setBackground(colorPrimary);
        pnPrincipal.setLayout(new BoxLayout(pnPrincipal, BoxLayout.Y_AXIS));

        pnNorte.setBackground(colorPrimary);
        pnNorte.setLayout(new GridBagLayout());

        textBuscar.setBackground(colorPrimary);
        textBuscar.setFont(new Font("Roboto", 1, 14)); // NOI18N
        textBuscar.setForeground(new Color(255, 255, 255));
        textBuscar.setAlignmentX(1.0F);
        textBuscar.setAlignmentY(1.0F);
        textBuscar.setBorder(BorderFactory.createTitledBorder(null, "BUSCAR REGISTRO", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255))); // NOI18N
        textBuscar.setMaximumSize(new Dimension(300, 30));
        textBuscar.setMinimumSize(new Dimension(300, 30));
        textBuscar.setName(""); // NOI18N
        textBuscar.setPreferredSize(new Dimension(300, 30));

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(23, 26, 17, 0);
        pnNorte.add(textBuscar, gridBagConstraints);

        btnBuscar.setBackground(colorPrimary);
        btnBuscar.setFont(new Font("Roboto", 1, 14)); // NOI18N
        btnBuscar.setForeground(new Color(255, 255, 255));
        btnBuscar.setIcon(new ImageIcon(getClass().getResource("/cafe/imagen/VerRegistro.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 189;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(23, 28, 17, 12);
        pnNorte.add(btnBuscar, gridBagConstraints);

        pnPrincipal.add(pnNorte);

        pnSur.setBackground(new Color(255, 255, 255));
        pnSur.setLayout(new BorderLayout());

        jScrollPane1.setBackground(colorPrimary);

        jScrollPane1.setViewportView(jtRegistros);

        pnSur.add(jScrollPane1, BorderLayout.CENTER);

        pnPrincipal.add(pnSur);

        getContentPane().add(pnPrincipal);

        ArrayList<Ventas> municions = AlmacenarVenta.getVentas();
        DefaultTableModel defaultTableModel = (DefaultTableModel) getJtRegistros().getModel();
        for (int i = 0; i < defaultTableModel.getRowCount(); i++) {
            defaultTableModel.removeRow(i);
        }

        for (int i = 0; i < municions.size(); i++) {
            Ventas municion = municions.get(i);
            defaultTableModel.addRow(municion.venta());
        }

        pack();


    }


    public static FrmVerProductos getInstancia() {
        if (verRegistro == null) {
            verRegistro = new FrmVerProductos();
        } else {
            return verRegistro;
        }
        return verRegistro;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getJtRegistros() {
        return jtRegistros;
    }

    public void setJtRegistros(JTable jtRegistros) {
        this.jtRegistros = jtRegistros;
    }

    public JPanel getPnNorte() {
        return pnNorte;
    }

    public void setPnNorte(JPanel pnNorte) {
        this.pnNorte = pnNorte;
    }

    public JPanel getPnPrincipal() {
        return pnPrincipal;
    }

    public void setPnPrincipal(JPanel pnPrincipal) {
        this.pnPrincipal = pnPrincipal;
    }

    public JPanel getPnSur() {
        return pnSur;
    }

    public void setPnSur(JPanel pnSur) {
        this.pnSur = pnSur;
    }

    public JTextField getTextBuscar() {
        return textBuscar;
    }

    public void setTextBuscar(JTextField textBuscar) {
        this.textBuscar = textBuscar;
    }
}

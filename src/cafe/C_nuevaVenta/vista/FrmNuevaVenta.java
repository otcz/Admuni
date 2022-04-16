package cafe.C_nuevaVenta.vista;


import cafe.C_nuevaVenta.controlador.*;
import cafe.C_nuevaVenta.modelo.Jtable;
import cafe.C_nuevaVenta.modelo.TituloTabla;
import cafe.D_nuevoEditarProducto.control.AlmacenProductos;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.KeyEvent;

import static cafe.A_inicio.vista.FrmInicio.colorPrimary;

public class FrmNuevaVenta extends JFrame {

    private JComboBox<String> cbProducto;
    private JLabel jLabel3, lbTitulo;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTextArea jTextArea1;
    private JSeparator jsDivisor;
    private JTable jtResgistro;
    private JPanel pnPropiedades, pnTabla;
    private JTextField txtNombreProducto, txtID, txtStock, txtCantidad, txtPrecioTotal, txtPrecioUnidad;
    private JButton btnNuevoProducto, btnRegistrar, btnPagar;


    public static FrmNuevaVenta nuevoRegistro;

    public FrmNuevaVenta() {
        setExtendedState(MAXIMIZED_BOTH);
        ImageIcon icono = new ImageIcon(getClass().getResource("/cafe/imagen/ICONO.png"));
        this.setIconImage(icono.getImage());
        GridBagConstraints gridBagConstraints;
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        pnPropiedades = new JPanel();
        txtID = new JTextField();
        btnNuevoProducto = new JButton();
        btnPagar = new JButton();
        lbTitulo = new JLabel();
        cbProducto = new JComboBox<>();
        jLabel3 = new JLabel();
        txtNombreProducto = new JTextField();
        jsDivisor = new JSeparator();
        btnRegistrar = new JButton();
        txtStock = new JTextField();
        txtCantidad = new JTextField();
        txtPrecioTotal = new JTextField();
        txtPrecioUnidad = new JTextField();
        pnTabla = new JPanel();
        jScrollPane2 = new JScrollPane();
        jtResgistro = new Jtable(TituloTabla.Nuevo_registro, new Object[0][0]);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.LINE_AXIS));

        pnPropiedades.setBackground(colorPrimary);
        pnPropiedades.setMaximumSize(new Dimension(320, 1920));
        pnPropiedades.setLayout(new GridBagLayout());

        txtID.setBackground(colorPrimary);
        txtID.setBackground(colorPrimary);
        txtID.setFont(new Font("Roboto", 1, 14)); // NOI18N
        txtID.setForeground(new Color(255, 255, 255));
        txtID.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255))); // NOI18N
        txtID.setMaximumSize(new Dimension(300, 30));
        txtID.setMinimumSize(new Dimension(300, 30));
        txtID.setPreferredSize(new Dimension(300, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(7, 12, 0, 20);
        pnPropiedades.add(txtID, gridBagConstraints);

        btnNuevoProducto.setBackground(colorPrimary);
        btnNuevoProducto.setFont(new Font("Roboto", 1, 14)); // NOI18N
        btnNuevoProducto.setForeground(new Color(255, 255, 255));
        btnNuevoProducto.setText("NUEVO PRODCUTO");
        btnNuevoProducto.setMaximumSize(new Dimension(300, 30));
        btnNuevoProducto.setMinimumSize(new Dimension(300, 30));
        btnNuevoProducto.setPreferredSize(new Dimension(300, 30));

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 12, 56, 20);
        pnPropiedades.add(btnNuevoProducto, gridBagConstraints);

        lbTitulo.setBackground(new Color(255, 255, 255));
        lbTitulo.setFont(new Font("Roboto", 1, 24)); // NOI18N
        lbTitulo.setForeground(new Color(255, 255, 255));
        lbTitulo.setText("NUEVA VENTA");
        lbTitulo.setMaximumSize(new Dimension(300, 30));
        lbTitulo.setMinimumSize(new Dimension(300, 30));
        lbTitulo.setPreferredSize(new Dimension(300, 30));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = -131;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 91, 0, 0);
        pnPropiedades.add(lbTitulo, gridBagConstraints);

        cbProducto.setBackground(colorPrimary);
        cbProducto.setFont(new Font("Roboto", 1, 14)); // NOI18N
        cbProducto.setForeground(new Color(255, 255, 255));
        cbProducto.setMaximumRowCount(5);
        cbProducto.setAlignmentX(1.5F);
        cbProducto.setAlignmentY(1.5F);
        cbProducto.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255))); // NOI18N
        cbProducto.setMaximumSize(new Dimension(300, 30));
        cbProducto.setMinimumSize(new Dimension(300, 30));
        cbProducto.setPreferredSize(new Dimension(300, 30));

        for (int i = 0; i < AlmacenProductos.getProductos().size(); i++) {
            cbProducto.addItem(AlmacenProductos.getProductos().get(i).getsID()+" - "+AlmacenProductos.getProductos().get(i).getsNombreProducto());
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 42;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 12, 0, 20);
        pnPropiedades.add(cbProducto, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        pnPropiedades.add(jLabel3, gridBagConstraints);

        txtNombreProducto.setBackground(colorPrimary);
        txtNombreProducto.setFont(new Font("Roboto", 1, 14)); // NOI18N
        txtNombreProducto.setForeground(new Color(255, 255, 255));
        txtNombreProducto.setBorder(BorderFactory.createTitledBorder(null, "NOMBRE DE PRODUCTO", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255))); // NOI18N
        txtNombreProducto.setMaximumSize(new Dimension(300, 30));
        txtNombreProducto.setMinimumSize(new Dimension(300, 30));
        txtNombreProducto.setName(""); // NOI18N
        txtNombreProducto.setPreferredSize(new Dimension(300, 30));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 12, 0, 20);
        pnPropiedades.add(txtNombreProducto, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 308;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 0);
        pnPropiedades.add(jsDivisor, gridBagConstraints);


        btnPagar.setBackground(colorPrimary);
        btnPagar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(255, 255, 255));
        btnPagar.setText("PAGAR");
        btnPagar.setMaximumSize(new java.awt.Dimension(300, 30));
        btnPagar.setMinimumSize(new java.awt.Dimension(300, 30));
        btnPagar.setPreferredSize(new java.awt.Dimension(300, 30));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 20);
        pnPropiedades.add(btnPagar, gridBagConstraints);

        txtPrecioUnidad.setBackground(colorPrimary);
        txtPrecioUnidad.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtPrecioUnidad.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRECIO UNIDAD", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtPrecioUnidad.setMaximumSize(new java.awt.Dimension(300, 30));
        txtPrecioUnidad.setMinimumSize(new java.awt.Dimension(300, 30));
        txtPrecioUnidad.setName(""); // NOI18N
        txtPrecioUnidad.setPreferredSize(new java.awt.Dimension(300, 30));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 12, 0, 20);
        pnPropiedades.add(txtPrecioUnidad, gridBagConstraints);

        txtCantidad.setBackground(colorPrimary);
        txtCantidad.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CANTIDAD", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtCantidad.setMaximumSize(new java.awt.Dimension(300, 30));
        txtCantidad.setMinimumSize(new java.awt.Dimension(300, 30));
        txtCantidad.setName(""); // NOI18N
        txtCantidad.setPreferredSize(new java.awt.Dimension(300, 30));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 12, 0, 20);
        pnPropiedades.add(txtCantidad, gridBagConstraints);


        txtPrecioTotal.setBackground(colorPrimary);
        txtPrecioTotal.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtPrecioTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRECIO TOTAL", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtPrecioTotal.setMaximumSize(new java.awt.Dimension(300, 30));
        txtPrecioTotal.setMinimumSize(new java.awt.Dimension(300, 30));
        txtPrecioTotal.setName(""); // NOI18N
        txtPrecioTotal.setPreferredSize(new java.awt.Dimension(300, 30));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 12, 0, 20);
        pnPropiedades.add(txtPrecioTotal, gridBagConstraints);


        btnRegistrar.setBackground(colorPrimary);
        btnRegistrar.setFont(new Font("Roboto", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new Color(255, 255, 255));
        btnRegistrar.setText("REGISTAR");
        btnRegistrar.setMaximumSize(new Dimension(300, 30));
        btnRegistrar.setMinimumSize(new Dimension(300, 30));
        btnRegistrar.setPreferredSize(new Dimension(300, 30));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 12, 0, 20);
        pnPropiedades.add(btnRegistrar, gridBagConstraints);

        txtStock.setBackground(colorPrimary);
        txtStock.setFont(new Font("Roboto", 1, 14)); // NOI18N
        txtStock.setForeground(new Color(255, 255, 255));
        txtStock.setBorder(BorderFactory.createTitledBorder(null, "STOCK", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255))); // NOI18N
        txtStock.setMaximumSize(new Dimension(300, 30));
        txtStock.setMinimumSize(new Dimension(300, 30));
        txtStock.setName(""); // NOI18N
        txtStock.setPreferredSize(new Dimension(300, 30));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 12, 0, 20);
        pnPropiedades.add(txtStock, gridBagConstraints);
        getContentPane().add(pnPropiedades);


        pnTabla.setBackground(new Color(255, 255, 255));
        pnTabla.setMaximumSize(null);
        pnTabla.setPreferredSize(new Dimension(1344, 0));
        pnTabla.setLayout(new GridLayout(1, 0));
        jScrollPane2.setViewportView(jtResgistro);
        pnTabla.add(jScrollPane2);
        getContentPane().add(pnTabla);
        txtNombreProducto.setEditable(false);
        txtPrecioTotal.setEditable(false);
        txtPrecioUnidad.setEditable(false);
        txtStock.setEditable(false);

        txtID.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, txtNombreProducto));
        txtNombreProducto.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, txtCantidad));
        txtCantidad.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, txtPrecioUnidad));
        txtPrecioUnidad.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, txtPrecioTotal));
        txtPrecioTotal.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, txtStock));
        txtStock.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, btnRegistrar));


        btnRegistrar.addActionListener(new EventoBotonRegistrar());
        btnNuevoProducto.addActionListener(new EventoBotonNuevaVenta());
        txtID.addKeyListener(new EventoTeclaConsultarProductoID());
        txtCantidad.addKeyListener(new EventoTeclaCalculaPrecioTotal());
        addWindowListener(new AbrirVentanaPrincipal());
        pack();
    }

    public static FrmNuevaVenta getInstancia() {
        if (nuevoRegistro == null) {
            nuevoRegistro = new FrmNuevaVenta();
        } else {
            return nuevoRegistro;
        }
        return nuevoRegistro;
    }

    public void limpiarCampos() {
        txtNombreProducto.setText("");
        txtID.setText("");
        txtStock.setText("");
        txtCantidad.setText("");
        txtPrecioTotal.setText("");
        txtPrecioUnidad.setText("");
    }

    public JComboBox<String> getCbProducto() {
        return cbProducto;
    }

    public void setCbProducto(JComboBox<String> cbProducto) {
        this.cbProducto = cbProducto;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }

    public JSeparator getJsDivisor() {
        return jsDivisor;
    }

    public void setJsDivisor(JSeparator jsDivisor) {
        this.jsDivisor = jsDivisor;
    }

    public JTable getJtResgistro() {
        return jtResgistro;
    }

    public void setJtResgistro(JTable jtResgistro) {
        this.jtResgistro = jtResgistro;
    }

    public JLabel getLbTitulo() {
        return lbTitulo;
    }

    public void setLbTitulo(JLabel lbTitulo) {
        this.lbTitulo = lbTitulo;
    }

    public JPanel getPnPropiedades() {
        return pnPropiedades;
    }

    public void setPnPropiedades(JPanel pnPropiedades) {
        this.pnPropiedades = pnPropiedades;
    }

    public JPanel getPnTabla() {
        return pnTabla;
    }

    public void setPnTabla(JPanel pnTabla) {
        this.pnTabla = pnTabla;
    }

    public JTextField getTxtNombreProducto() {
        return txtNombreProducto;
    }

    public void setTxtNombreProducto(JTextField txtNombreProducto) {
        this.txtNombreProducto = txtNombreProducto;
    }

    public JTextField getTxtID() {
        return txtID;
    }

    public void setTxtID(JTextField txtID) {
        this.txtID = txtID;
    }

    public JButton getBtnNuevoProducto() {
        return btnNuevoProducto;
    }

    public void setBtnNuevoProducto(JButton btnNuevoProducto) {
        this.btnNuevoProducto = btnNuevoProducto;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public void setBtnRegistrar(JButton btnRegistrar) {
        this.btnRegistrar = btnRegistrar;
    }

    public JTextField getTxtStock() {
        return txtStock;
    }

    public void setTxtStock(JTextField txtStock) {
        this.txtStock = txtStock;
    }

    public JTextField getTxtCantidad() {
        return txtCantidad;
    }

    public void setTxtCantidad(JTextField txtCantidad) {
        this.txtCantidad = txtCantidad;
    }

    public JTextField getTxtPrecioTotal() {
        return txtPrecioTotal;
    }

    public void setTxtPrecioTotal(JTextField txtPrecioTotal) {
        this.txtPrecioTotal = txtPrecioTotal;
    }

    public JTextField getTxtPrecioUnidad() {
        return txtPrecioUnidad;
    }

    public void setTxtPrecioUnidad(JTextField txtPrecioUnidad) {
        this.txtPrecioUnidad = txtPrecioUnidad;
    }

    public JButton getBtnPagar() {
        return btnPagar;
    }

    public void setBtnPagar(JButton btnPagar) {
        this.btnPagar = btnPagar;
    }
}

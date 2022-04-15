package cafe.D_nuevoEditarProducto.vista;

import cafe.D_nuevoEditarProducto.control.EventoBotonGuardarProducto;
import cafe.D_nuevoEditarProducto.control.EventoSalir;
import cafe.D_nuevoEditarProducto.control.EventoTeclaSiguienteComponente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static cafe.A_inicio.vista.FrmInicio.colorPrimary;


public class FrmCrearNuevoProducto extends JFrame {

    private JButton btnGuardar,btnSalir;
    private JLabel lbTitulo;
    private JPanel pnprincipal;
    private JTextField txtCategoria,txtFecha,txtID,txtNombreProducto,txtPeso,txtPrecio,txtReferencia,txtStock;

    public static FrmCrearNuevoProducto crearNuevoProducto;

    public FrmCrearNuevoProducto() {
        ImageIcon icono =  new ImageIcon(getClass().getResource("/cafe/imagen/ICONO.png"));
        this.setIconImage(icono.getImage());
        GridBagConstraints gridBagConstraints;

        pnprincipal = new JPanel();
        lbTitulo = new JLabel();
        txtID = new JTextField();
        btnSalir = new JButton();
        btnGuardar = new JButton();
        txtPrecio = new JTextField();
        txtReferencia = new JTextField();
        txtNombreProducto = new JTextField();
        txtPeso = new JTextField();
        txtCategoria = new JTextField();
        txtStock = new JTextField();
        txtFecha = new JTextField();


        setBackground(colorPrimary);

        pnprincipal.setBackground(colorPrimary);
        pnprincipal.setLayout(new GridBagLayout());

        lbTitulo.setBackground(new Color(255, 255, 255));
        lbTitulo.setFont(new Font("Roboto", 1, 24)); // NOI18N
        lbTitulo.setForeground(new Color(255, 255, 255));
        lbTitulo.setText("NUEVO PRODUCTO");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(26, 210, 0, 0);
        pnprincipal.add(lbTitulo, gridBagConstraints);

        txtID.setBackground(colorPrimary);
        txtID.setFont(new Font("Roboto", 1, 14)); // NOI18N
        txtID.setForeground(new Color(255, 255, 255));
        txtID.setBorder(BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255))); // NOI18N

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 296;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(27, 28, 0, 0);
        pnprincipal.add(txtID, gridBagConstraints);
        txtID.getAccessibleContext().setAccessibleName("ID");


        btnSalir.setBackground(colorPrimary);
        btnSalir.setFont(new Font("Roboto", 1, 14)); // NOI18N
        btnSalir.setForeground(new Color(255, 255, 255));
        btnSalir.setText("SALIR");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 241;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(27, 28, 82, 0);
        pnprincipal.add(btnSalir, gridBagConstraints);

        btnGuardar.setBackground(colorPrimary);
        btnGuardar.setFont(new Font("Roboto", 1, 14)); // NOI18N
        btnGuardar.setForeground(new Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(27, 51, 82, 27);
        pnprincipal.add(btnGuardar, gridBagConstraints);

        txtPrecio.setBackground(colorPrimary);
        txtPrecio.setFont(new Font("Roboto", 1, 14)); // NOI18N
        txtPrecio.setForeground(new Color(255, 255, 255));
        txtPrecio.setBorder(BorderFactory.createTitledBorder(null, "PRECIO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255))); // NOI18N

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 296;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(13, 28, 0, 0);
        pnprincipal.add(txtPrecio, gridBagConstraints);

        txtReferencia.setBackground(colorPrimary);
        txtReferencia.setFont(new Font("Roboto", 1, 14)); // NOI18N
        txtReferencia.setForeground(new Color(255, 255, 255));
        txtReferencia.setBorder(BorderFactory.createTitledBorder(null, "REFERENCIA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255))); // NOI18N

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 296;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(7, 28, 0, 0);
        pnprincipal.add(txtReferencia, gridBagConstraints);

        txtNombreProducto.setBackground(colorPrimary);
        txtNombreProducto.setFont(new Font("Roboto", 1, 14)); // NOI18N
        txtNombreProducto.setForeground(new Color(255, 255, 255));
        txtNombreProducto.setBorder(BorderFactory.createTitledBorder(null, "NOMBRE PRODUCTO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255))); // NOI18N

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 296;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(7, 28, 0, 0);
        pnprincipal.add(txtNombreProducto, gridBagConstraints);
        txtNombreProducto.getAccessibleContext().setAccessibleName("NOMBRE DEL PRODUCTO");

        txtPeso.setBackground(colorPrimary);
        txtPeso.setFont(new Font("Roboto", 1, 14)); // NOI18N
        txtPeso.setForeground(new Color(255, 255, 255));
        txtPeso.setBorder(BorderFactory.createTitledBorder(null, "PESO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255))); // NOI18N

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 296;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(27, 51, 0, 27);
        pnprincipal.add(txtPeso, gridBagConstraints);

        txtCategoria.setBackground(colorPrimary);
        txtCategoria.setFont(new Font("Roboto", 1, 14)); // NOI18N
        txtCategoria.setForeground(new Color(255, 255, 255));
        txtCategoria.setBorder(BorderFactory.createTitledBorder(null, "CATEGORÍA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255))); // NOI18N

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 296;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(7, 51, 0, 27);
        pnprincipal.add(txtCategoria, gridBagConstraints);

        txtStock.setBackground(colorPrimary);
        txtStock.setFont(new Font("Roboto", 1, 14)); // NOI18N
        txtStock.setForeground(new Color(255, 255, 255));
        txtStock.setBorder(BorderFactory.createTitledBorder(null, "STOCK", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255))); // NOI18N

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 296;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(7, 51, 0, 27);
        pnprincipal.add(txtStock, gridBagConstraints);

        txtFecha.setBackground(colorPrimary);
        DateTimeFormatter dFecha = DateTimeFormatter.ofPattern("HH:mm - yyyy/MM/dd ");
        txtFecha.setText(dFecha.format(LocalDateTime.now()));
        txtFecha.setEditable(false);
        txtFecha.setFont(new Font("Roboto", 1, 14)); // NOI18N
        txtFecha.setForeground(new Color(255, 255, 255));
        txtFecha.setBorder(BorderFactory.createTitledBorder(null, "FECHA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255))); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 296;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(13, 51, 0, 27);
        pnprincipal.add(txtFecha, gridBagConstraints);

        getContentPane().add(pnprincipal, java.awt.BorderLayout.CENTER);


        btnGuardar.addActionListener(new EventoBotonGuardarProducto());
        btnSalir.addActionListener(new EventoSalir());
        btnSalir.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, btnSalir));

        txtID.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, txtNombreProducto));
        txtNombreProducto.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, txtReferencia));
        txtReferencia.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, txtPrecio));
        txtPrecio.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, txtPeso));
        txtPeso.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, txtCategoria));
        txtCategoria.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, txtStock));
        txtStock.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, txtFecha));
        txtFecha.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, btnGuardar));
        pack();
    }

    public static FrmCrearNuevoProducto getInstancia() {
        if (crearNuevoProducto == null) {
            crearNuevoProducto = new FrmCrearNuevoProducto();
        } else {
            return crearNuevoProducto;
        }
        return crearNuevoProducto;
    }

    public static FrmCrearNuevoProducto getCrearNuevoProducto() {
        return crearNuevoProducto;
    }

    public static void setCrearNuevoProducto(FrmCrearNuevoProducto crearNuevoProducto) {
        FrmCrearNuevoProducto.crearNuevoProducto = crearNuevoProducto;
    }


    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JLabel getLbTitulo() {
        return lbTitulo;
    }

    public void setLbTitulo(JLabel lbTitulo) {
        this.lbTitulo = lbTitulo;
    }

    public JPanel getPnprincipal() {
        return pnprincipal;
    }

    public void setPnprincipal(JPanel pnprincipal) {
        this.pnprincipal = pnprincipal;
    }

    public JTextField getTxtCategoria() {
        return txtCategoria;
    }

    public void setTxtCategoria(JTextField txtCategoria) {
        this.txtCategoria = txtCategoria;
    }

    public JTextField getTxtFecha() {
        return txtFecha;
    }

    public void setTxtFecha(JTextField txtFecha) {
        this.txtFecha = txtFecha;
    }

    public JTextField getTxtID() {
        return txtID;
    }

    public void setTxtID(JTextField txtID) {
        this.txtID = txtID;
    }

    public JTextField getTxtNombreProducto() {
        return txtNombreProducto;
    }

    public void setTxtNombreProducto(JTextField txtNombreProducto) {
        this.txtNombreProducto = txtNombreProducto;
    }

    public JTextField getTxtPeso() {
        return txtPeso;
    }

    public void setTxtPeso(JTextField txtPeso) {
        this.txtPeso = txtPeso;
    }

    public JTextField getTxtPrecio() {
        return txtPrecio;
    }

    public void setTxtPrecio(JTextField txtPrecio) {
        this.txtPrecio = txtPrecio;
    }

    public JTextField getTxtReferencia() {
        return txtReferencia;
    }

    public void setTxtReferencia(JTextField txtReferencia) {
        this.txtReferencia = txtReferencia;
    }

    public JTextField getTxtStock() {
        return txtStock;
    }

    public void setTxtStock(JTextField txtStock) {
        this.txtStock = txtStock;
    }
}

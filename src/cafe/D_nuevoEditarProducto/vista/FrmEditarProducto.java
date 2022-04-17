package cafe.D_nuevoEditarProducto.vista;

import cafe.D_nuevoEditarProducto.control.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

import static cafe.A_inicio.vista.FrmInicio.colorPrimary;


public class FrmEditarProducto extends JFrame {

    private JButton btnBuscar, btnEditar, btnBorrar, btnSalir;
    private JLabel lbTitulo;
    private JPanel pnprincipal;
    private JTextField txtCategoria, txtID, txtNombreProducto, txtPeso, txtPrecio, txtReferencia, txtStock;

    public static FrmEditarProducto editarProducto;

    public FrmEditarProducto() {
        ImageIcon icono = new ImageIcon(getClass().getResource("/cafe/imagen/ICONO.png"));
        this.setIconImage(icono.getImage());

        GridBagConstraints gridBagConstraints;
        pnprincipal = new JPanel();
        lbTitulo = new JLabel();
        txtID = new JTextField();
        btnSalir = new JButton();
        btnEditar = new JButton();
        btnBuscar = new JButton();
        txtReferencia = new JTextField();
        txtPrecio = new JTextField();
        txtNombreProducto = new JTextField();
        txtPeso = new JTextField();
        txtStock = new JTextField();
        txtCategoria = new JTextField();
        btnBorrar = new JButton();
        setBackground(colorPrimary);

        pnprincipal.setBackground(colorPrimary);
        pnprincipal.setLayout(new GridBagLayout());

        lbTitulo.setBackground(new Color(255, 255, 255));
        lbTitulo.setFont(new Font("Roboto", 1, 24));
        lbTitulo.setForeground(new Color(255, 255, 255));
        lbTitulo.setText("EDITAR  PRODUCTO");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(26, 281, 0, 0);
        pnprincipal.add(lbTitulo, gridBagConstraints);

        txtID.setBackground(colorPrimary);
        txtID.setFont(new Font("Roboto", 1, 14));
        txtID.setForeground(new Color(255, 255, 255));
        txtID.setBorder(BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255)));

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 236;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(11, 31, 0, 0);
        pnprincipal.add(txtID, gridBagConstraints);
        txtID.getAccessibleContext().setAccessibleDescription("");

        btnSalir.setBackground(colorPrimary);
        btnSalir.setFont(new Font("Roboto", 1, 14));
        btnSalir.setForeground(new Color(255, 255, 255));
        btnSalir.setText("SALIR");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 89;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(18, 18, 59, 29);
        pnprincipal.add(btnSalir, gridBagConstraints);

        btnEditar.setBackground(colorPrimary);
        btnEditar.setFont(new Font("Roboto", 1, 14));
        btnEditar.setForeground(new Color(255, 255, 255));
        btnEditar.setText("EDITAR");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(18, 28, 59, 0);
        pnprincipal.add(btnEditar, gridBagConstraints);

        btnBuscar.setBackground(colorPrimary);
        btnBuscar.setFont(new Font("Roboto", 1, 14));
        btnBuscar.setForeground(new Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setIcon(new ImageIcon(getClass().getResource("/cafe/imagen/VerRegistro.png")));

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 435;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(28, 28, 0, 29);
        pnprincipal.add(btnBuscar, gridBagConstraints);

        txtReferencia.setBackground(colorPrimary);
        txtReferencia.setFont(new Font("Roboto", 1, 14));
        txtReferencia.setForeground(new Color(255, 255, 255));
        txtReferencia.setBorder(BorderFactory.createTitledBorder(null, "REFERENCIA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255)));

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 236;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(18, 31, 0, 0);
        pnprincipal.add(txtReferencia, gridBagConstraints);

        txtPrecio.setBackground(colorPrimary);
        txtPrecio.setFont(new Font("Roboto", 1, 14));
        txtPrecio.setForeground(new Color(255, 255, 255));
        txtPrecio.setBorder(BorderFactory.createTitledBorder(null, "PRECIO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255)));

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 236;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(18, 28, 0, 0);
        pnprincipal.add(txtPrecio, gridBagConstraints);

        txtNombreProducto.setBackground(colorPrimary);
        txtNombreProducto.setFont(new Font("Roboto", 1, 14));
        txtNombreProducto.setForeground(new Color(255, 255, 255));
        txtNombreProducto.setBorder(BorderFactory.createTitledBorder(null, "NOMBRE PRODUCTO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255)));

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 236;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(18, 31, 0, 0);
        pnprincipal.add(txtNombreProducto, gridBagConstraints);

        txtPeso.setBackground(colorPrimary);
        txtPeso.setFont(new Font("Roboto", 1, 14));
        txtPeso.setForeground(new Color(255, 255, 255));
        txtPeso.setBorder(BorderFactory.createTitledBorder(null, "PESO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255)));

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 236;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(18, 28, 0, 0);
        pnprincipal.add(txtPeso, gridBagConstraints);

        txtStock.setBackground(colorPrimary);
        txtStock.setFont(new Font("Roboto", 1, 14));
        txtStock.setForeground(new Color(255, 255, 255));
        txtStock.setBorder(BorderFactory.createTitledBorder(null, "STOCK", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255)));

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 236;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(18, 18, 0, 29);
        pnprincipal.add(txtStock, gridBagConstraints);

        txtCategoria.setBackground(colorPrimary);
        txtCategoria.setFont(new Font("Roboto", 1, 14));
        txtCategoria.setForeground(new Color(255, 255, 255));
        txtCategoria.setBorder(BorderFactory.createTitledBorder(null, "CATEGORIA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255)));

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 236;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(18, 18, 0, 29);
        pnprincipal.add(txtCategoria, gridBagConstraints);

        btnBorrar.setBackground(colorPrimary);
        btnBorrar.setFont(new Font("Roboto", 1, 14));
        btnBorrar.setForeground(new Color(255, 255, 255));
        btnBorrar.setText("BORARR");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 73;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(18, 24, 59, 0);
        pnprincipal.add(btnBorrar, gridBagConstraints);
        getContentPane().add(pnprincipal, BorderLayout.CENTER);

        btnSalir.addActionListener(new EventoSalir());
        btnSalir.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, btnSalir));
        txtID.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, btnBuscar));
        btnBuscar.addActionListener(new EventoBotonBuscarID());
        btnEditar.addActionListener(new EventoBotonActualizar());
        btnBorrar.addActionListener(new EventoBotonEliminarProdcuto());
        btnSalir.addActionListener(new EventoSalir());

        pack();
    }


    public static FrmEditarProducto getInstancia() {
        if (editarProducto == null) {
            editarProducto = new FrmEditarProducto();
        } else {
            return editarProducto;
        }
        return editarProducto;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public void setBtnEditar(JButton btnEditar) {
        this.btnEditar = btnEditar;
    }

    public JButton getBtnBorrar() {
        return btnBorrar;
    }

    public void setBtnBorrar(JButton btnBorrar) {
        this.btnBorrar = btnBorrar;
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

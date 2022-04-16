package cafe.D_nuevoEditarProducto.vista;

import cafe.C_nuevaVenta.modelo.TituloTabla;
import cafe.D_nuevoEditarProducto.control.EventoSalir;
import cafe.D_nuevoEditarProducto.control.EventoTeclaSiguienteComponente;
import cafe.D_nuevoEditarProducto.modelo.tabla.Jtable;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

import static cafe.A_inicio.vista.FrmInicio.colorPrimary;


public class FrmEditarProducto extends JFrame {

    private JButton btnBuscar,btnGuardar,btnGuardar1,btnSalir;
    private JLabel lbTitulo;
    private JPanel pnprincipal;
    private JTextField txtCategoria,txtID,txtNombreProducto,txtPeso,txtPrecio,txtReferencia,txtStock;

    public static FrmEditarProducto editarProducto;

    public FrmEditarProducto() {
        ImageIcon icono =  new ImageIcon(getClass().getResource("/cafe/imagen/ICONO.png"));
        this.setIconImage(icono.getImage());

        GridBagConstraints gridBagConstraints;
        pnprincipal = new JPanel();
        lbTitulo = new JLabel();
        txtID = new JTextField();
        btnSalir = new JButton();
        btnGuardar = new JButton();
        btnBuscar = new JButton();
        txtReferencia = new JTextField();
        txtPrecio = new JTextField();
        txtNombreProducto = new JTextField();
        txtPeso = new JTextField();
        txtStock = new JTextField();
        txtCategoria = new JTextField();
        btnGuardar1 = new JButton();
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

        btnGuardar.setBackground(colorPrimary);
        btnGuardar.setFont(new Font("Roboto", 1, 14));
        btnGuardar.setForeground(new Color(255, 255, 255));
        btnGuardar.setText("EDITAR");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(18, 28, 59, 0);
        pnprincipal.add(btnGuardar, gridBagConstraints);

        btnBuscar.setBackground(colorPrimary);
        btnBuscar.setFont(new Font("Roboto", 1, 14));
        btnBuscar.setForeground(new Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");

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
        txtReferencia.setBorder(BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255)));

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
        txtPrecio.setBorder(BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255)));

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
        txtNombreProducto.setBorder(BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255)));

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
        txtPeso.setBorder(BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255)));

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
        txtStock.setBorder(BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255)));

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
        txtCategoria.setBorder(BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255)));

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 236;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(18, 18, 0, 29);
        pnprincipal.add(txtCategoria, gridBagConstraints);

        btnGuardar1.setBackground(colorPrimary);
        btnGuardar1.setFont(new Font("Roboto", 1, 14));
        btnGuardar1.setForeground(new Color(255, 255, 255));
        btnGuardar1.setText("BORARR");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 73;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(18, 24, 59, 0);
        pnprincipal.add(btnGuardar1, gridBagConstraints);
        getContentPane().add(pnprincipal, BorderLayout.CENTER);

        btnSalir.addActionListener(new EventoSalir());
        btnSalir.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, btnSalir));
        txtID.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, btnBuscar));


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

    public static FrmEditarProducto getEditarProducto() {
        return editarProducto;
    }

    public static void setEditarProducto(FrmEditarProducto editarProducto) {
        FrmEditarProducto.editarProducto = editarProducto;
    }



}

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

    private JButton btnBuscar,btnGuardar,btnSalir;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JLabel lbTitulo;
    private JPanel pnprincipal;
    private JTextField txtID;

    public static FrmEditarProducto editarProducto;

    public FrmEditarProducto() {
        ImageIcon icono =  new ImageIcon(getClass().getResource("/cafe/imagen/ICONO.png"));
        this.setIconImage(icono.getImage());
        GridBagConstraints gridBagConstraints;
        setBackground(colorPrimary);


        pnprincipal = new JPanel();
        lbTitulo = new JLabel();
        txtID = new JTextField();
        btnSalir = new JButton();
        btnGuardar = new JButton();
        btnBuscar = new JButton();
        jScrollPane1 = new JScrollPane();
        jTable1 = new Jtable(TituloTabla.Nuevo_registro, new Object[0][0]);


        pnprincipal.setBackground(colorPrimary);
        pnprincipal.setLayout(new GridBagLayout());

        lbTitulo.setBackground(new Color(255, 255, 255));
        lbTitulo.setFont(new Font("Roboto", 1, 24)); // NOI18N
        lbTitulo.setForeground(new Color(255, 255, 255));
        lbTitulo.setText("EDITAR  PRODUCTO");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(26, 112, 0, 0);
        pnprincipal.add(lbTitulo, gridBagConstraints);

        txtID.setBackground(colorPrimary);
        txtID.setFont(new Font("Roboto", 1, 14)); // NOI18N
        txtID.setForeground(new Color(255, 255, 255));
        txtID.setBorder(BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255)));

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 236;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(13, 41, 0, 0);
        pnprincipal.add(txtID, gridBagConstraints);
        txtID.getAccessibleContext().setAccessibleDescription("");

        btnSalir.setBackground(colorPrimary);
        btnSalir.setFont(new Font("Roboto", 1, 14)); // NOI18N
        btnSalir.setForeground(new Color(255, 255, 255));
        btnSalir.setText("SALIR");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(13, 41, 85, 0);
        pnprincipal.add(btnSalir, gridBagConstraints);

        btnGuardar.setBackground(colorPrimary);
        btnGuardar.setFont(new Font("Roboto", 1, 14)); // NOI18N
        btnGuardar.setForeground(new Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 31;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(13, 12, 85, 0);
        pnprincipal.add(btnGuardar, gridBagConstraints);

        btnBuscar.setBackground(colorPrimary);
        btnBuscar.setFont(new Font("Roboto", 1, 14)); // NOI18N
        btnBuscar.setForeground(new Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 296;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(28, 24, 0, 108);
        pnprincipal.add(btnBuscar, gridBagConstraints);

        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 648;
        gridBagConstraints.ipady = 242;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(56, 41, 0, 108);
        pnprincipal.add(jScrollPane1, gridBagConstraints);

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

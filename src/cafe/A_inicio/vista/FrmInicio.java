/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe.A_inicio.vista;


import cafe.A_BD.ConnectionBD;
import cafe.A_inicio.control.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.KeyEvent;

public class FrmInicio extends JFrame {
    private JLabel lbSalir, lbIcono, lbTitulo;

    private JPanel pnDerecho, pnIzquierda;
    private JTextField texClave, textUsuario;
    private JButton btntSalir;
    public static FrmInicio inicio;
    public  static Color colorPrimary = new Color(78, 52, 46);

    public FrmInicio() {
        GridBagConstraints gridBagConstraints;
        ImageIcon icono =  new ImageIcon(getClass().getResource("/cafe/imagen/ICONO.png"));
        this.setIconImage(icono.getImage());
        pnIzquierda = new JPanel();
        lbIcono = new JLabel();
        pnDerecho = new JPanel();
        lbTitulo = new JLabel();
        texClave = new JTextField();
        textUsuario = new JTextField();
        btntSalir = new JButton();
        lbSalir = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getContentPane().setLayout(new GridLayout(1, 1));

        pnIzquierda.setBackground(new Color(255, 255, 255));
        pnIzquierda.setLayout(new GridBagLayout());

        lbIcono.setIcon(new ImageIcon(getClass().getResource("/cafe/imagen/Imagen2_1.png"))); // NOI18N
        pnIzquierda.add(lbIcono, new GridBagConstraints());

        getContentPane().add(pnIzquierda);

        pnDerecho.setBackground(colorPrimary);
        pnDerecho.setLayout(new GridBagLayout());

        lbTitulo.setBackground(new Color(255, 255, 255));
        lbTitulo.setFont(new Font("Roboto", 1, 24)); // NOI18N
        lbTitulo.setForeground(new Color(255, 255, 255));
        lbTitulo.setText("INICIAR SESIÓN KONECTA CAFE");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(27, 52, 0, 49);
        pnDerecho.add(lbTitulo, gridBagConstraints);

        texClave.setBackground(colorPrimary);
        texClave.setFont(new Font("Roboto", 1, 14)); // NOI18N
        texClave.setForeground(new Color(255, 255, 255));
        texClave.setBorder(BorderFactory.createTitledBorder(null, "CLAVE (2022)", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255))); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 256;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(29, 52, 0, 49);
        pnDerecho.add(texClave, gridBagConstraints);

        textUsuario.setBackground(colorPrimary);
        textUsuario.setFont(new Font("Roboto", 1, 14)); // NOI18N
        textUsuario.setForeground(new Color(255, 255, 255));
        textUsuario.setBorder(BorderFactory.createTitledBorder(null, "USUARIO (KONECTA)", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255))); // NOI18N

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 256;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(77, 50, 0, 0);
        pnDerecho.add(textUsuario, gridBagConstraints);

        btntSalir.setBackground(colorPrimary);
        btntSalir.setFont(new Font("Roboto", 1, 14)); // NOI18N
        btntSalir.setForeground(new Color(255, 255, 255));
        btntSalir.setText("ENTRAR");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 185;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(50, 52, 0, 49);
        pnDerecho.add(btntSalir, gridBagConstraints);

        lbSalir.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        lbSalir.setForeground(new Color(255, 255, 255));
        lbSalir.setText("SALIR");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(39, 160, 93, 0);
        pnDerecho.add(lbSalir, gridBagConstraints);
        getContentPane().add(pnDerecho);
        btntSalir.addActionListener(new EventoBotonEntrarValidarUsuario(textUsuario, texClave));
        btntSalir.addKeyListener(new EventoTeclaValidarUsuario(KeyEvent.VK_ENTER, getTextUsuario(), getTexClave()));
        textUsuario.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, texClave));
        texClave.addKeyListener(new EventoTeclaSiguienteComponente(KeyEvent.VK_ENTER, btntSalir));
        lbSalir.addMouseListener(new EventoClicSalir());

        pack();

    }


    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmInicio inicio = getInstancia();
                inicio.setVisible(true);


            }
        });
    }

    public static FrmInicio getInstancia() {
        if (inicio == null) {
            inicio = new FrmInicio();
        } else {
            return inicio;
        }
        return inicio;
    }

    public JTextField getTexClave() {
        return texClave;
    }

    public void setTexClave(JTextField texClave) {
        this.texClave = texClave;
    }

    public JTextField getTextUsuario() {
        return textUsuario;
    }

    public void setTextUsuario(JTextField textUsuario) {
        this.textUsuario = textUsuario;
    }
}

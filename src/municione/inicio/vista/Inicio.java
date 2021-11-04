/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package municione.inicio.vista;


import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Inicio extends JFrame {
    private JLabel jLabel1,lbIcono,lbTitulo;

    private JPanel pnDerecho,pnIzquierda;
    private JTextField texClave,textUsuario;
    private JButton textSalir;

    public Inicio() {
        GridBagConstraints gridBagConstraints;

        pnIzquierda = new JPanel();
        lbIcono = new JLabel();
        pnDerecho = new JPanel();
        lbTitulo = new JLabel();
        texClave = new JTextField();
        textUsuario = new JTextField();
        textSalir = new JButton();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(1, 1));

        pnIzquierda.setBackground(new Color(255, 255, 255));
        pnIzquierda.setLayout(new GridBagLayout());

        lbIcono.setIcon(new ImageIcon(getClass().getResource("/municione/imagen/Imagen2_1.png"))); // NOI18N
        pnIzquierda.add(lbIcono, new GridBagConstraints());

        getContentPane().add(pnIzquierda);

        pnDerecho.setBackground(new Color(1, 135, 134));
        pnDerecho.setLayout(new GridBagLayout());

        lbTitulo.setBackground(new Color(255, 255, 255));
        lbTitulo.setFont(new Font("Roboto", 1, 24)); // NOI18N
        lbTitulo.setForeground(new Color(255, 255, 255));
        lbTitulo.setText("INICIAR SESIÓN ADMUN");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(27, 52, 0, 49);
        pnDerecho.add(lbTitulo, gridBagConstraints);

        texClave.setBackground(new Color(1, 135, 134));
        texClave.setFont(new Font("Roboto", 1, 14)); // NOI18N
        texClave.setForeground(new Color(255, 255, 255));
        texClave.setBorder(BorderFactory.createTitledBorder(null, "CLAVE", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255))); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 256;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(29, 52, 0, 49);
        pnDerecho.add(texClave, gridBagConstraints);

        textUsuario.setBackground(new Color(1, 135, 134));
        textUsuario.setFont(new Font("Roboto", 1, 14)); // NOI18N
        textUsuario.setForeground(new Color(255, 255, 255));
        textUsuario.setBorder(BorderFactory.createTitledBorder(null, "USUARIO", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, new Font("Roboto", 1, 14), new Color(255, 255, 255))); // NOI18N

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 256;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(77, 50, 0, 0);
        pnDerecho.add(textUsuario, gridBagConstraints);

        textSalir.setBackground(new Color(1, 135, 134));
        textSalir.setFont(new Font("Roboto", 1, 14)); // NOI18N
        textSalir.setForeground(new Color(255, 255, 255));
        textSalir.setText("ENTRAR");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 185;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(50, 52, 0, 49);
        pnDerecho.add(textSalir, gridBagConstraints);

        jLabel1.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("SALIR");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(39, 160, 93, 0);
        pnDerecho.add(jLabel1, gridBagConstraints);

        getContentPane().add(pnDerecho);

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }


}

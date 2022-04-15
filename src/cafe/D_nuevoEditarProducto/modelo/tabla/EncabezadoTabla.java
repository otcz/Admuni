package cafe.D_nuevoEditarProducto.modelo.tabla;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

import static cafe.A_inicio.vista.FrmInicio.colorPrimary;


public class EncabezadoTabla implements TableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JComponent jcomponent = null;
        if( value instanceof String ) {
            jcomponent = new JLabel((String) value);
            ((JLabel)jcomponent).setHorizontalAlignment( SwingConstants.CENTER );
            ((JLabel)jcomponent).setSize( 40, jcomponent.getWidth() );
            ((JLabel)jcomponent).setPreferredSize( new Dimension(6, jcomponent.getWidth())  );
        }         
   
        jcomponent.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, new Color(255, 255, 255)));
        jcomponent.setOpaque(true);
        jcomponent.setBackground( colorPrimary);
        jcomponent.setForeground(Color.white);
        jcomponent.setFont(new Font("reboto", 0, 14));
        
        return jcomponent;
    }


}

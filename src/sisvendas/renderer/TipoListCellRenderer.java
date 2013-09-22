/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisvendas.renderer;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import sisvendas.bean.admin.Tipo;


/**
 *
 * @author Neto
 */
public class TipoListCellRenderer extends DefaultListCellRenderer{
    
  
         public Component getListCellRendererComponent(
                   JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
               super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
             if (value instanceof Tipo) {
                 Tipo mec = (Tipo)value;
                  setText(mec.getTipo());
               }
               return this;
           }
            
}

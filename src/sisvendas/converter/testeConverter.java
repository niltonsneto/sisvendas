/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisvendas.converter;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Neto
 */
public class testeConverter extends Converter{

   

    @Override
    public Object convertReverse(Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object convertForward(Object value) {
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         String df = sdf.format(value);
         return df;
    }
    
}

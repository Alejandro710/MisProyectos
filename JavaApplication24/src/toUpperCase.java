
/**
 *
 * @author 
 */
import javax.swing.JOptionPane;
public class toUpperCase {
    
    public static void main (String[] args){
        String cadena = JOptionPane.showInputDialog(null, "Escribi algo:");
        JOptionPane.showMessageDialog(null,"La clase toUpperCase() hace esto: "+"´"+ cadena.toUpperCase()+"`");
    }
}


/**
 *
 * @author Alejandro
 */
import javax.swing.JOptionPane;
public class toUpperCase {
    
    public static void main (String[] args){
        String cadena = JOptionPane.showInputDialog(null, "Escribi algo:");
        JOptionPane.showMessageDialog(null,"el método toUpperCase() hace esto: "+"´"+ cadena.toUpperCase()+"`");
        
        //TOLOWERCASE()
        String cadena2 = JOptionPane.showInputDialog(null, "Escribi algo en mayuscula:");
        String minuscula = cadena2.toLowerCase();
        JOptionPane.showMessageDialog(null, minuscula);
        
        //STARTWITH("PARAMETRO")
        //compara si empieza con el parametro que marque. Devuelve true o false.
        String cadena3 = JOptionPane.showInputDialog(null, "Escribi algo :");
        boolean buleano = cadena3.startsWith("z");
        JOptionPane.showMessageDialog(null, buleano);
        
        //equals("parametro: la cadena que quiero comparar"): compara cadenas de caracteres;
        String cadena4 = JOptionPane.showInputDialog(null, "Escribi algo :");
        boolean buleano2 = cadena4.equals("curso");
        JOptionPane.showMessageDialog(null, buleano2);
        
        //replace("parametro") reemplaza en la cadena todas lo que sea igual al parametro
        String cadena5 = JOptionPane.showInputDialog(null, "Escribi algo :");
        String reemplazar = cadena5.replace("c","a");
        JOptionPane.showMessageDialog(null, reemplazar);
        
        //endWith("a") lo mismo que startWith()
        
        //indexOf("cadena") mostrar en que posicion esta la letra tal (puede ser el inicio de tal palabra) devuelve un entero
        
        //charAt("PARAMETRO")   le doy el indice de la posicion de la palabra y devuelve solo la letra;
        
        //length() // muestra la cantidad de indice que hay en la cadena. Empieza con 1 
        
        
    }
}

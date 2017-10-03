
package Animales;

/**
 *
 * @author Alejandro
 */
public class Principal {
    
    public static void main(String[] args) {
        Animal objeto1= new Animal();
        
        objeto1.setNombre("Lazy");
        objeto1.setPeso(20);
        objeto1.setAltura(1);
        
        System.out.println(objeto1.getNombre());
        System.out.println(objeto1.getPeso());
        System.out.println(objeto1.getAltura());
        
    }
}

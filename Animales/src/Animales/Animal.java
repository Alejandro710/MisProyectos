
package Animales;

/**
 *
 * @author Alejandro
 */
public class Animal {
    //Atributos:
    private double peso;
    private double altura;
    private String nombre;

    //--------------------------------------
    //Get Y set de los atributos:
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    //--------------------------------------
    //Constructor:
    public void Animal() {
       
    }
    
    //--------------------------------------
    //Métodos:
    public void Presentarse(){
        System.out.println("Mi nombre es : "+nombre);
    }
    
    public void Desplazarse(){
        System.out.println("Soy un animal y me muevo...");
    }
    
    //--------------------------------------
    //main con un objeto:
    /*
    public static void main(String[] args) {
        Animal obj2 = new Animal();
        obj2.nombre = "Firulais";
        obj2.setAltura(1.2);
        obj2.setPeso(5);
        
        System.out.println(obj2.nombre);
        System.out.println(obj2.getAltura());
        System.out.println(obj2.getPeso());
        
    }*/
}

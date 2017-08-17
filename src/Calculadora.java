/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Español
 */

    import java.util.Scanner;

public class Calculadora {
    
     int numero1 = 25;
    
    int numero2 = 25;
    
    int sumar;
    
    int restar;
    
    int multiplicar;
    
    
    public void sumar (){
        
        sumar = numero1+numero2;

        
    }
    
    public void mostrar (){
        
        System.out.println(sumar);
        
        System.out.println(restar);
        
        System.out.println(multiplicar);
        
    }
    
    public void restar (){
    
    
        restar = numero1-numero2;
        
}
    
    public void multiplicar(){
        
        multiplicar = numero1*numero2;
        
    }
    
    public static void main (String[]args){
        
        Calculadora calculo1 = new Calculadora();
        
        
        
        
        
        
        
        Scanner sc = new Scanner (System.in);
        //sc: objeto de la calase Scanner
        
        System.out.println("Ingrese el primer numero");
        
        calculo1.numero1 = sc.nextInt ();
        
        //calculo1: objeto (calculadora)
        //numero1: atributo
        //sc: objeto
        //nextInt: metodo
        
        System.out.println("Ingrese el segundo numero");
        
        calculo1.numero2 = sc.nextInt ();
        
        calculo1.sumar();
        
        
        
        System.out.println("La suma total es:"+calculo1.sumar);
        
    }
    
}
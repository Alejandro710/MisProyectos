/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Español
 */

//    import java.util.Scanner;

public class Calculadora {
    
     int numero1 = 25;
    
    int numero2 = 25;
    
    int sumar;
    
    int restar;
    
    int multiplicar;
    
    
    public void sumar (){
        
        sumar = numero1+numero2;

       System.out.println (sumar);
        
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
        
        calculo1.sumar();
        
        
        
    }
    
}

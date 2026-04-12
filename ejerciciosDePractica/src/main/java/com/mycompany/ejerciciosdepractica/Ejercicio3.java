
package com.mycompany.ejerciciosdepractica;
import java.util.Scanner;

public class Ejercicio3 {
    
    //Ejercicio 3¿, Guarde un numero, Muestre su tabla de multiplicar de 1 al 10

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Ingrese su numero: ");
       int numero = sc.nextInt();
       System.out.println("Las tablas del numero " + numero + " son:");
       
       for (int i = 1; i<=10; i++){
           
           int resultado = numero * i;
  
           System.out.println(numero + "*" + i + "=" + resultado);
           
       }
       
        
    }
    
}

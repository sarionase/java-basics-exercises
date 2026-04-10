
package com.mycompany.primeracomplementaria;
import java.util.Scanner;

public class Ejercicio6 {

  
    public static void main(String[] args) {
        // Promedio simple, pedir 3 numeros, calcular y mostrar el promedio
         float numero1 = 0;
         float numero2 = 0;
         float numero3 = 0;
        
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Ingrese el primer numero: ");
         numero1 = sc.nextFloat();
         
         System.out.println("Ingrese segundo numero: ");
         numero2 = sc.nextFloat();
         
         System.out.println("Ingrese tercer numero: ");
         numero3 = sc.nextFloat();
         
         double promedio = (numero1 + numero2 + numero3) / 3;
         
         System.out.println("el promedio de los numeros ingresados es: "+promedio);
    }
    
}

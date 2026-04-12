package com.mycompany.ejerciciosdepractica;
import java.util.Scanner;

public class Ejercicio1 {

    //Ejercicio 1, Guarde un numero
    //Calcule la suma de los números desde 1 hasta ese numero
    //Muestre el resultado final
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sumaTotal = 0;
        
        
        System.out.println("Ingrese un numero: ");
        int numeroIngresado = sc.nextInt();
        
        for(int i = 0; i<=numeroIngresado; i++){
            
            sumaTotal = sumaTotal + i;
            /*
            i = 0  0 = 0 + 0
            i = 1  1 = 0 + 1
            i = 2  3 = 1 + 2
            i = 3  6 = 3 + 3
            i = 4  10 = 6 + 4
          
            */
        }
        
        System.out.println("La suma total entre los numeros anteriores a " + numeroIngresado + " es: " +sumaTotal);
        
    }
    
}


package com.mycompany.primeracomplementaria;
import java.util.Scanner;

public class Ejercicio8 {

    
    public static void main(String[] args) {
        // Tabla múltiple. Pedir un numero, mostrar cuantas tablas desde ese numero hasta el doble
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");

        int numero = sc.nextInt();
        
        int doble = numero * 2;

        
        for (int i = numero; i <= doble; i++) {

            System.out.println("Tabla del " + i);
            for (int j = 1; j <= 10; j++) {

                System.out.println(i + " x " + j + " = " + (i * j));

            }
        }

       
    }
    
}


package com.mycompany.ejerciciosdepractica;
import java.util.Scanner;

/*
Ejercicio 9
	•	Pida al usuario un numero
	•	Muestre todos los números pares desde 1 hasta ese numero
	•	Indique cuántos números pares encontró
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int numero = sc.nextInt();
        int numeroPar = 0;
        
        for(int i = 1; i <= numero; i++){
            if(i % 2 == 0){
                numeroPar++;
                System.out.println(i);
                
            }
                
        }
        System.out.println("La cantidad de numeros pares es : " +numeroPar);
        
    }
    
}

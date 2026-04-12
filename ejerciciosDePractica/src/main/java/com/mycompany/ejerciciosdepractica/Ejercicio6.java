
package com.mycompany.ejerciciosdepractica;
import java.util.Scanner;

/*
 Ejercicio 6
	•	Pida al usuario un numero
	•	Indique si es positivo o negativo
	•	Muestre los números desde 1 hasta el número
 */
public class Ejercicio6 {

    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero ");
        int numero = sc.nextInt();
        
        if(numero >= 0){
            System.out.println("El numero ingresado es positivo");
            for(int i = 1; i<= numero; i++){
                System.out.println(i);
            }
            
        }else if(numero < 0){
            System.out.println("El numero ingresado es negativo");
            for(int i = 1; i >= numero; i--){
                System.out.println(i);
            }
        } 
    }  
}

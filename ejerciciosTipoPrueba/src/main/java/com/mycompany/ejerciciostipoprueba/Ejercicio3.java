
package com.mycompany.ejerciciostipoprueba;
import java.util.Scanner;

public class Ejercicio3 {
    //Ejercicio 3
		//Pida número al usuario
		//Termine cuando ingrese 0
		//Muestre el número menor ingresado

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numeroMenor = 99999; 
        
        while(true){
            System.out.println("Ingrese un numero: ");
            int numero = sc.nextInt();
            
            if (numero == 0){
                System.out.println("El numero menor ingresado es: " + numeroMenor);
                
                break;
            }if (numero<numeroMenor){
                numeroMenor = numero; 
            }
        }  
        
    }
    
}

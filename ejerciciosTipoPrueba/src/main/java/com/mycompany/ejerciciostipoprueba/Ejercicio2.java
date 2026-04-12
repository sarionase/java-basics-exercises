
package com.mycompany.ejerciciostipoprueba;
import java.util.Scanner;

public class Ejercicio2 {
    //Ejercicio 3
		//Pida número al usuario
		//Termine cuando ingrese 0
		//Muestre el número mayor ingresado

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numeroMayor = 0; 
        
        while(true){
            System.out.println("Ingrese un numero: ");
            int numero = sc.nextInt();
            
            if (numero == 0){
                System.out.println("El numero mayor ingresado es: " + numeroMayor);
                
                break;
            }if (numero>numeroMayor){
                numeroMayor = numero; 
            }
        }  
        
    }
    
}

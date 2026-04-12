
package com.mycompany.ejerciciosdepractica;
import java.util.Scanner;

/*
	•	Pida un numero al usuario
	•	Sume los números ingresados
	•	Termine cuando el usuario ingrese 0
	•	Muestre la suma total
 */
public class Ejercicio8 {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int sumaTotal = 0;
        
        
        while(true){
            
            System.out.println("Ingrese un numero: ");
        
            int numero = sc.nextInt();
            
            sumaTotal = sumaTotal + numero;
            
           
            if(numero ==0){
                System.out.println("La suma total es " + sumaTotal);
                break;
            }
            
        }

        
    }
    
}

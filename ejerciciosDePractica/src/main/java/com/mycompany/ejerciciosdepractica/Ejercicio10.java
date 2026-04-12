package com.mycompany.ejerciciosdepractica;
import java.util.Scanner;

public class Ejercicio10 {

    /*
    Ejercicio 10
	•	Pida al usuario un numero
	•	Recorra desde 1 hasta ese numero
	•	Por cada numero :
	•	Si es múltiplo de 3  Mostrar “Fizz”
	•	Si es múltiplo de 5  Mostrar “Buzz”
	•	Si es múltiplo de ambos  Mostrar “FizzBuzz”
	•	Si no cumple ninguna condición  mostrar el numero

    */
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        
        for(int i = 1; i <= numero; i++){

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
                
            }else if(i % 3 == 0){
                System.out.println("Fizz");
                
            }else if(i % 5 ==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
            
        }
        
    }
    
}


package com.mycompany.ejerciciosdepractica;


public class Ejercicio5 {
    /*
    Ejercicio 5
	•	Recorra los números del 1 al 20
	•	Por cada numero :
	•	Si es múltiplo de 3  Mostrar “Fizz”
	•	Si es múltiplo de 5  Mostrar “Buzz”
	•	Si es múltiplo de ambos  Mostrar “FizzBuzz”
	•	Si no cumple ninguna condición  mostrar el numero
    */

    
    
    
    public static void main(String[] args) {
        
        for(int i = 1; i<=20; i++){
            
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
                    
            }else if(i % 5 ==0){
                System.out.println("BUZZ");
                
            }else if(i % 3 == 0){
                System.out.println("FIZZ");
                
            }else{
                System.out.println(i);
            }
            
            
        }
        
    }
    
}

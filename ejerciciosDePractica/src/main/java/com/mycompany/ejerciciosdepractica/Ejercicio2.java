
package com.mycompany.ejerciciosdepractica;
import java.util.Scanner; 

public class Ejercicio2 {
    //Guarde un numero, Muestre una cuenta regresiva hasta 0, Al final muestre “Fin”

    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        int numeroFinal = 0;
        
        for(int i = 0; i <= numero; i++){
            
            numeroFinal = numero - i;
            System.out.println(numeroFinal);
            if(numeroFinal == 0){
                System.out.println("Fin");
            }
            
        }
        
    }
    
}

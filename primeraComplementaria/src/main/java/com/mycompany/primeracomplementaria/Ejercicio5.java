
package com.mycompany.primeracomplementaria;
import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[] args) {
        //Contar pares. Pedir numero, mostrar los números pares hasta ese numero, indicar cuántos hay
        
        Scanner sc = new Scanner(System.in);
                
        
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        int contadorPares = 0;
        
        
        
        for(int i = 0; i<=numero; i++){
            if(i % 2 == 0){
                contadorPares++;
                
                System.out.println("Numero par: " + i);
            }            
            
            
            
            
        }
    
     
      
        
        
        
        
       
        System.out.println("En total hay " + contadorPares + " numeros pares contando el 0");
                 
    }
    
}


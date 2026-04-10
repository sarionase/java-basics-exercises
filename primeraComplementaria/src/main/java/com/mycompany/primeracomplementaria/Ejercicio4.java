
package com.mycompany.primeracomplementaria;
import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
        // Suma de numeros. PEdir un numero, sumar todos desde 1 hasta ese numero, mostrar el resultado
        Scanner sc = new Scanner(System.in);
        
        int numero = 0;
        int resultado = 0;
        
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();
        
        for (int i = 1; i <= numero; i++){
            resultado = resultado + i;
           
        }
        
        System.out.println("El resultado es "+resultado);
               
        
    }
    
}

package com.mycompany.ejerciciostipoprueba;
import java.util.Scanner;

public class Ejercicio4 {
    
    //Ejercicio 4
		//Pida número al usuario (LISTO)
		//Termine cuando ingrese 0 (LISTO
		//Muestre:
		//  Suma de números pares (LISTO
		//  Suma de números impares (LISTO
    
                // extra cantidad de numeros ingresados

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sumaPares = 0;
        int sumaImpares = 0;
        int totalNumeros = 0;
        
        while(true){
            
            System.out.println("Ingrese su numero: ");
            int numero = sc.nextInt();
            
            if (numero == 0){
                
                System.out.println("La suma de los numeros pares es: "+ sumaPares);
                System.out.println("La suma de los numeros impares es: "+ sumaImpares);
                System.out.println("El total de numeros ingresados es " + totalNumeros);
                break;
                
                
            }else if(numero % 2 == 0){
                sumaPares = sumaPares + numero;
                totalNumeros++;
                
                
            }else if(numero % 2 != 0){
                sumaImpares = sumaImpares + numero;
                totalNumeros++;
            }
        }       
    }
}


package com.mycompany.primeracomplementaria;
import java.util.Scanner;

public class Ejercicio2 {

    
    public static void main(String[] args) {
        //Pedir un numero al usuario. Indicar si es mayor que 10, indicar si es menor o igual a 10
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        
        if(numero > 10){
            System.out.println("Su numero "+numero+ " es mayor a 10");
            
        }else if (numero <= 10){
            System.out.println("Su numero "+numero+ " es menor o igual a 10");
        }
        
    }
    
}

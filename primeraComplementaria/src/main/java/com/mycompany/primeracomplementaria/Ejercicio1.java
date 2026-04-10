
package com.mycompany.primeracomplementaria;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        //Mostrar numero: pedir un numero al usuario, mostrar los numeros desde 1 hasta ese número
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        
        for (int i = 1; i <= numero; i++){
            System.out.println(i);
            
        }
    }
}

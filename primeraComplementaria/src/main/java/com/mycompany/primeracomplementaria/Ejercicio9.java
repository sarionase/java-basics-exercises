
package com.mycompany.primeracomplementaria;
import java.util.Scanner;

public class Ejercicio9 {

    
    public static void main(String[] args) {
        // Numero mayor. Pedir 5 números, indicar cuál es el mayor entre todos
        Scanner sc = new Scanner(System.in);
        int numeroMayor = 0;
         
        System.out.println("Ingrese un numero para compararlo");
        int numero1 = sc.nextInt();
        numeroMayor = numero1;
        
        System.out.println("Ingrese otro numero para compararlo");
        int numero2 = sc.nextInt();
        if (numero2 > numeroMayor){
            numeroMayor = numero2;
        }
        
        System.out.println("Ingrese otro numero para compararlo");
        int numero3 = sc.nextInt();
        if (numero3 > numeroMayor){
            numeroMayor = numero3;
        }
        
        System.out.println("Ingrese otro numero para compararlo");
        int numero4 = sc.nextInt();
        if (numero4 > numeroMayor){
            numeroMayor = numero4;
        }
        
        System.out.println("Ingrese otro numero para compararlo");
        int numero5 = sc.nextInt();
        if (numero5 > numeroMayor){
            numeroMayor = numero5;
        }
        
        System.out.println("el numero mayor entre todos los ingresados es " + numeroMayor);
        
    
    }
    
}

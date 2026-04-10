
package com.mycompany.primeracomplementaria;
import java.util.Scanner;



public class Ejercicio7 {

    
    public static void main(String[] args) {
        //Pedir numeros al usuario.  seguir pidiendo hasta que se ingrese un 0
        //mostrar cuantos numeros se ingresaron, y luego una suma de ellos
       
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int resultado = 0;
       
        while(true){
            System.out.println("Ingrese numero");
            int numero = sc.nextInt();
            if (numero != 0){
                contador++;
                System.out.println("sumando al contador");
                resultado = resultado + numero;
                
                
           }else if(numero == 0){
               System.out.println("contador" + contador);
               System.out.println("el resultado de la suma total es " + resultado);
               break;
               
               
           }         
        }     
    }
    
}

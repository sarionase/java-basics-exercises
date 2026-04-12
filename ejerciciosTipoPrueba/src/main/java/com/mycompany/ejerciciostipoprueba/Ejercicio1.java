
package com.mycompany.ejerciciostipoprueba;
import java.util.Scanner;

//Ejercicio 1
		//Pida número al usuario
		//Termine cuando ingrese 0
		//Muestre:
		//La suma total
		//La cantidad de números ingresados

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  
        int sumaTotal = 0;
        int cantidadIngresada = 0;
       
        
        while(true){
            System.out.println("Ingrese un numero: ");
            int numero = sc.nextInt();
            cantidadIngresada++;
            sumaTotal = sumaTotal + numero;
            
            if (numero == 0){
                System.out.println("La suma total de los numeros ingresados es: " +sumaTotal);
                System.out.println("La cantidad total de numeros ingresados es: " +cantidadIngresada);
                break;
                
            }
        }
        
    }
}

package com.mycompany.ejerciciostipoprueba;
import java.util.Scanner;
public class Ejercicio5 {
    
    //Ejercicio 5
    //Pida número al usuario (LISTO)
    //Termine cuando ingrese 0 (LISTO)
    //Muestre Cantidad de números (LISTO)
    //Muestren Suma total (LISTO)
    //Muestren Número mayor (LISTO)
    //Muestren Número menor (
  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int contador = 0;
        int sumaTotal = 0;
        int numeroMayor = 0; 
        int numeroMenor = 9999; 
        
        while(true){
            
            System.out.println("Ingrese un numero: ");
            int numero = sc.nextInt();

            
            sumaTotal = sumaTotal + numero;
            
            contador++;      
           
            if (numero == 0){
                System.out.println("El contador es: " + contador); 
                System.out.println("La suma total es: "+ sumaTotal);
                System.out.println("El numero mayor es: " + numeroMayor);
                System.out.println("El numero menor es " + numeroMenor);
                break;
                
            }else if(numero > numeroMayor){
                numeroMayor = numero;
                
            }else if(numero < numeroMenor){
                numeroMenor = numero;
                
            }      
        }   
    }
}

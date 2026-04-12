
package com.mycompany.ejerciciosdepractica;

//Comience con un número en 1, Vaya sumando ese numero hasta que la suma sea mayor o igual a 20, Muestre la suma final
public class Ejercicio4 {

    public static void main(String[] args) {
        
        
        int sumaTotal = 0;
        int i = 1;
        
        while(true){
            
            sumaTotal = sumaTotal + i;
            i++;
            
            if(sumaTotal >= 20){
                
                System.out.println("La suma total es: "+sumaTotal);
                break;
                
              
            }
               
        }
        
    }
    
}

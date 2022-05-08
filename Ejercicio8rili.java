/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg8;

/**
 *
 * @author Fabian
 */
public class Ejercicio8 {

    /**
     Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 
3.  Utiliza el bucle que desees.
     * @param args
     */
    public static void main(String[] args) {
        int contador = 0;
       while (contador <= 100){
           contador ++;
          int resultado = (contador % 2) ;
          int resultado2 = contador %3;
          if (resultado == 0 & resultado2 == 0)
            {
            System.out.println(contador);
        }
       }
            
            
            
    }
    
    
}

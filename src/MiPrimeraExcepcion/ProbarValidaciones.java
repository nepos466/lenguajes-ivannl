/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiPrimeraExcepcion;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ProbarValidaciones {

    /**
     * si ponemos a su mama tendra que buscar al compilador para poder mostrar a la exception, poniendo a la clase Madre
     * Exception
     */
    public static void main(String[] args) {
      int edad=18;
        System.out.println("Vamos a validad tu edad depravado :3");
        try {
            
            ValidarEdad.validar(edad);
            System.out.println("Si tu te vez no se lanza la excepcion");
        } catch (MenordeEdadException ex) {
            // este metod lo tiene la mama exception, invocara el mnsj que viene en la clase super0
            System.out.println(ex.getMessage());
            
        } catch (NumberFormatException ex){
            System.out.println("Metiste letras y no numeros daaa no seas bobo :p ");
        }
        
        
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiPrimeraExcepcion;

// por herencia le diremos que se una Exception

public class MenordeEdadException extends Exception{
    
    // utilizaremos un constructor, se invoca un constructor con super
    
    public MenordeEdadException(){
        // super dentro un constructor se pone inmediatamente en la instruccion y dentro se pone el argumento que tiene 
        // el papa es el mnsj string 
        super("Eres un chamaco pervertido, le dire a tu mama!!, no te puedo registrar" + "Registrar" );
        
        
        
    }

}

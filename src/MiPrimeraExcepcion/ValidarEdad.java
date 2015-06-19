/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiPrimeraExcepcion;

/**
    Existen 3 tipos de clases:
    1.- Entidades(objetos de tu aplicacion) 
    2.- Clase modelo(contienen logica, aplicada a entidades)
    3.- Clases main ejecucion (Normalmente se crean objetos de las entidades y de las de modelo)
    // static en java se ejecuta primero y no se necesita crear un objeto.
throws lanza es para tercera persona implica la posibilidad para lanzar una excepcion, define la excepcion 
 */
public class ValidarEdad {

    public static void validar(int edad) throws MenordeEdadException {
    if(edad<18) throw new MenordeEdadException();
    
    
    
    }
}

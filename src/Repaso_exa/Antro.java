/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso_exa;

/**
 *
 * @author informatica
 */
public class Antro {


    public static void main(String[] args) {
        direccion d1=new direccion(551638, "Ecatepunk");
        //ecadenamiento de metodos//
        Usuario u1=new Usuario("juan",42,"jcampos@gmail.com",d1);
        // se llama invocacion de metodos en cadena, Refenciar que es lo que queremos del objeto esto es cuando se necesita 
        // el atributo que se encuentra en al clase direccion.
        System.out.println(u1.getDireccion().getmunicipio());
        
    }
    
}

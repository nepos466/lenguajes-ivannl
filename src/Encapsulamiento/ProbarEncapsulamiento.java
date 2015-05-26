/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

/**
 *
 * @author T-107
 */
public class ProbarEncapsulamiento {
   
    public static void main(String[] args) {
       Usuario u1=new Usuario();
       // nombre del objeto, accedo a los atributos siempre y cuando tenga el atributo e inicializo un valor
       // en java no hay asignacion de este tipo , todo es por medio de metodos
       //u1.nombre="Ivan Nepo :3";
       //u1.edad=21;
       //System.out.println("Tu edad es:"+u1.edad);
       
       u1.setEdad(42);
        System.out.println("Tu edad es:"+" "+u1.getEdad());
        
       
    }
    
}

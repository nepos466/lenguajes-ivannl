/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referenciados;

/**
 *
 * @author T-107
 */
public class ProbarRefenciados {

   // Clases Wrapper
    public static void main(String[] args) {
       Integer entero=new Integer("4");
       Float flotante=new Float("7.0");
       
       float operacion=entero+flotante;
        System.out.println(operacion);
        
    }
    
}

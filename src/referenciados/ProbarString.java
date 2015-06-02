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
public class ProbarString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Clase String
        // ambos son objetos 
        String hola="hola";
        String Hola2=new String("hola2");
        // arreglo de enteros los corchetes pueden ir al principio o al final
        int[]entero={4,25,12,-7};
        //De String
        String bb[]={"uno","dos","tres",":3"};
        System.out.println(bb.length);
        
        // creo el arreglo y lo dejo vacio, con el metodo new, los arreglos a los primitivos son tratados como objetos
        int mas[]=new int[3];
        int primitivo;
        System.out.println(mas[1]);
        
        
        
       
    }
    
}

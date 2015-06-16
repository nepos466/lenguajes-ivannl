/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UncheckedExceptions;

/**
 *
 * @author T-107
 */
public class ProbarExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // veremos AnthmeticException esto revisa las divisiones con 0
    //float conforme a los casting no se pueden dividir los enteros entre cerom el flotante no existe la aritmeticaException
    // el float es mayor que el int
        
        float a=5;
        int b=0;
        //uncheck no revisa el error hasta correr el programa (tiempos de ejecucion)
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a-b);
        
        //unchek hasta que se ejecuta ocurre 
        // clase wraper
        // error NumberFormatException
        Integer i=new Integer("5");
        int otro =5;
        System.out.println(i+otro);
        //  arrayIndexOut0 porque pide la pocision 4 y solo tenemos 3 pocisiones
        // cuando hay un error de exception el programa se corta donde encuentra el error al compilar ya que son errores
        //unchek
        int[] m={2,5,6,7};
        System.out.println(m[3]);
    }
    
}

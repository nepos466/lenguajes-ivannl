/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

/**
 *
 * @author T-107
 */
//Heredando la clase Thread
public class PrimerThread extends Thread {
   // se aplica el metodo run 
    public void run(){
        // mientras 
        while(true){
        // lo pondremos en pausa 
        try{
            // un thread debe de llevar un tiempo para que otros tomen la CPU, despierta al thread 
            Thread.sleep(1000);
        System.out.println("Yo soy el primer thread");
        }catch(InterruptedException e){
        }
        }// Se cierra el while.
        
    }
    
}

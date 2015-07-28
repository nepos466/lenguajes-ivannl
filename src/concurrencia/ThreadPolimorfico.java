/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

import java.util.Calendar;

/**
 *
 * @author T-107
 */
//este es el segundo metodo del thread por medio del polimorfismo.
 // ahora hacer una interfaz de usuario para simular el reloj       
public class ThreadPolimorfico implements Runnable {
public static void main(String[] args){

    Runnable r=new ThreadPolimorfico();
    Thread t1=new Thread(r);
    while(true){
    try{
        Thread.sleep(1000);
        // vamos a crear el reojito chafa
        // clase calendar 
        Calendar cal=Calendar.getInstance();
        int hora =cal.get(Calendar.HOUR);
        int minutos=cal.get(Calendar.MINUTE);
        int segundos=cal.get(Calendar.SECOND);
        System.out.println(hora+": "+minutos +": "+ segundos+":");
        
    }catch(Exception e){
    
    }    
}
}    @Override
    public void run() {
        
    }
    
}

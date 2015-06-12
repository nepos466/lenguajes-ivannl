/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author T-107
 */
public class Chapultepec {
    public static void main(String[] args) {
    /* 
    Animal raro=new Animal();
      raro.setEdad(2);
      raro.setNombre("Rareza");
    Tortuga animal1=new Tortuga();
      animal1.setNombre("japonesa");
      animal1.setEdad(12);
    Leon animal2=new Leon();
      animal2.setNombre("Africano");
      animal2.setEdad(20);
       */
    // vamos a crear animalitosss :3
        Pollo p1=new Pollo();
                p1.setNombre("pollito pio");
                
        Leon  l1=new Leon();
                l1.setNombre("simba");
                
        Leon  l2=new Leon();
                l2.setNombre("Mufasa");
                
        Delfin d1=new Delfin();        
                d1.setNombre("Flipper");
       //para hacer el ciclo for se crea un arreglo
                
       ComportamientoRuido animales[]=new ComportamientoRuido[4];
       //inicializar al primer lugar p1, elemento 0, se esta haciendo un casting, el arreglo es polimorfico
       animales[0]=p1;
       animales[1]=l1;
       animales[2]=l2;
       animales[3]=d1;
       // interface se invocara el metodo hacer ruido
       for(ComportamientoRuido algo:animales){
           //se invoca al subtipo animales 
           // no hemos usado la herencia, para imprimir el nombre tenemos que poner el getNombre en las clases de los animales
           // ya que la heredan los animales de la interface Animal
       System.out.print(algo.haceRuido());           
       }
       
        
                
              
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

public class InterfazImc {
    
   public static void main(String oso[]){
   
       //  objeto    constructor
       Imc imc=new Imc(80,1.67f);
       imc.setPeso(90);
   
       System.out.println(imc.calcular());
       System.out.println(imc.getPeso());
    
       
  // Primitivos integrales
       byte b=2;
       short s=2;
       int i=2;
       long l=2; 
       
      b=(byte)s;
      s=b;
      i=(int)l;
      i=s;
      s=(short)i;
      // el double es el valor por defecto
      float f=2.0f;
      double d=2.0;
      
     // el valor de false es por defecto
     
     boolean valor=false;
     // el constructor por defecto el false porque inicializa el valor por defecto de todos los atributos
     Imc otro=new Imc();
     otro.setFlaco(true);
       System.out.println(otro.isFlaco());
     
}
}

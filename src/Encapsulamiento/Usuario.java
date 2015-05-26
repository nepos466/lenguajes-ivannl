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
public class Usuario {
    //Primer regla de encapsulamiento
private String nombre;
private int edad;

/*public void setNombre(String nombre) {
    // this señala quien es el atrributo mientras que el otro es el atributo local, cuando nos marca en amarillo se esta 
    //haciendo ciclica el nombre del atributo con el nombre del objeto
 this.nombre=nombre;
 
}
public void setEdad(int edad){
this.edad=edad;
}
// ahora se crean los metodos Get los cuales pediran los valores
// las clases logicas son todas las que no llevan un metodo main
public String getNombre(){
return nombre;
}
public int getEdad(){
return edad;
}  
}
*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad){
       
        this.edad = edad;
    }
}

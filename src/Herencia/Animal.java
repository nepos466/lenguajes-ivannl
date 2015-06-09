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
// impide crear un objeto apartir de ella no se es coherente crear un objeto animal de la clase animal tipo animal de un tipo
//animal daaa :p
// el public y el abstract son modificadores
// los metodos son acciones o comportamientos
// regla 1 polimorfismo:
// cualquier cosa que sea constante y repetible puedes sacarlos y ponerlos en una super clase
// Regla 2 (polimorfismo):
// Si existen comportamientos o implementacion varia en su regla o entre su familia no se puede poner en una super clase, por 
// ellos tiene que ser una interfaz(es una entidad que es solo poner implementaciones que varian de las familias)

    
abstract public  class Animal {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}

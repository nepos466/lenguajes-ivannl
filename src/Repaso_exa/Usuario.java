/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso_exa;

/**
 *
 * @author informatica
 */
public class Usuario {
    private String nombre;
    private int edad;
    private String Email;
    private direccion Direccion;
    
    // constructor que inicializa a los atributos
    public Usuario(String nombre, int edad, String Email, direccion Direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.Email = Email;
        this.Direccion = Direccion;
    }
    
    //constructor por defecto se llama igual que la clase
    public Usuario(){  
    }
    // constructor que inicialize a los atributos
    

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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public direccion getDireccion() {
        return Direccion;
    }

    public void setDireccion(direccion Direccion) {
        this.Direccion = Direccion;
    }
    
}

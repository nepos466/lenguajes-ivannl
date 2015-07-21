/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colletions;

/**
 *
 * @author T-107
 */
public class Usuario {
    private String Nombre;
    private Integer edad;
    private String email;

    public Usuario(String Nombre, Integer edad, String email) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.email = email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}

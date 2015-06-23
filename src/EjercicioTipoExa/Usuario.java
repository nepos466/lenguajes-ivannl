/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioTipoExa;

/**
 *
 * @author T-107
 */
public class Usuario  {
    private String nombre;
    private int edad;
    private String email;
    private Direccion direccion;
    
     //Constructor por defecto****
    public Usuario(){
        
         
    }
    //unicializar las variables con constructores (El constructor que inicializa los atributos)****
    public Usuario(String nombre, int edad, String email, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.email= email;
        this.direccion = direccion;
    }
    
    

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
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
   

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public Direccion getDireccion() {
        return direccion;
    }

    void getNombre(String juan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
   
    
    
}

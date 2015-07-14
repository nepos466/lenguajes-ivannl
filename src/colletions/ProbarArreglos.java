/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colletions;

import java.util.ArrayList;

/**
 *
 * @author T-107
 */
public class ProbarArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //constructor generdor de usuarios invocar al constructor
        GeneradorDeUsuario generadora=new GeneradorDeUsuario();
        generadora.agregarUsuario("chana", 18, "chanayomera@hotmail.com");
        // la variable usuarios ya contiene los 3 usuarios creados
        // metodo size() 
        ArrayList<Usuario> usuarios=(ArrayList<Usuario>)generadora.getUsuarios();
        // size muestra el contenido del arreglo nos mostrara un 3 porque agregamos 3 usuarios.
        System.out.println(usuarios.size());
        // vamos a interar, despues de los dos puntos se pone comun el arreglo que es usuarios
        for(Usuario u:usuarios){
            System.out.println("Nombre: "+u.getNombre()+"   "+"edad:"+" "+u.getEdad()+"  "+"Email:  "+u.getEmail());
        }
    }
    
}

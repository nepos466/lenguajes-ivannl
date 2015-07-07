/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colletions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-107
 */
public class GeneradorDeUsuario {
    // lo haremos directamente de la clase List, se importa import java.util.List;
    // La notacion List<Usuario> esto creara uan lista de usuarios, se llama lista generica, son genericos a un tipo en
    // caso Usuario, solo se agregan en el enlistado solo objetos de la clase usuario
    private List<Usuario> usuarios;
    // constructor que inicialize los atributos
    public GeneradorDeUsuario(){
    Usuario u1=new Usuario("juan", 42,"jc@gmail.com");
    Usuario u2=new Usuario("Ivan", 21, "nepos466@gmail.com");
    Usuario u3=new Usuario("kathya", 19, "katha_juarez@hotmail.com");
    
    usuarios=new ArrayList<Usuario>();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    
}

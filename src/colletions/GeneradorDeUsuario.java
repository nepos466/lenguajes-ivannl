/*
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
    // caracteristica de los coleccion tienen clases y metodos de ordenamiento, tienen el potencial de usarse para 
    //construir prototipos de bases de datos NoSQL *Nota: 
    private List<Usuario> usuarios;
    // constructor que inicialize los atributos
    public GeneradorDeUsuario(){
    Usuario u1=new Usuario("juan", 42,"jc@gmail.com");
    Usuario u2=new Usuario("Ivan", 21, "nepos466@gmail.com");
    Usuario u3=new Usuario("kathya", 19, "katha_juarez@hotmail.com");
    Usuario u4=new Usuario("pancha", 60, "pancha@hotmail.com");
    
    //metodo add agregamos usuarios en el ArrayList
    usuarios=new ArrayList<Usuario>();
    usuarios.add(u1);
    usuarios.add(u2);
    usuarios.add(u3);
    usuarios.add(u4);
    
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    // este metodo agrega a un usuario en el ArrayList
    public String agregarUsuario(String nombre, int edad, String email){
    Usuario u=new Usuario(nombre, edad, email);
    //agregar usuarios se invoca y se le da los valores al arraylist
    usuarios.add(u);
    return "Usuario Agregado Con Exito";
    }
    
    
}

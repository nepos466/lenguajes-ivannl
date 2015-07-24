/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

/**
 *para que puedamos ingresar mas animales se borra el archivo creado de animalitos
 * 1.- creamo un arrayList de animales
 */
import java.io.*;
import java.util.ArrayList;

public class ModeloPersistenciaAnimal {
 //creamos un atributo para recuperar buscartodo
    String ruta="D:\\documentos\\Animalitos.xxx";
    ArrayList<Animal> animales;
    public ModeloPersistenciaAnimal(){
    animales=new ArrayList<Animal>();
    }
    
    
    public void guardar(Animal animal) throws Exception{
        // paso 1 crear el archivo donde se guardara el animal.
        // para crear 
        File file=new File(ruta);
        // el if es para ver si ya existe el archivo
        if(file.exists()){
         animales=buscarTodos();
        }
        FileOutputStream fos=new FileOutputStream(file);
        //Clase compresora:
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        animales.add(animal);
        //write objet lo comprime como objeto en java
        oos.writeObject(animales);
        System.out.println("Animalito comprimido con exito");
    
    }
    public ArrayList <Animal> buscarTodos() throws Exception {
    Animal a=new Animal();
    File f=new File(ruta);
    FileInputStream fis=new FileInputStream(f);
    ObjectInputStream ois=new ObjectInputStream(fis);
    // invocar el readObject quiere decir que es un tipo de retorno                  
                      animales=(ArrayList<Animal>) ois.readObject();
                      return animales;
    }
    
}

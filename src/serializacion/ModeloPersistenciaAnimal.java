/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

/**
 *
 * @author T-107
 */
import java.io.*;

public class ModeloPersistenciaAnimal {
 
    public void guardar(Animal animal) throws Exception{
        // paso 1 crear el archivo donde se guardara el animal.
        // para crear 
        File file=new File("D:\\documentos\\Animalitos.xxx");
        FileOutputStream fos=new FileOutputStream(file);
        //Clase compresora:
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //write objet lo comprime como objeto en java
        oos.writeObject(animal);
        System.out.println("Animalito comprimido con exito");
    
    }
    
}

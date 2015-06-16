/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChekedException;

/**
 *
 * @author T-107
 */

// import se declara debajo del package 
//este paquete es imput ouput
// el asterico; es utilizar todas las clases dentro del paquete 
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProbarCheked {

    /**
     * @param args the command line arguments
     */
    // para quitar el error al borrar el tyr y el cache en el main se pone throws IOException,FileNotFoundException
    // o bien se puede cargar a la clase madre 
    //thows es lanzar 
    public static void main(String[] args) throws Exception{
        // Crear un archivo 
        // esa clase file con su contrcutor permite crear un archivo
        File f=new File("Archivaldo");
        //try{
        // acepta un archivo anterior esto es encadenar, esto es una check
        FileOutputStream fos=new FileOutputStream(f);
        // nos vuelve a marcar error
        //aqui no solo vera la existencia del archivo, no se podra escribir con esta clase
        
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //}
        //catch (FileNotFoundException ex){
            
        //} catch (IOException ex) {
        // cualquiera que hayamos puesto la mama podra cachar todo y siempre ira abajo   
        // cuando se pone FileNotFoundException Exception poner error eso pasa por poner a la mama enfrente
        
        //} catch(Exception e){
        
        //}
        
        
    }
    
}

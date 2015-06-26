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
public class Android {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion d1=new Direccion(551638, "Ecatepunk");
        //ecadenamiento de metodos//
        Usuario u1=new Usuario("juan",42,"jcampos@gmail.com",d1);
        // se llama invocacion de metodos en cadena, Refenciar que es lo que queremos del objeto esto es cuando se necesita 
        // el atributo que se encuentra en al clase direccion.
        System.out.println(u1.getDireccion().getMunicipio());
        
        Bebida bebida=new Bebida();
        //bebida ajusta su tipo por set alcoholicas
        bebida.setTipo("alcoholicas");
        String[]reco =bebida.ObtenerRecomendaciones();
        for(String be:reco){
            System.out.println("bebida"+be);
        }
    }
    
}

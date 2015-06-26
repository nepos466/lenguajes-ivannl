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
public class Bebida {
   private String tipo;
   private String []bebidas;
   
   //regresar si tipo de bebidas
   public String [] ObtenerRecomendaciones(){
       
    // el equals es comparador de contenidos   
       if(tipo.equals("alcoholicas")){
       String[]bebida_alcolicas={"Wisky","Torres10","Bukans","Tequila","Vodka"};
       return bebida_alcolicas;
       }
       else{
       String[]bebida_no_alcolicas={"Agua","redbull","moster","coca","pepsi"};
       return bebida_no_alcolicas;
       }
       
   }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(String[] bebidas) {
        this.bebidas = bebidas;
    }
   
   
   
}

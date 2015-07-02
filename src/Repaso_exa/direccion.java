/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso_exa;

/**
 *
 * @author informatica
 */
class direccion {
    private String calle;
    private int numero;
    private String colonia;
    private int cp;
    private String municipio;
    
    // constructor que inicializa a los atributos
    public direccion(int cp){
    this.cp=cp;
    }
    public direccion(int cp, String municipio){
    this.cp=cp;
    this.municipio=municipio;
    }
   
    public String getcalle(){
    return calle;
    
    }
    public void setcalle(String calle){
    this.calle= calle;
    }
    
    public int getnumero(){
    return numero;
    }
   
    public void setnumero(int numero){
    this.numero=numero;
    }
    
    public String getcolonia(){
    return colonia;
    }
    
    public void setcolonia(String colonia){
    this.colonia=colonia; 
    }
    
    public int getcp(){
    return cp;
    }
    
    public void setcp(int cp){
    this.cp=cp;
    }
    
    public String getmunicipio(){
    return municipio;
    }
    
    public void setmunicipio(String municipio){
    this.municipio=municipio;
    }


}

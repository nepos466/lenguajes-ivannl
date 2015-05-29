/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-107
 */
public class Imc {
    private float peso;
    private float altura;
    // aqui declaramos un atributo para comprobar al boolean, ya que los constructores inicializan los valores por defecto
    // de los atributos
    private boolean flaco;
    
    ///


    public void setFlaco(boolean flaco) {
        this.flaco = flaco;
    }
    
    public boolean isFlaco(){
    return flaco;
    }
    //// 
    public Imc(float p, float a){
    peso=p;
    altura=a;
    }

    public float calcular (){
    float imc=peso/(altura*altura);
    return imc;
       
    }
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getAltura() {
        return peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
   
    public Imc(){
    
    }
}

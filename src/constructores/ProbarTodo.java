/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

import javax.swing.JFrame;

/**
 *
 * @author T-107
 */
public class ProbarTodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //refenrecia       //instancia(constructor de la clase)
        Test1 objeto1=new Test1(15);
        Test1 objeto2=new Test1();
        
        JFrame ventana=new JFrame("Mi primer ventana");
               ventana.setSize(400, 400);
               ventana.setVisible(true);
    }
    
}


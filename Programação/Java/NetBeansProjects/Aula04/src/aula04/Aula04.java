/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author nilson
 */
public class Aula04 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        //Instanciando o objeto caneta
        //primeira caneta.
        Caneta c1 = new Caneta();
        
        
        //Modificando seus atributos
        c1.modelo = "BIC";
        c1.setPonta(0.5f);
        c1.setCor("amarela");
        
        //Chamando seus métodos
        c1.tampar();
        c1.status();        
       
    }
    
}

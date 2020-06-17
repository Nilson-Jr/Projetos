/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_3;

/**
 *
 * @author nilson
 */
public class Aula04_3 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        //Instanciando o objeto passando parâmetros para o método construtor
        //primeira caneta.
        Caneta c1 = new Caneta("BIC", "Vermelha", 1.5f);
        
        //Pegando(com o método get) os valores de seus atributos
        System.out.println("Tenho uma caneta " + c1.getModelo() + ", de cor " + c1.getCor() + ", ponta " + c1.getPonta() + "." + " Ela está tampada? " + c1.getTampada());        
                        
    }
    
}


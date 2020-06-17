/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_2;

/**
 *
 * @author nilson
 */
public class Aula04_2 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciando um objeto da Classe Caneta que, neste exemplo, já tem um método construtor
        //primeira caneta
        Caneta c1 = new Caneta();
        
        //Pegando(com o método get) o valor de seus atributos
        System.out.println("Tenho uma caneta " + c1.getModelo() + ", de cor " + c1.getCor() + "e de ponta " + c1.getPonta() + "." + " Ela está tampada? " + c1.tampada);        
        
    }
    
}


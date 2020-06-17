/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_4;

/**
 *
 * @author nilson
 */
public class Aula04_4 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        //Instanciando o objeto passando parâmetros para o método construtor
        //primeira caneta.
        Caneta c1 = new Caneta("BIC", "Vermelha", 1.5f, true);
        
        //Chamando os seus métodos
        //Método estado atual que, ao ser chamado, imprime o estado atual da caneta definido no método construtor.
        c1.status();
        
        //Pegando(com o método get) os valores de seus atributos, definidos no método construtor, e mostrando na tela
        System.out.println("Tenho uma caneta " + c1.getModelo() + ", de cor " + c1.getCor() + ", ponta " + c1.getPonta() + "." + " Ela está tampada? " + c1.getTampada());        
                        
    }
    
}

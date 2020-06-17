/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author nilson
 */
public class Caneta {
    //Declaração dos atributos/variáveis da Classe
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    //Declaração dos métodos da Classe
    void status() {
        System.out.println("Uma caneta modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ela está tampada? " + this.tampada);
        
    } 
    
    void rabiscar () {
        if (this.tampada == true) {
            System.out.println("Como a caneta está tampada, ninguém pode rabiscar com ela.");
        } else {
            System.out.println("Como a caneta está destampada, qualquer pessoa pode rabiscar com ela.");
        }
                
    }
    
    //métodos especiais setters/modificadores
    void tampar() {
        this.tampada = true;                
    }
    
    void destampar() {
        this.tampada = false;        
    }
    
}

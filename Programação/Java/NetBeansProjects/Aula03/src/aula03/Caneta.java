/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

/**
 *
 * @author nilson
 */
public class Caneta {
    //Declaração dos atributos/variáveis da Classe
    public    String  modelo;
    public    String  cor;
    public    float   ponta;
    protected int     carga;
    private   boolean tampada;
    
    //Declaração dos métodos da Classe
    public void status() {
        System.out.println("Uma caneta modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ela está tampada? " + this.tampada);
        
    } 
            
    public void rabiscar () {
        if (this.tampada == true) {
            System.out.println("Erro: Como a caneta está tampada ninguém pode rabiscar com ela.");
        } else {
            System.out.println("Estou rabiscando.");
        }
                
    }
    
    //métodos especiais setters/modificadores
    public void tampar() {
        this.tampada = true;                
    }
    
    public void destampar() {
        this.tampada = false;        
    }
    
}

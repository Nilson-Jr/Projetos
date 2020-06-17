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
public class Caneta {
    //Declaração das variáveis da Classe
    public  String modelo;
    private float ponta;
    private String cor;
    public boolean tampada;
    
    //Declaração dos métodos especiais da Classe
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public String getCor() {
        return this.cor;        
    }
    
    public void setCor(String c) {
        this.cor = c;
    }
    
    //Declaração de métodos de ação
    public void tampar() {
        this.tampada = true;        
    }    
    public void destampar() {
        this.tampada = false;        
    }  
    
    //Declaração do método de estado atual da Classe
    public void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Pont: " + this.getPonta());
        System.out.println("Ela está tampada? " + this.tampada);        
    }
    
    //Criando o método construtor da Classe
    //sem receber parâmetros
    
    public Caneta() {
        this.modelo = "BIC";
        this.cor = "Azul";
        this.ponta = 0.5f;  
        this.tampar();
    
    }    
    
}

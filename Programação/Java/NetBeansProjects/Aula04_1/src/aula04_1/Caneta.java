/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_1;

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
    
    public void tampar() {
        this.tampada = true;        
    }    
    public void destampar() {
        this.tampada = false;        
    }

    //Método estado atual
    public void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Pont: " + this.getPonta());
        System.out.println("Ela está tampada? " + this.tampada);        
    }
    
}

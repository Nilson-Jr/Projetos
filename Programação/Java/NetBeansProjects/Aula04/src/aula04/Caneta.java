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
public class Caneta {
    public  String modelo;
    private float ponta;
    private String cor;
    public boolean tampada;
    
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
    public void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Ela está tampada? " + this.tampada);        
    }
    
}


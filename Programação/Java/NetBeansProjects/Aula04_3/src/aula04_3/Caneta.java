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
public class Caneta {
    private  String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
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
    
    public boolean getTampada() {
        return this.tampada;
    }
    
    public void setTampada(boolean t) {
        this.tampada = t; 
    }
    
    public void tampar() {
        this.tampada = true;        
    }    
    public void destampar() {
        this.tampada = false;        
    }    
    public void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Pont: " + this.getPonta());
        System.out.println("Ela está tampada? " + this.tampada);        
    }
    
    //Criando o método construtor da Classe recebendo parâmetros

    public Caneta(String m, String c, float t) {
        this.modelo = m;
        this.cor = c;
        this.ponta = t;
        this.tampar();
    
    }
    
    
}
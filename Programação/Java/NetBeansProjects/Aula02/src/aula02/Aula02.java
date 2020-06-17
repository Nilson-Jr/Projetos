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
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Instanciando o objeto
        // Primeira caneta:
        Caneta c1 = new Caneta();
        
        // Modificando os atributos do objeto
        c1.modelo = "Bic Cristal";
        c1.cor = "preta";
        c1.ponta = 0.5f;
        c1.carga = 1;
        c1.tampada = true;
        
        // Chamando os métodos do objeto
        c1.status();
        c1.rabiscar();
        
        // Instanciando o objeto
        // Segunda caneta:
        Caneta c2 =  new Caneta();
        
        // Modificando os atributos do objeto
        c2.modelo = "Faber Castell";
        c2.cor = "vermelha";
        c2.ponta = 1.0f;
        c2.carga = 1;
        c2.tampada = false;
        
        // Chamando os métodos do objeto
        c2.status();
        c2.rabiscar();
        
    }
    
}

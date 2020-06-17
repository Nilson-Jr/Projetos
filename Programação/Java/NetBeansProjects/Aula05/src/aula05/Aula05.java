/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author nilson
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciando o primeiro objeto ContaBanco
        ContaBanco c1 = new ContaBanco();
        
        //Chamando os seus métodos
        c1.setNumConta(111);
        c1.setDono("Jubileu");
        c1.abrirConta("cc");
        c1.depositar(100);
        c1.sacar(150);
        c1.fecharConta();

        //Instanciando o segundo objeto ContaBanco
        ContaBanco c2 = new ContaBanco();
        
        //Chamando os seus métodos
        c2.setNumConta(222);
        c2.setDono("Creuza");
        c2.abrirConta("cp");
        c2.depositar(500);
        c2.sacar(1000);
        
        //Mostrando o estado atual dos objetos
        c1.estadoAtual();
        c2.estadoAtual();
    }
    
}

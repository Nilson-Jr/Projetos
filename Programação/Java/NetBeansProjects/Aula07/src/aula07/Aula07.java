/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

/**
 *
 * @author nilson
 */
public class Aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Instanciando o primeiro objeto
        
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        
        l[0].setPeso(50);
        //l[0].setCategoria();
        l[0].empatarLuta();
        l[0].status();
        
        // Instanciando o segundo objeto
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        
        l[1].setPeso(100);
        l[1].ganharLuta();
        l[1].status();
}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author nilson
 */
public interface Controlador {
    //Declaração dos métodos abstratos. Resumindo:
    //É só uma listra de métodos
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}

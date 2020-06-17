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
public class ContaBanco {
    //Declaração das variáveis
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Declaração dos métodos personalizados
    public void estadoAtual() {
        System.out.println("--------------------------------------");
        System.out.println("Extrato: ");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo em conta: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "cc") {
            this.setSaldo(50);
        } else if (t == "cp") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
        
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta de " + this.getDono() + " com saldo. A conta não pode ser encerrada.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta de " + this.getDono() + "com débito. A conta não pode ser encerrada.");
        }else {
                this.setStatus(false);
                System.out.println("Conta de " + this.getDono() + " fechada com sucesso!");
        }
        
    }    
    
    
    public void depositar(float v) {
        if (getStatus() == true) {
            this.setSaldo(getSaldo() + v);
            System.out.println("Depósito de " + v + " Reais na conta de " + this.getDono() + " realizado com sucesso!");
        } else {
            System.out.println("Impossível realizar depositos na conta de " + this.getDono() + ". A conta está fechada.");
        }
    }
    
    public void sacar(float v) {
        if (getStatus() == true) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque de " + v + " Reais na conta de " + this.getDono() + " realizado com sucesso.");
            } else {
                System.out.println("Erro ao sacar " + v + " Reais da conta de " + this.getDono() + ". Saldo insuficiente.");
            }
        } else {
            System.out.println("Impossível realizar o saque na conta de " + this.getDono() + ". A conta está encerrada.");
        }
        
    }
    
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "cc") {
            v = 12;
        } else if (this.getTipo() == "cp"){
            v = 20;
        }
        if (this.getStatus() == true) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Pagamento de " + this.getDono() + "realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente na conta de " + this.getDono() +".");
            }
        } else {
            System.out.println("Impossível realizar o pagamento na conta de " + this.getDono() + ". Conta encerrada.");
        }
    }
    
    //Declaração dos métodos especiais
    //construtor
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    //especiais
    public void setNumConta(int n) {
        this.numConta = n;
    }
    
    public int getNumConta() {
        return this.numConta;
    }
    
    public void setTipo(String t) {
        this.tipo = t;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setDono(String d) {
        dono = d;
    }
    
    public String getDono() {
        return dono;
    }
    
    public void setSaldo(float s) {
        saldo = s;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    public void setStatus(boolean st) {
        status = st;
    }
    
    public boolean getStatus() {
        return status;
    }
    
}

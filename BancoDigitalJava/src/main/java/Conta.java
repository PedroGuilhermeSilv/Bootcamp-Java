/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
public abstract class Conta implements IConta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    
    private static final int AGENCIA_PADRAO=1;
    private static int SEQUENCIAL =1;
    
    
    public Conta(Cliente cliente){
      this.agencia=AGENCIA_PADRAO;
      this.numero= SEQUENCIAL++;
      this.cliente = cliente;
  }   

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    public void sacar(double valor) {
        if (this.verificaSaldo(valor))this.saldo = this.saldo - valor ;
        
    }


    public void depositar(double valor) {
        this.saldo = this.saldo + valor ;
    }


    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
    protected void imprimirDadosBasicos(){
       System.out.println("Titular: "+cliente.getNome()); 
       System.out.println(String.format("Agência %d", agencia));
       System.out.println(String.format("Numero %d",numero));
       System.out.println(String.format("Saldo %.2f",saldo));
    }

    private boolean verificaSaldo(double valor){
        try{
            if(valor>this.saldo){
              throw new IllegalArgumentException();
            }
            else return true;   
  }
       catch(Exception e){
              System.err.println("ERRO 0001: Não foi possível sacar. Saldo insuficiente");
                return false;
  }    
    }
}

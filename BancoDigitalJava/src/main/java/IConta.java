/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author pedro
 */
public interface IConta {
    void sacar(double valor);
    
    void depositar(double valor);
    
    void transferir(Conta contaDestino,double valor);   
    
    void imprimirExtrato();
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
public class Main {
    public static void main (String[] args){
        Cliente pedro = new Cliente("Pedro");
        Cliente lucas = new Cliente("Lucas");
        
        
        Conta cc = new contaCorrente(pedro);
        Conta cp = new contaPoupanca(lucas);
        cc.depositar(100);
        cc.sacar(200);
        cc.transferir(cp, 100);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        

    
    }
}

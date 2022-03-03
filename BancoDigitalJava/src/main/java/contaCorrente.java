/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
public class contaCorrente extends Conta {


    public void imprimirExtrato() {
       System.out.println("====EXTRATO CONTA  CORRENTE=====");
       super.imprimirDadosBasicos();
    }

    public contaCorrente(Cliente cliente) {
        super(cliente);
    }
    
    
    
}

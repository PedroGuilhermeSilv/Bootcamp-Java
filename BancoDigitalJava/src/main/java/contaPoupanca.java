/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
public class contaPoupanca extends Conta {

    public contaPoupanca(Cliente cliente) {
        super(cliente);
    }

    
    
    public void imprimirExtrato() {
       System.out.println("====EXTRATO CONTA POUPANÇA=====");
       super.imprimirDadosBasicos();

    }


    

}

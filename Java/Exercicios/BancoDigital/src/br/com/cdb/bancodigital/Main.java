package br.com.cdb.bancodigital;

import br.com.cdb.bancodigital.model.ContaBancaria;
import br.com.cdb.bancodigital.model.ContaCorrente;
import br.com.cdb.bancodigital.model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cc = new ContaCorrente(12345);
        cc.depositar(1000);

        ContaBancaria cc2 = new ContaPoupanca();
        cc2.depositar(250);

        cc.depositar(500);
        cc2.sacar(50);
        cc.transferir(500, cc2);

        System.out.println("Saldo conta corrente: R$"+ cc.getSaldo());
        System.out.println("Saldo contaPoupanca: R$"+ cc2.getSaldo());
    }
}

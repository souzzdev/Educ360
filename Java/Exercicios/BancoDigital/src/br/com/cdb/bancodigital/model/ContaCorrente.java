package br.com.cdb.bancodigital.model;

public class ContaCorrente implements ContaBancaria {

    private double saldo;

    private final long numero;

    public ContaCorrente(long numero) {
        this.numero = numero;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo < valor) {
            return false;
        } else {
            saldo -= valor;
            return true;
        }
    }

    @Override
    public void transferir(double valor, ContaBancaria destino) {
        if (sacar(valor)) {
            destino.depositar(valor);
        }
    }
}

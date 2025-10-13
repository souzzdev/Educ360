package br.com.cdb.bancodigital.model;

public interface ContaBancaria {
    double getSaldo();
    void depositar(double valor);
    boolean sacar (double valor);
    void transferir(double valor, ContaBancaria destino);
}

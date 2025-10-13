package br.com.cdb.heranca.model;

public class Funcionario extends Pessoa {
    protected double salario;


    public Funcionario(String nome, long cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    @Override
    public void apresentacao() {
        System.out.println("Olá eu sou o funcinario " + nome);
    }
}

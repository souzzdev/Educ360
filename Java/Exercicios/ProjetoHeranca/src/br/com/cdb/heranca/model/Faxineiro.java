package br.com.cdb.heranca.model;

public class Faxineiro extends Funcionario {
    public String turno;

    public Faxineiro(String nome, long cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public void apresentacao() {
        System.out.println("Olá eu sou o faxineiro " + nome);
    }
}

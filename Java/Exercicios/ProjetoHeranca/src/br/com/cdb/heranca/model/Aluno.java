package br.com.cdb.heranca.model;

public class Aluno extends Pessoa {

     int numeroMatricula;

    public Aluno(String nome, long cpf, int numeroMatricula) {
        super(nome, cpf);
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public void apresentacao() {
        System.out.println("Olá eu sou o aluno " + nome + " e minha matrícula é " + numeroMatricula);
    }
}

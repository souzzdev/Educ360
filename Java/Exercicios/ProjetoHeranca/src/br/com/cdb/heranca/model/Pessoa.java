package br.com.cdb.heranca.model;

public abstract class Pessoa {
    //Propriedades
    public String nome;
    public long cpf;

    //Metodos

    public Pessoa(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract void apresentacao();

    public String toString() {
        return this.nome + " - " + this.cpf;
    }
}

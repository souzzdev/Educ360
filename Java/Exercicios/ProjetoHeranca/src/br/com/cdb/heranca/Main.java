package br.com.cdb.heranca;

import br.com.cdb.heranca.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Pessoa fulano = new Pessoa("Fulano", 123456677);
        System.out.println(fulano.toString());
        fulano.cpf = 12345678;*/


        Aluno aluno = new Aluno("Pedro", 1415151, 132133);
        System.out.println(aluno);

        Funcionario funcionario = new Funcionario("João", 12345678, 1518);

        Professor professor = new Professor("Edson", 12345678, 1518);
        professor.numeroDeAulas = 4;
        /* Acesso negado pois na classe Funcionario o atributo esta definido como protected
        professor.salario = 1;*/

        Faxineiro fax = new Faxineiro("Marcel", 12345678, 1518);
        fax.turno = "Noturno";

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(aluno);
        listaDePessoas.add(funcionario);
        listaDePessoas.add(professor);
        listaDePessoas.add(fax);

        for (Pessoa pessoa : listaDePessoas) {
            pessoa.apresentacao();

            if (pessoa instanceof Professor) {
                System.out.println(" E tenho " + ((Professor)pessoa).numeroDeAulas + " aulas.");
            }

        }
    }
}

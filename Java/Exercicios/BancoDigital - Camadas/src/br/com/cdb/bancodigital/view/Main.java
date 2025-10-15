package br.com.cdb.bancodigital.view;

import br.com.cdb.bancodigital.service.ClienteService;

public class Main {
    public static void main(String[] args) {
        String nome = "Fulano";
        String cpf = "123456789";

        ClienteService clienteService = new ClienteService();

        if ( clienteService.addCliente(nome, cpf)) {
            System.out.println("Cliente adicionado com sucesso!");
        }
        else {
            System.out.println("Erro ao adicionar Cliente");
        }
    }
}

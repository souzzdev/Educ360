package br.com.cdb.bancodigital.dao;

import br.com.cdb.bancodigital.entity.Cliente;

import java.util.ArrayList;

public class ClienteDAO {

    ArrayList<Cliente> listaDeClientes = new ArrayList<>();

    public void addCliente (Cliente cliente) {
        cliente.setId(listaDeClientes.size());
        listaDeClientes.add(cliente);
    }

    public Cliente buscarCliente (int id) {
        for (Cliente cliente : listaDeClientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }
}

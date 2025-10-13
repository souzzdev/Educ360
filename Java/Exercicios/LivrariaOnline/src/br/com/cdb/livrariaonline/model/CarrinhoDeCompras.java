package br.com.cdb.livrariaonline.model;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Livro> livros = new ArrayList<>();
    private double valorTotalCarrinho;

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public double calcularPrecoTotal() {
        valorTotalCarrinho = 0.0;
        for (Livro l : livros) {
            valorTotalCarrinho += l.calcularPrecoTotal();
        }
        return valorTotalCarrinho;
    }
}

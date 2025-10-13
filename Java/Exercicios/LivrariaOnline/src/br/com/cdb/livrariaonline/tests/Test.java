package br.com.cdb.livrariaonline.tests;

import br.com.cdb.livrariaonline.model.CarrinhoDeCompras;
import br.com.cdb.livrariaonline.model.Ebook;
import br.com.cdb.livrariaonline.model.Livro;
import br.com.cdb.livrariaonline.model.LivroFisico;

public class Test {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setTitulo("Livro 1");
        livro.setPreco(500);
        livro.setAutor("Autor");

        Livro livro2 = new LivroFisico();
        livro2.setTitulo("Livro 2");
        livro2.setPreco(500);
        livro2.setAutor("Autor");

        Livro livro3 = new Ebook();
        livro3.setTitulo("Livro 3");
        livro3.setPreco(500);
        livro3.setAutor("Autor");

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarLivro(livro);
        carrinhoDeCompras.adicionarLivro(livro2);
        carrinhoDeCompras.adicionarLivro(livro3);

        System.out.println(livro2.getPreco());
        System.out.println("O valor total do seu carrinho é de: R$" + carrinhoDeCompras.calcularPrecoTotal());
    }
}

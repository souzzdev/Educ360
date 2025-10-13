package br.com.cdb.livrariaonline.model;

public class LivroFisico extends Livro {
    private double peso;
    private double frete;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    @Override
    public double calcularPrecoTotal() {
        double valor = getPreco() + frete;
        return valor;
    }
}

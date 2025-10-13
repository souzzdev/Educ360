package br.com.cdb.livrariaonline.model;

public class Ebook extends Livro {
    private double tamanhoEmMb;

    public double getTamanhoEmMb() {
        return tamanhoEmMb;
    }

    public void setTamanhoEmMb(double tamanhoEmMb) {
        this.tamanhoEmMb = tamanhoEmMb;
    }

    @Override
    public double calcularPrecoTotal() {
        return super.calcularPrecoTotal();
    }
}

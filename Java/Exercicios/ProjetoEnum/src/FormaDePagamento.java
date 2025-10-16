public enum FormaDePagamento {
    DINHEIRO("DIN", "Dinheiro"),
    CARTAO_CREDITO("CCR", "Cartão de Crédito"),
    CARTAO_DEBITO("CDB", "Cartão de débito"),
    PIX("PIX", "Pix"),
    TRANSFERENCIA("TRN", "Transferência");

    private final String codigo;
    private final String descricao;

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    FormaDePagamento(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
}

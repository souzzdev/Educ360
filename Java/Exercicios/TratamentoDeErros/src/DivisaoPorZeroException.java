public class DivisaoPorZeroException extends ArithmeticException {
    private static final long serialVersionUID = 1L;

    private int valorPadrao;
    public DivisaoPorZeroException(String msg) {
        super(msg);
        valorPadrao = 1;
    }

    public int getValorPadrao() {
        return valorPadrao;
    }
}

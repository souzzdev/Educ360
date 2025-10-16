public class Main {
    public static void main(String[] args) {
        double resultado = 0;
        try {
            resultado = divisao (10, 0);
        } catch (DivisaoPorZeroException e) {
            resultado = 10/e.getValorPadrao();
        }
        finally {
            System.out.println("Resultado: " + resultado);
        }
    }

    private static double divisao(int valor, int divisor) throws DivisaoPorZeroException {
        if (divisor == 0) {
            throw new DivisaoPorZeroException("Divisão por zero!");
        }

        return (double) valor / divisor; // casting para double para evitar divisão inteira
    }

}

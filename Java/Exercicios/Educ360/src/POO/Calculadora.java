package POO;

public class Calculadora {
    private double soma(double n1, double n2) {
        return n1 + n2;
    }

    private double subtracao(double n1, double n2) {
        return n1 - n2;
    }

    private double multiplicacao(double n1, double n2) {
        return n1 * n2;
    }

    private double divisao(double n1, double n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Erro ao dividir por zero");
        }
        return n1 / n2;
    }

    public double Calcular(double n1, double n2, String tipoOperacao) {
        switch (tipoOperacao) {
            case "+" -> {
                return n1 + n2;
            }
            case "-" -> {
                return n1 - n2;
            }
            case "*" -> {
                return n1 * n2;
            }
            case "/" -> {
                return n1 / n2;
            }
            default -> {
                throw new IllegalArgumentException("Erro operador inválido: " +  tipoOperacao);
            }
        }
    }
}

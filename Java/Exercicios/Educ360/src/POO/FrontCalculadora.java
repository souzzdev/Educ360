package POO;

import java.util.Scanner;

public class FrontCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner input = new Scanner(System.in);


        System.out.println("Digite o primeiro valor: ");
        int n1 = input.nextInt();
        System.out.println("Digite o segundo valor: ");
        int n2 = input.nextInt();
        System.out.println("Digite a operação desejada (+, - , *, /): ");
        String operacao = input.next();

        try {
            double resultado = calculadora.Calcular(n1, n2, operacao);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        input.close();

    }
}

package EstruturaDeDados;

import java.util.Scanner;

public class ArrayPT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] notas = {5,7,8,9,4,9,1,4,10,30};

        int maior = notas[0];
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < maior) {
                maior = notas[i];
            }
            soma = soma + notas[i];
            double media = soma / notas.length;
        }
        System.out.println(maior);
        System.out.println(soma);
    }
}

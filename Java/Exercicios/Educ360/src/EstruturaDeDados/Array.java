package EstruturaDeDados;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*String aluno1 = "José";
        System.out.println(aluno1);
        String aluno2;
        String aluno3;
        String aluno4;*/

        String[] alunos = new String[4];

        /*alunos[0] = "José";
        alunos[1] = "Maria";
        alunos[2] = "Marcelo";
        alunos[3] = "Antonio";

        System.out.println(alunos[0]);
        System.out.println(alunos[1]);
        System.out.println(alunos[2]);
        System.out.println(alunos[3]);*/

         //PERCORRER UM ARRAY
        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = input.nextLine();
        }
        System.out.println();

        //PERCORRER UM ARRAY - SAÍDA
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }
    }
}

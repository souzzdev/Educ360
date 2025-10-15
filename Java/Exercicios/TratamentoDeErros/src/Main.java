import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = 10;
        int divisor = input.nextInt();
        int resultado = 0;
        try {
            resultado = 10/divisor;
        } catch(ArithmeticException | NullPointerException e){
            resultado = 10/1;
        }
        finally{
            System.out.println("Resultado: " + resultado);
        }

        System.out.println("Seguindo o programa");

    }
}

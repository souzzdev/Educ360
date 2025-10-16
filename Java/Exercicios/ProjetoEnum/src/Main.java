import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DiaDaSemana diaEnum;
        FormaDePagamento formaEnum;

        System.out.println("Usuário escolha o dia da semana: " );

        for(DiaDaSemana dia : DiaDaSemana.values()) {
            System.out.println(dia);
        }

        String diaTexto = input.next();

        diaEnum = DiaDaSemana.valueOf(diaTexto.toUpperCase());

        System.out.println("O dia escolhido foi: " + diaEnum);

        System.out.println("Escolha o tipo de pagamento: ");

        for (FormaDePagamento forma : FormaDePagamento.values()) {
            System.out.println(forma);
        }

        String formaTexto = input.next();

        formaEnum = FormaDePagamento.valueOf(formaTexto.toUpperCase());

        System.out.println("O tipod de pagamento escolhido foi: "+ formaEnum);

        FormaDePagamento formaPag = FormaDePagamento.CARTAO_DEBITO;
        formaPag.getCodigo();
        formaPag.getDescricao();
    }
}

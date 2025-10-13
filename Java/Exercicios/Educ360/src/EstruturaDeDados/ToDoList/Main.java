package EstruturaDeDados.ToDoList;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Tarefa t = new Tarefa();
        Scanner input = new Scanner(System.in);

        while (true) {
            int escolha = 0;
            System.out.println("========================");
            System.out.println("""
                    1 - Adicionar Tarefa
                    2 - Remover Tarefas
                    3 - Listar em Ordem Alfabética
                    4 - Listar Tarefas
                    0 - Sair""");
            System.out.println("Escolha uma opcao: ");
            escolha = input.nextInt();
            input.nextLine();
            System.out.println("========================");

            switch (escolha) {
                case 1 -> {
                    System.out.println("Digite a tarefa: ");
                    String tarefa = input.nextLine();
                    try {
                        t.adicionarTarefa(tarefa);
                        System.out.println("Tarefa adicionada com sucesso!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    System.out.println("Digite a tarefa que deseja remover: ");
                    String tarefa = input.nextLine();
                    t.removerTarefa(tarefa);
                }
                case 3 -> {
                    System.out.println("------------ Listando Tarefas ------------");
                    t.exibirLista(t.getListaDeTarefas());
                }
                case 4 -> {
                    System.out.println("------------ Listando Tarefas em Ordem Alfabética ------------");
                    t.exibirEmOrdemAlafabetica(t.getListaDeTarefas());

                }
                case 0 -> {
                    System.out.println("Encerrando programa...");
                    input.close();
                    return;
                }
                default -> System.out.println("Opcção inválida, tente novamente");
            }
        }
    }
}

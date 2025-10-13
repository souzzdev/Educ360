package EstruturaDeDados.ToDoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tarefa {
    private List<String> listaDeTarefas = new ArrayList<>();

    public List<String> getListaDeTarefas() {
        return listaDeTarefas;
    }

    public List<String> adicionarTarefa(String tarefa) throws Exception{
        if (listaDeTarefas.contains(tarefa)) {
            throw new Exception("Tarefa já existente.");
        }
        else {
            listaDeTarefas.add(tarefa);
        }
        return listaDeTarefas;
    }

    public List<String> removerTarefa(String tarefa){
        Scanner input = new Scanner(System.in);

        System.out.println("Você tem certeza que deseja remover? (S/N): ");
        String escolha = input.nextLine();

        if (escolha.equalsIgnoreCase("S")) {
            if (listaDeTarefas.remove(tarefa)) {
                System.out.println("Tarefa removida com sucesso.");
            } else {
                System.out.println("Tarefa não encontrada.");
            }
        }
        else if (escolha.equalsIgnoreCase("N")) {
            System.out.println("Ação cancelada. A tarefa permanecerá na lista.");
        }
        else {
            System.out.println("Escolha inválida. Digite apenas S ou N.");
        }

        return listaDeTarefas;
    }

    public void exibirLista(List<String> listaDeTarefas){
        if (listaDeTarefas == null || listaDeTarefas.isEmpty() ){
            System.out.println("A lista de tarefas está vazia.");
            return;
        }

        for (String tarefa : listaDeTarefas) {
            System.out.println("Tarefa: " + tarefa);
        }
    }

    public void exibirEmOrdemAlafabetica(List<String> listaDeTarefas){
        Collections.sort(listaDeTarefas);
        for (String tarefa : listaDeTarefas) {
            System.out.println("Tarefa: " + tarefa);
        }
    }
}

package EstruturaDeDados;
import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> listaDeCompras = new ArrayList<>();

        //Adicionando Elementos na lista
        listaDeCompras.add("Arroz");
        listaDeCompras.add("Feijão");
        listaDeCompras.add("Farinha");
        listaDeCompras.add("Ovo");

        //Exibindo elementos da lista
        System.out.println(listaDeCompras.get(1));

        //Removendo elementos da lista
        listaDeCompras.remove(1);
        System.out.println(listaDeCompras.get(1));

        //Lista com tipos primitivos
        List<Integer> notas = new ArrayList<>();

    }
}

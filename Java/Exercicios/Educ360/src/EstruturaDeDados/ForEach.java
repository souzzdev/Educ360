package EstruturaDeDados;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> listaDeNotas = new ArrayList<>();
        listaDeNotas.add(1);
        listaDeNotas.add(2);
        listaDeNotas.add(3);
        listaDeNotas.add(4);
        listaDeNotas.add(5);
        listaDeNotas.add(6);
        listaDeNotas.add(7);

        for (Integer nota : listaDeNotas) {
            System.out.println(nota);
        }
    }
}

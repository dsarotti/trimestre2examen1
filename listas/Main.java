package codigo_fuente.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista.add(i);
        }
        Collections.sort(lista, Collections.reverseOrder());
        System.out.println(lista);
    }
}

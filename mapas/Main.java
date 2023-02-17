package codigo_fuente.mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void recorreMapa(Map<String, List<Integer>> mapa) {
        for (List<Integer> lista : mapa.values()) {
            for (Integer dato : lista) {
                System.out.println(dato);
            }
        }
    }

    public static void main(String[] args) {
        Map<String, List<Integer>> mapa = new HashMap<>();

        mapa.put("elemento 1", new ArrayList<>());
        mapa.put("elemento 2", new ArrayList<>());
        mapa.put("elemento 3", new ArrayList<>());

        mapa.get("elemento 2").add(1);
        
        recorreMapa(mapa);
    }
}
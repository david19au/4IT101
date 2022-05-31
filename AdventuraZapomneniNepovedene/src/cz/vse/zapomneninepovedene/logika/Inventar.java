package cz.vse.zapomneninepovedene.logika;

import java.util.HashMap;
import java.util.Map;

public class Inventar {
    private Map<String, Vec> inventar;
    private static int pocetVeci;

    public Inventar() {
        inventar = new HashMap<>();
    }

    public int getPocetVeci() {
        return pocetVeci;
    }

    public void addToInventar(Vec vec) {
        if (vec != null && (inventar.size() < 3)) {
            pocetVeci++;
            inventar.put(vec.getNazev(), vec);
        }
    }
}

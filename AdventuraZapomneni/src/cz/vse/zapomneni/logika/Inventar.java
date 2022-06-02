package cz.vse.zapomneni.logika;

import java.util.HashMap;
import java.util.Map;

public class Inventar {

    private Map<String, Vec> mapaSVecmi;
    private static final int MAXIMALNI_KAPACITA = 2;
    private static int pocetVeci;


    public Inventar() {
        mapaSVecmi = new HashMap<>();
    }

    public int getPocetVeci() {
        return pocetVeci;
    }

    public boolean dostMista() {
        return MAXIMALNI_KAPACITA > pocetVeci;
    }

    public void vlozeniVeciDoInv(Vec vec) {
        if ((vec != null) && dostMista()) {
            pocetVeci++;
            mapaSVecmi.put(vec.getNazev(), vec);
        }
    }

    public void odebraniVeciZInv(Vec vec) {
        pocetVeci--;
        mapaSVecmi.remove(vec.getNazev());
    }

    public boolean obsahujeVInventari(String jmenoVeci) {
        for (Vec vec : mapaSVecmi.values()) {
            if (vec.getNazev().equals(jmenoVeci)) {
                return true;
            }
        }
        return false;
    }

}

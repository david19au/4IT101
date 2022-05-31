package cz.vse.adventura.logika;

import java.util.HashMap;
import java.util.Map;

public class Inventar {

    private Map<String, Vec> mapaSVecmi;
    private static int pocetVeci;

    public Inventar() {
        mapaSVecmi = new HashMap<>();
    }

    public int getPocetVeci() {
        return pocetVeci;
    }

    public void vlozeniVeciDoInv(Vec vec) {
        if ((vec != null) && (3 > pocetVeci)) { //TODO vymyslet smysluplnou kapacitu
            pocetVeci++;
            mapaSVecmi.put(vec.getNazev(),vec);
        }
    }

    public void odebraniVeciZInv (Vec vec) {
        mapaSVecmi.remove(vec.getNazev());
    }

}

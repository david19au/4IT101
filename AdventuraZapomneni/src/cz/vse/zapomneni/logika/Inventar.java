package cz.vse.zapomneni.logika;

import java.util.HashMap;
import java.util.Map;

/**
 * Pomocí třídy Inventar realizuje hra inventář postavy/hráče. V inventáři může postava nosit určité předměty.
 * Funkcionalita je zajištěna pomocí mapy s věcmi, která obsahuje to co má u sebe hráč. Postava/hráč může u sebe mít jenom
 * limitovaný počet věcí, nastavený v atributu "MAXIMALNI_KAPACITA" - v našem případě může nosit maximálně 2 věci u sebe.
 * Pokus o přidání 3. věci se nepodaří.
 *
 * @author Trong Dat Luu
 * @version LS 2021/22
 */

public class Inventar {

    private Map<String, Vec> mapaSVecmi;
    private static final int MAXIMALNI_KAPACITA = 2;
    private static int pocetVeci;

    /**
     * Konstruktor, který vytvoří nový inventář s hashMapou pro věci.
     */
    public Inventar() {
        mapaSVecmi = new HashMap<>();
    }

    /**
     * Metoda co nám napíše kolik věcí je v inventáři.
     *
     * @return napíše kolik věcí je v inventáři.
     */
    public int getPocetVeci() {
        return pocetVeci;
    }

    /**
     * Metoda co kontroluje zda má hráč/postava dost místa pro přidání další věci.
     *
     * @return true pokud je číslo s maximální kapacitou větší než počet věcí co má postava/hráč u sebe
     */
    public boolean dostMista() {
        return MAXIMALNI_KAPACITA > pocetVeci;
    }

    /**
     * Metoda vlozeniVeciDoInv dokáže vložit věc do inventáře, pokud má postava/hráč dost místa a pokud vložená věc není
     * null.
     *
     * @param vec věc co se má vložit do inventaře
     */
    public void vlozeniVeciDoInv(Vec vec) {
        if ((vec != null) && dostMista()) {
            pocetVeci++;
            mapaSVecmi.put(vec.getNazev(), vec);
        }
    }

    /**
     * Metoda odebere věc z inventáře.
     * @param jmenoVeci jméno věci co se má odebrat
     * @return vrací odebranou věc
     */
    public Vec odebraniVeciZInv(String jmenoVeci) {
        pocetVeci--;
        return mapaSVecmi.remove(jmenoVeci);
    }

    /**
     * Metoda kontroluje, zda obsahuje hráčův inventář požadovanou věc či ne.
     *
     * @param jmenoVeci hledání věci podle jména
     * @return true pokud je inventáři nalezena daná věc
     */
    public boolean obsahujeVInventari(String jmenoVeci) {
        for (Vec vec : mapaSVecmi.values()) {
            if (vec.getNazev().equals(jmenoVeci)) {
                return true;
            }
        }
        return false;
    }

}

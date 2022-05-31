package cz.vse.zapomneninepovedene.logika;

public class Vec {

    private final String nazev;
    private final boolean prenositelna;
    private final boolean pouzitelna;

    public Vec(String nazev, boolean prenositelna, boolean pouzitelna) {
        this.nazev = nazev;
        this.prenositelna = prenositelna;
        this.pouzitelna = pouzitelna;
    }

    public String getNazev() {
        return nazev;
    }

    public boolean isPrenositelna() {
        return prenositelna;
    }

    public boolean isPouzitelna() {
        return pouzitelna;
    }

}

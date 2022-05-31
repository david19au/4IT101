package cz.vse.zapomneni.logika;

import java.util.Objects;

public class Vec {
    private final String nazev;
    private final boolean sebratelna;
    private final boolean pouzitelna;

    public Vec(String nazev, boolean sebratelna, boolean pouzitelna) {
        this.nazev = nazev;
        this.sebratelna = sebratelna;
        this.pouzitelna = pouzitelna;
    }

    public String getNazev() {
        return nazev;
    }

    public boolean isSebratelna() {
        return sebratelna;
    }

    public boolean isPouzitelna() {
        return pouzitelna;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vec vec = (Vec) o;
        return Objects.equals(nazev, vec.nazev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazev);
    }
}

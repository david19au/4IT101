package cz.vse.zapomneni.logika;

import java.util.Objects;

public class Vec {
    private String nazev;
    private boolean prenositelna;

    public Vec(String nazev, boolean prenositelna) {
        this.nazev = nazev;
        this.prenositelna = prenositelna;
    }

    public String getNazev() {
        return nazev;
    }

    public boolean isPrenositelna() {
        return prenositelna;
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

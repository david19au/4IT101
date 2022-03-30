/**
 * @author Ing. David Král
 * @version 1.0
 */

package cz.vse.nakupniKosik;

import java.util.Objects;

public class Vec {

    private int id;
    private int cena;
    private String nazev;

    public Vec(int id, int cena, String nazev) {
        this.id = id;
        this.cena = cena;
        this.nazev = nazev;
    }

    public int getId() {
        return id;
    }

    public String getNazev() {
        return nazev;
    }

    public int getCena() {
        return cena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vec vec = (Vec) o;
        return id == vec.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

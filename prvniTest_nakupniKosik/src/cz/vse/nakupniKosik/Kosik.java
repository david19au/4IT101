/**
 * @author Trong Dat Luu @david19au
 * @version 1.0
 */

package cz.vse.nakupniKosik;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Kosik {

    public Collection<Vec> seznamVeciVKosiku;

    public Kosik() {
        seznamVeciVKosiku = new HashSet<>();
    }

    public boolean pridejVec(Vec vec) {
        return seznamVeciVKosiku.add(vec);
    }

    public Vec odeberVec(int id) {
        for (Vec vec : seznamVeciVKosiku) {
            if (vec.getId() == id) {
                seznamVeciVKosiku.remove((vec));
                return vec;
            }
        }
        return null;
    }

    public Collection<Vec> seznamVeci() {
        return seznamVeciVKosiku;
    }

    public Collection<Vec> seznamVeciSCenouOdDo(int cenaOd, int cenaDo) {
        Set<Vec> seznamVeciVKosikuPodleCeny = new HashSet<>();
        for (Vec vec : seznamVeciVKosiku) {
            if (vec.getCena() >= cenaOd && vec.getCena() <= cenaDo) {
                seznamVeciVKosikuPodleCeny.add(vec);
            }
        }
        return seznamVeciVKosikuPodleCeny;
    }
}

/**
 *
 * @author Trong Dat Luu @david19au
 * @version 1.0
 *
 */

package cz.vse.prvniukol;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class PlaneEvidence {

    public Collection<Plane> planeList;

    public PlaneEvidence () {
        planeList = new HashSet<>();
    }

    public boolean addPlane(Plane plane){
        return planeList.add(plane);
    }

    public Collection<Plane> getPlaneList() {
        return planeList;
    }

    public Collection<Plane> getUnoccupiedPlanes() {
        Set<Plane> unoccupiedPlanes = new HashSet<>();
        for (Plane plane : planeList) {
            if (plane.getPilot().equals(null)) {
                unoccupiedPlanes.add(plane);
            }
        }
        return unoccupiedPlanes;
    }

    public Plane returnPlane (int identificationNumber) {
        for (Plane plane : planeList) {
            if (plane.getIdentificationNumber() == identificationNumber) {
                return plane;
            }
        }
        return null;
    }
}


/**
 * @author Trong Dat Luu @david19au, Adam Schindler, Hana Žahourová
 * @version 1.0
 */

package cz.vse.ctvrtyukol;

import java.util.*;
import java.util.stream.Collectors;

public class PlaneEvidence {

    public Collection<Plane> planeList;

    public PlaneEvidence() {
        planeList = new HashSet<>();
    }

    public boolean addPlane(Plane plane) {
        return planeList.add(plane);
    }

    public Collection<Plane> getPlaneList() {
        return planeList.stream().toList();
    }

    public Collection<Plane> getUnoccupiedPlanes() {
        Set<Plane> unoccupiedPlanes = new HashSet<>();
        for (Plane plane : planeList) {
            if (plane.getPilot() == null) {
                unoccupiedPlanes.add(plane);
            }
        }
        return unoccupiedPlanes;
    }

    public Collection <Plane> returnPlane (int identificationNumber) {
        return planeList.stream()
                .filter(plane -> plane.getIdentificationNumber() == identificationNumber)
                .collect(Collectors.toSet());
    }

    public Collection<Plane> sortedPlanes() {
        return planeList.stream()
                .sorted(Comparator.comparing(Plane::getIdentificationNumber).reversed())
                .collect(Collectors.toList());
    }

/*    public Plane returnPlane(int identificationNumber) {
        for (Plane plane : planeList) {
            if (plane.getIdentificationNumber() == identificationNumber) {
                return plane;
            }
        }
        return null;
    }*/
}


package cz.vse.prvniukol;

import java.util.HashSet;
import java.util.Set;

public class PlaneEvidence {
    private Set<Plane> planes = new HashSet<>();
    public boolean addPlane(Plane plane){
        return planes.add(plane);
    }


}

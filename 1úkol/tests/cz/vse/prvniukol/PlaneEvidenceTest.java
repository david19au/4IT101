package cz.vse.prvniukol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlaneEvidenceTest {

    @Test
    public void testEvidence() {
        PlaneEvidence planeEvidence = new PlaneEvidence();
        Pilot pilot1 = new Pilot("Sussy", "Baka", 69, "Captain");
        Pilot pilot2 = new Pilot("Walter", "White", 420, "First Officer");
        Plane plane1 = new Plane(69, "Bong");
        Plane plane2 = new Plane(420, "AeroSUS");

        assertTrue(planeEvidence.addPlane(plane1));
        assertFalse(planeEvidence.addPlane(plane1));

        assertEquals(true, planeEvidence.addPlane(plane2));
        assertEquals(false, planeEvidence.addPlane(plane2));

        assertNotNull(planeEvidence.getPlaneList());

    }

}

/**
 * @author Trong Dat Luu @david19au
 * @version 1.0
 */

package cz.vse.ctvrtyukol;

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

        assertTrue(planeEvidence.addPlane(plane2));
        assertFalse(planeEvidence.addPlane(plane2));

        assertEquals(2, planeEvidence.getPlaneList().size());
    }

    @Test
    public void testNotNull() {
        PlaneEvidence planeEvidence = new PlaneEvidence();
        assertNotNull(planeEvidence.getPlaneList());
    }

    @Test
    public void testListNoPilot() {
        PlaneEvidence planeEvidence = new PlaneEvidence();
        Plane plane1 = new Plane(69, "Bong");
        planeEvidence.addPlane(plane1);
        assertEquals(1, planeEvidence.getUnoccupiedPlanes().size());
    }

    @Test
    public void testListNoPilotNoEntry() {
        PlaneEvidence planeEvidence = new PlaneEvidence();
        Plane plane1 = new Plane(69, "Bong");
        Pilot pilot1 = new Pilot("Sussy", "Baka", 69, "Captain");
        plane1.setPilot(pilot1);
        planeEvidence.addPlane(plane1);
        assertEquals(0, planeEvidence.getUnoccupiedPlanes().size());
    }

    @Test
    public void testReturnPlane() {
        PlaneEvidence planeEvidence = new PlaneEvidence();
        Plane plane1 = new Plane(69, "Bong");
        Plane plane2 = new Plane(420, "AeroSUS");
        Plane plane3 = new Plane(999, "Bombardier");
        Pilot pilot1 = new Pilot("Sussy", "Baka", 69, "Captain");
        plane1.setPilot(pilot1);
        plane3.setPilot(pilot1);
        planeEvidence.addPlane(plane1);
        planeEvidence.addPlane(plane2);
        planeEvidence.addPlane(plane3);
        assertEquals(plane3, planeEvidence.returnPlane(999));
    }

    @Test
    public void testReturnPlaneNull() {
        PlaneEvidence planeEvidence = new PlaneEvidence();
        Plane plane1 = new Plane(69, "Bong");
        Pilot pilot1 = new Pilot("Sussy", "Baka", 69, "Captain");
        plane1.setPilot(pilot1);
        planeEvidence.addPlane(plane1);
        assertNull(planeEvidence.returnPlane(777));
    }

}

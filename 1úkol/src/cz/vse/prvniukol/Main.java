/**
 *
 * @author Trong Dat Luu @david19au
 * @version 1.0
 *
 */

package cz.vse.prvniukol;

public class Main {
    public static void main(String[] args) {

        cz.vse.prvniukol.Pilot pilot = new cz.vse.prvniukol.Pilot("Adam","Smith",69,"Captain");
        System.out.println(pilot.getAge());
        System.out.println(pilot.getFirstName());
        System.out.println(pilot.getLastName());
        System.out.println(pilot.getRank());
        System.out.println(pilot);

        cz.vse.prvniukol.Plane plane0 = new Plane(420,"BruhManufacturer");
        plane0.setPilot(pilot);
        System.out.println(plane0);

        cz.vse.prvniukol.Plane plane1 = new Plane(69, "BruhManufacturer");
        System.out.println(plane1.getPilot());
        System.out.println(plane1);

        cz.vse.prvniukol.PlaneEvidence planeEvidence = new PlaneEvidence();
        planeEvidence.addPlane(plane0);
        planeEvidence.addPlane(plane1);
        System.out.println(planeEvidence.getUnoccupiedPlanes().size());
        System.out.println(planeEvidence.planeList);

    }
}

/**
 * @author Trong Dat Luu @david19au
 * @version 1.0
 */

package cz.vse.ctvrtyukol;

public class Main {
    public static void main(String[] args) {

        Pilot pilot = new Pilot("Adam", "Smith", 69, "Captain");
        System.out.println(pilot.getAge());
        System.out.println(pilot.getFirstName());
        System.out.println(pilot.getLastName());
        System.out.println(pilot.getRank());
        System.out.println(pilot);

        Plane plane0 = new Plane(420, "BruhManufacturer");
        plane0.setPilot(pilot);
        System.out.println(plane0);

        Plane plane1 = new Plane(69, "BruhManufacturer");
        System.out.println(plane1.getPilot());
        System.out.println(plane1);

        Plane plane2 = new Plane(100, "BruhManufacturer");
        Plane plane3 = new Plane(150, "BruhManufacturer");
        Plane plane4 = new Plane(69420, "BruhManufacturer");
        Plane plane5 = new Plane(42069, "BruhManufacturer");
        Plane plane6 = new Plane(2, "BruhManufacturer");

        PlaneEvidence planeEvidence = new PlaneEvidence();
        planeEvidence.addPlane(plane0);
        planeEvidence.addPlane(plane1);
        planeEvidence.addPlane(plane2);
        planeEvidence.addPlane(plane3);
        planeEvidence.addPlane(plane4);
        planeEvidence.addPlane(plane5);
        planeEvidence.addPlane(plane6);
        System.out.println(planeEvidence.getUnoccupiedPlanes().size());
        System.out.println(planeEvidence.getUnoccupiedPlanes());
        System.out.println(planeEvidence.sortedPlanes());
        System.out.println(planeEvidence.returnPlane(69));

    }
}

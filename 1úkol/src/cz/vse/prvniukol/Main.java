package cz.vse.prvniukol;

public class Main {
    public static void main(String[] args) {

        cz.vse.prvniukol.Pilot pilot = new cz.vse.prvniukol.Pilot("Adam","Smith",69,"Captain");
        System.out.println(pilot.getAge());
        System.out.println(pilot.getFirstName());
        System.out.println(pilot.getLastName());
        System.out.println(pilot.getRank());
        System.out.println(pilot);
    }
}

package cz.vse.prvniukol;

public class Main {
    public static void main(String[] args) {

        cz.vse.prvniukol.Pilot pilot = new cz.vse.prvniukol.Pilot("Jan","Novák",69,"Kapitán");
        System.out.println(pilot.getAge());
        System.out.println(pilot.getFirstName());
        System.out.println(pilot.getLastName());
        System.out.println(pilot.getRank());
        System.out.println(pilot);
    }
}

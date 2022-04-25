package cz.vse.treti;

public class Main {
    public static void main(String[] args) {
        //1 cviko
//        cz.vse.treti.Car car = new cz.vse.treti.Car("Skoda");
//        cz.vse.treti.Car car2 = new cz.vse.treti.Car("Volkswagen");
//
//        // car.drivable(); //auto má všechny vlastnosti té třídy - zavolání metody "drivavable"
//        System.out.println(car.getManufacturer());
//        System.out.println(car2.getManufacturer());
//
//        car.setManufacturer("Mercedes");
//        System.out.println(car.getManufacturer());
//
//        car.setCarCrashed(true);
//        System.out.println(car.isCarCrashed());
//
//        car.setManufactureYear(2020);
//        System.out.println(car.getManufactureYear());
//
//        System.out.println(car);
//
//        cz.vse.treti.Driver driver = new cz.vse.treti.Driver ("Bruh",18);
//
//        car.setDriver(driver);
//        System.out.println(car);
        //3 cviko
        Garage garage = new Garage();
        //cz.vse.treti.Car car = new cz.vse.treti.Car("Skoda");
        Car car = new Car("Škoda");
        Motorbike motorbike = new Motorbike();
        Bus bus = new Bus();

        garage.parkVehicle(car);
        garage.parkVehicle(motorbike);
        garage.parkVehicle(bus);

    }
}

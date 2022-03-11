package cz.vse.treti;

public class Car implements Vehicle {
    private String manufacturer = "Skoda";
    private int manufactureYear = 2020;
    private byte byteSomething = 120;
    private short shortSomething = 160;
    private long longSomething = 123;

    private float floatSomething = 123.456F; // "F" na konci
    private double doubleSomething = 123.456;

    private boolean isCarCrashed = false; // komentáře takovýmhle způsobem

    private char character = 'o';
    private Driver driver;

    // konstruktor - v tomhle případě výrobní linka vyrobí auto
    public Car(String manufacturer) {
        this.manufacturer = manufacturer;

        System.out.println("Zavolal se konstruktor");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public boolean isCarCrashed() {
        return isCarCrashed;
    }


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer; //říkám, že chci aby do fieldu se přiřadila tahle hodnota zeshora
    }

    public void setCarCrashed(Boolean isCarCrashed) { //u booleanu pokud použiju "isXXX" tak můžu použít "setXXX" rovnou, bez použití "setIsXXX"
        this.isCarCrashed = isCarCrashed;
    }

    public void setManufactureYear(int ManufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    // konstruktor udělal auto - můžeme jezdit/printne to co chci
    public void drivable() {
        System.out.println("bruh"); // print to console
    }

    @Override
    public String toString() {
        if (driver == null) {
            return  "The car from " + getManufacturer() + " has no driver.";
        }
        return "The car from " + getManufacturer() + " is driven by " + getDriver();
    }

    @Override
    public void park() {
        System.out.println("Auto parkuje");
    }
}

package cz.vse.prvniukol;

public class Plane {
    private int identificationNumber;
    private String manufacturer;
    private Pilot pilot;

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Plane(int identificationNumber, String manufacturer) {
        this.identificationNumber = identificationNumber;
        this.manufacturer = manufacturer;
    }
}

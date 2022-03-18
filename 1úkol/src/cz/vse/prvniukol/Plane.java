/**
 *
 * @author Trong Dat Luu @david19au
 * @version 1.0
 *
 */

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

    @Override
    public String toString() {
        if (pilot == null) {
            return "The plane made by " + getManufacturer() + " with an identification number of " + getIdentificationNumber() + " does not have a pilot.";
        }
        return "The plane made by " + getManufacturer() + " with an identification number " + getIdentificationNumber() + " is flown by " + getPilot() + " .";
    }

}

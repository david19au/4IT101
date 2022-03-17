package cz.vse.prvniukol;

public class Pilot {
    private String firstName = "firstName";
    private String lastName = "lastName";
    private int age = 0;
    private String rank = "rank";

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", rank='" + rank + '\'' +
                '}';
    }
}

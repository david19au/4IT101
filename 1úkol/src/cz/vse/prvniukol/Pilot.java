package cz.vse.prvniukol;

public class Pilot {
    private String firstName = "Jan";
    private String lastName = "Novák";
    private int age = 69;
    private String rank = "Captain";

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

    public Pilot(String firstName, String lastName, int age, String rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " " + firstName + " "+ lastName + " (" + age + ") ";
    }
}

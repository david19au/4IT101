package cz.vse.druhyprojekt;

import java.util.Objects;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o instanceof Human) {
            Human secondHuman = (Human) o;
            if (this.age != secondHuman.age) {
                return false;
            } else if (!this.name.equals(secondHuman.name)) { //vykřičník ukazuje že se NEROVNÁ
                return false;
            }
            return true;
        }
        return false;
    }

    //dá se generovat equals() a hashCode() v IntelliJ - pravým tlačítkem a "Generate" - v úkolu se dělá toto jenom pro JEDEN identifikátor, hint hint

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

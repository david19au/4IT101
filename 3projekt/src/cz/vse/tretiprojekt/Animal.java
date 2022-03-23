package cz.vse.tretiprojekt;

import java.util.Objects;

public class Animal {

    private String typeAnimal;
    private String name;
    private Owner owner;

    public Animal(String typeAnimal, String name, Owner owner) {
        this.typeAnimal = typeAnimal;
        this.name = name;
        this.owner = owner;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public String getName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(typeAnimal, animal.typeAnimal) && Objects.equals(name, animal.name) && owner.equals(animal.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeAnimal, name, owner);
    }
}

package cz.vse.treticviceni;

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
}

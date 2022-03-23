package cz.vse.tretiprojekt;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class AnimalEvidence {

    private Set<Animal> animals = new HashSet<>(); //set je interface

    // add + remove vrací boolean, pokud se podaří tak true, pokud ne, tak false
    public boolean addAnimal(Animal animal) {
        return animals.add(animal);

    }

    public boolean removeAnimal(Animal animal) {
        return animals.remove(animal);
    }


    public Collection<Animal> animalsOwned(Owner owner) { //Kolekce se použije pokud je mi jedno jestli je to Set nebo List
        Set<Animal> toReturn = new HashSet<>(); //vytvoření "proměnné" jménem toReturn
        for (Animal animal : animals) { //pro každý animal v setu animals
            if (animal.getOwner().equals(owner)) { // tečka odděluje levou a pravou stranu
                toReturn.add(animal); //pokud se najde nějaké animal které má toho porovnávaného majitele, tak se přidá do proměnné
            }

        }
        return toReturn; //vrácení té kolekce
    }

}

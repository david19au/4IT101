package cz.vse.tretiprojekt;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*; //zkrátí se to jméno viz. dole - je tam jenom assertEquals, ne assertions.assertEquals

public class AnimalEvidenceTest {

    @Test
    public void testAddAnimal() {
        AnimalEvidence animalEvidence = new AnimalEvidence();
        Owner owner = new Owner("Karel", 18);
        Animal animal = new Animal("hamster", "Franta", owner);
        Animal animal2 = new Animal("dog", "Hafík", owner);


        //assertEquals se dá zjednodušit na assertTrue a assertFalse
        assertTrue(animalEvidence.addAnimal(animal)); //porovnání hodnot
        assertFalse(animalEvidence.addAnimal(animal)); //kontrola že se neuložily duplicity

        assertEquals(false, animalEvidence.addAnimal(animal2)); //kontrola že se neuložily duplicity

    }

    @Test
    public void testRemoveAnimal() {
        AnimalEvidence animalEvidence = new AnimalEvidence();
        Owner owner = new Owner("Karel", 18);
        Animal animal = new Animal("hamster", "Franta", owner);
        Animal animal2 = new Animal("dog", "Hafík", owner);

        assertFalse(animalEvidence.removeAnimal(animal));
        animalEvidence.addAnimal(animal);
        assertTrue(animalEvidence.removeAnimal(animal));
        assertFalse(animalEvidence.removeAnimal(animal));
    }

    @Test
    public void testAnimalsOwned() {
        AnimalEvidence animalEvidence = new AnimalEvidence();
        Owner owner1 = new Owner("Karel", 18);
        Owner owner2 = new Owner("Jana", 19);
        Animal animal = new Animal("hamster", "Franta", owner1);
        Animal animal2 = new Animal("dog", "Hafík", owner1);
        Animal animal3 = new Animal("cat", "Mňau", owner2);

        assertEquals(Set.of(), animalEvidence.animalsOwned(owner1));

        animalEvidence.addAnimal(animal);
        animalEvidence.addAnimal(animal2);
        animalEvidence.addAnimal(animal3);

        assertEquals(Set.of(animal, animal2), animalEvidence.animalsOwned(owner1));
        assertEquals(Set.of(animal3), animalEvidence.animalsOwned(owner2));

    }

}

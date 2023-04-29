package com.vlad.study.task2;

import com.vlad.study.task2.entity.Animal;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Casper", 4, true);
        Animal animal2 = new Animal("Scream", 3,false);
        AnimalHelper ah = new AnimalHelper();

        ah.addAnimal(animal1);
        ah.addAnimal(animal2);

        System.out.println("List of animals:");
        List<Animal> animalList = ah.getAnimalsList();
        for (Animal a : animalList) {
            System.out.println(a);
        }

        System.out.println("Find by Id:");
        System.out.println(ah.getAnimalById(2));

        System.out.println("Delete using method getAnimalById(): ");
        ah.removeAnimal(ah.getAnimalById(1));
    }
}

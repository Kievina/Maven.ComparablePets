package io.zipcoder;


import io.zipcoder.pets.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Application {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Pet> listOfPets = new ArrayList<Pet>();

    public static void main(String[] args) {
        System.out.println("How many pets do you have?");
        Integer numberOfPets = input.nextInt();

        for (int i = 0; i < numberOfPets; i++) {
            String petType = getPetType().toLowerCase();
            String petName = getPetName();
            if (petType.equals("dog")) {
                Pet pet = new Dog(petName);
                listOfPets.add(pet);
            } else if (petType.equals("cat")) {
                Pet pet = new Cat(petName);
                listOfPets.add(pet);
            } else if (petType.equals("bear")) {
                Pet pet = new Rabbit(petName);
                listOfPets.add(pet);
            } else {
                Pet pet = new Pet(petName);
                listOfPets.add(pet);
            }
        }
        for (Pet pet : listOfPets) {
            System.out.println(pet.getName() + " : " + pet.speak());
        }
    }

    public static String getPetType() {
        System.out.println("What is the type of your pet?");
        String typeOfPet = input.next();
        return typeOfPet;
    }

    public static String getPetName() {
        System.out.println("What is the name of your pet?");
        String nameOfPet = input.next();
        return nameOfPet;
    }

    public static ArrayList<Pet> typeThenNameSort(ArrayList<Pet> pets) {
        Collections.sort(pets, new SortPetsByName());
        Collections.sort(pets, new SortPetsByType());
        return pets;
    }
}


package io.zipcoder.pets;

import java.util.Comparator;

public class SortPetsByType implements Comparator<Pet> {
    public int compare(Pet a, Pet b) {
        return a.getClass().getSimpleName().compareTo(b.getClass().getSimpleName());
    }
}


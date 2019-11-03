package io.zipcoder.pets;
import java.util.Comparator;


public class SortPetsByName implements Comparator<Pet> {

    public int compare(Pet a, Pet b) {
        return a.getName().compareTo(b.getName());
    }
}

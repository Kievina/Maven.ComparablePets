package io.zipcoder;


import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import io.zipcoder.pets.Rabbit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ApplicationTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void nameSortBreakByTypeTest() {
        // Given
        ArrayList<Pet> petList = new ArrayList<Pet>();
        Pet pet1 = new Dog("Allie");
        Pet pet2 = new Cat("Sophie");
        Pet pet3 = new Cat("Allie");
        Pet pet4 = new Pet("Grey");
        Pet pet5 = new Rabbit("Blue");
        Pet pet6 = new Pet("Sophie");
        Pet pet7 = new Cat("Blue");
        petList.add(pet1);
        petList.add(pet2);
        petList.add(pet3);
        petList.add(pet4);
        petList.add(pet5);
        petList.add(pet6);
        petList.add(pet7);
        Pet[] expected = {pet3, pet1, pet7, pet5, pet4, pet2, pet6};

        // When
        Collections.sort(petList);
        Pet[] actual = petList.toArray(new Pet[petList.size()]);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void typeSortBreakByNameTest() {
        // Given
        ArrayList<Pet> petList = new ArrayList<Pet>();
        Pet pet1 = new Dog("Allie");
        Pet pet2 = new Cat("Sophie");
        Pet pet3 = new Cat("Allie");
        Pet pet4 = new Pet("Grey");
        Pet pet5 = new Rabbit("Blue");
        Pet pet6 = new Pet("Sophie");
        Pet pet7 = new Cat("Blue");
        petList.add(pet1);
        petList.add(pet2);
        petList.add(pet3);
        petList.add(pet4);
        petList.add(pet5);
        petList.add(pet6);
        petList.add(pet7);
        Pet[] expected = {pet3, pet7, pet2, pet1, pet4, pet6, pet5};

        // When
        Application.typeThenNameSort(petList);
        Pet[] actual = petList.toArray(new Pet[petList.size()]);

        // Then
        Assert.assertEquals(expected, actual);
    }
}

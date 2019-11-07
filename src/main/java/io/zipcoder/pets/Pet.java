package io.zipcoder.pets;

public class Pet implements Comparable<Pet> {
    private String name;
    private String type;

    public Pet(String name) {
        this.name = name;
    }

   /* public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }*/


    public String speak() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int compareTo(Pet o) {
        if(this.getName().compareTo(o.getName()) != 0)
            return this.getName().compareTo(o.getName());
        else
            return this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
    }
}

package io.zipcoder.pets;

public class Dog extends Pet {
    public Dog(String name) {
        super (name);
    }
    public String speak() {
        return "Bark!";
    }
    public int compareTo(Pet o) {
        if(this.getName().compareTo(o.getName()) != 0)
            return this.getName().compareTo(o.getName());
        else
            return this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
    }
}

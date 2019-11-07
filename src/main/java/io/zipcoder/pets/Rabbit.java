package io.zipcoder.pets;

public class Rabbit extends Pet {
    public Rabbit(String name) {
        super (name);
    }
    public String speak() {
        return "Nibble!";
    }
    public int compareTo(Pet o) {
        if(this.getName().compareTo(o.getName()) != 0)
            return this.getName().compareTo(o.getName());
        else
            return this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
    }
}

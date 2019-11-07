package io.zipcoder.pets;

public class Cat extends Pet {
    public Cat(String name) {
        super (name);
    }
    public String speak() {
        return "Meow!";
    }
    public int compareTo(Pet o) {
        if(this.getName().compareTo(o.getName()) != 0)
            return this.getName().compareTo(o.getName());
        else
            return this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
    }
}

package zoo.animalclasses;

import zoo.another.Sayable;

public abstract class Animal implements Sayable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String feed();

    public String getName() {
        return this.name;
    }

}

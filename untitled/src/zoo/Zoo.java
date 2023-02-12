package zoo;

import zoo.animalclasses.Animal;
import zoo.another.*;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<Animal> animals = new ArrayList<>();

    public Zoo(List<Animal> animal) {
        animals.addAll(animal);
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void addAnimals(List<Animal> animal) {
        this.animals.addAll(animal);
    }


    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Sayable> getSay() {
        List<Sayable> result = new ArrayList<>();
        for (Animal animal : animals) {
            result.add(animal);
        }
        result.add(new Radio());
        return result;
    }

    public List<Runable> GetRunable() {
        List<Runable> runableList = new ArrayList<>();
        for (Animal animal : this.animals) {
            if (animal instanceof Runable) {
                runableList.add((Runable) animal);
            }

        }
        return runableList;
    }

    public List<Flyable> GetFlyable() {
        List<Flyable> flyableList = new ArrayList<>();
        for (Animal animal : this.animals) {
            if (animal instanceof Flyable) {
                flyableList.add((Flyable) animal);
            }

        }
        return flyableList;
    }

    public List<Sweamable> GetSwemable() {
        List<Sweamable> sweamableList = new ArrayList<>();
        for (Animal animal : this.animals) {
            if (animal instanceof Flyable) {
                sweamableList.add((Sweamable) animal);
            }

        }
        return sweamableList;
    }
}


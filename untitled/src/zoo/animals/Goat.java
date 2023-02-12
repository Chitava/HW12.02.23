package zoo.animals;

import zoo.animalclasses.Herbivores;
import zoo.another.Runable;

public class Goat extends Herbivores implements Runable {
    private int speedRun = 20;

    public Goat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "меее";
    }

    @Override
    public int GetSpeedRun() {
        return this.speedRun;
    }
}

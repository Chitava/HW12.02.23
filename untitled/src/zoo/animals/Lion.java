package zoo.animals;

import zoo.animalclasses.Predator;
import zoo.another.Runable;

public class Lion extends Predator implements Runable {
    private int speedRun = 50;

    public Lion(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "נננננננ";
    }

    @Override
    public int GetSpeedRun() {
        return this.speedRun;
    }
}

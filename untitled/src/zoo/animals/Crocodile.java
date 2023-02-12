package zoo.animals;

import zoo.animalclasses.Predator;
import zoo.another.Runable;
import zoo.another.Sweamable;

public class Crocodile extends Predator implements Runable, Sweamable {
    private int speedRun = 3;
    private int sweamSpeed = 15;
    private int depth = 15;

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "רררררררר";
    }

    @Override
    public int GetSpeedRun() {
        return this.speedRun;
    }

    @Override
    public int GetSweamSpeed() {
        return this.sweamSpeed;
    }

    @Override
    public int GetDepth() {
        return this.depth;
    }
}

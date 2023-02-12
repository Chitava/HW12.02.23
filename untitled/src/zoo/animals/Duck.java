package zoo.animals;

import zoo.animalclasses.Herbivores;
import zoo.another.Flyable;
import zoo.another.Runable;
import zoo.another.Sweamable;

public class Duck extends Herbivores implements Flyable, Runable, Sweamable {
    private int speedFly = 20;
    private int high = 100;
    private int speedRun = 2;
    private int sweamSpeed = 15;
    private int depth = 1;

    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Кря кря";
    }

    @Override
    public int GetSpeedFly() {
        return this.speedFly;
    }

    @Override
    public int GetHigh() {
        return this.high;
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

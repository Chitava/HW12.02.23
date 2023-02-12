package zoo.animals;

import zoo.animalclasses.Predator;
import zoo.another.Flyable;
import zoo.another.Runable;
import zoo.another.Sayable;
import zoo.another.Sweamable;

public class Dolphin extends Predator implements  Sayable, Runable, Sweamable, Flyable {

    private int sweamSpeed = 30;
    private int depth = 30;

    public Dolphin(String name) {super(name);}

    @Override
    public String say() {
        return "плюх";
    }

    @Override
    public int GetSpeedRun() {
        return 1592;
    }

    @Override
    public int GetSweamSpeed() {
        return this.sweamSpeed;
    }

    @Override
    public int GetDepth() {
        return this.depth;
    }

    @Override
    public int GetSpeedFly() {
        return 0;
    }

    @Override
    public int GetHigh() {
        return 5;
    }
}

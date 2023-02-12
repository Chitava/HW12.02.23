package zoo.animals;

import zoo.animalclasses.Herbivores;
import zoo.another.Runable;

public class Cow extends Herbivores implements Runable {
    private int speedRun = 10;

    public Cow(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "μσσσ";
    }

    @Override
    public int GetSpeedRun() {
        return this.speedRun;
    }
}

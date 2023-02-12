import zoo.Zoo;
import zoo.animalclasses.Animal;
import zoo.animals.*;
import zoo.another.Flyable;
import zoo.another.Runable;
import zoo.another.Sayable;
import zoo.another.Sweamable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalsList = List.of(
                new Cow("Буренка"),
                new Goat("Дереза"),
                new Lion("Алекс"),
                new Crocodile("Геннадий"),
                new Duck("Дональд"),
                new Dolphin("Сеня")

        );

        Zoo barricadnaya = new Zoo(animalsList);

        for (Sayable animal : barricadnaya.getSay()) {
            System.out.println(animal.say());
        }
        System.out.println("----------------Бегающие------------------\n");
        for (Runable animal : barricadnaya.GetRunable()) {
            System.out.printf(((Animal) animal).getName() + " Максимальная скорость забега --> " + animal.GetSpeedRun() + " км/ч " + "\n");
        }
        System.out.println("\n----------------Летающие------------------\n");
        for (Flyable animal : barricadnaya.GetFlyable()) {
            System.out.printf(((Animal) animal).getName() + " Максимальная скорость полета --> " + animal.GetSpeedFly() + " км/ч " + "\n");
            System.out.printf(((Animal) animal).getName() + " Максимальная высота полета --> " + animal.GetHigh() + " м " + "\n");

        }
        System.out.println("\n----------------Плавающие------------------\n");
        for (Sweamable animal : barricadnaya.GetSwemable()) {
            System.out.printf(((Animal) animal).getName() + " Максимальная скорость заплыва --> " + animal.GetSweamSpeed() + " км/ч " + "\n");
            System.out.printf(((Animal) animal).getName() + " Максимальная глубина погружения --> " + animal.GetDepth() + " м " + "\n");

        }

    }
}

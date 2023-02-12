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
                new Cow("�������"),
                new Goat("������"),
                new Lion("�����"),
                new Crocodile("��������"),
                new Duck("�������"),
                new Dolphin("����")

        );

        Zoo barricadnaya = new Zoo(animalsList);

        for (Sayable animal : barricadnaya.getSay()) {
            System.out.println(animal.say());
        }
        System.out.println("----------------��������------------------\n");
        for (Runable animal : barricadnaya.GetRunable()) {
            System.out.printf(((Animal) animal).getName() + " ������������ �������� ������ --> " + animal.GetSpeedRun() + " ��/� " + "\n");
        }
        System.out.println("\n----------------��������------------------\n");
        for (Flyable animal : barricadnaya.GetFlyable()) {
            System.out.printf(((Animal) animal).getName() + " ������������ �������� ������ --> " + animal.GetSpeedFly() + " ��/� " + "\n");
            System.out.printf(((Animal) animal).getName() + " ������������ ������ ������ --> " + animal.GetHigh() + " � " + "\n");

        }
        System.out.println("\n----------------���������------------------\n");
        for (Sweamable animal : barricadnaya.GetSwemable()) {
            System.out.printf(((Animal) animal).getName() + " ������������ �������� ������� --> " + animal.GetSweamSpeed() + " ��/� " + "\n");
            System.out.printf(((Animal) animal).getName() + " ������������ ������� ���������� --> " + animal.GetDepth() + " � " + "\n");

        }

    }
}

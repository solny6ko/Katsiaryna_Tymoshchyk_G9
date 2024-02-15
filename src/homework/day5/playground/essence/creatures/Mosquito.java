package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Flyable;

public class Mosquito extends Insect implements Flyable {
    public Mosquito(int mass) {
        super(mass);
    }

    public void eat(Plant food) {
        System.out.println("I am " + Animal.class.getName() + "and I am eating " + Plant.class.getName());
    }
}

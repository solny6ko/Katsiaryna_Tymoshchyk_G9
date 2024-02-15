package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Flyable;

public class Fly extends Insect implements Flyable {
    public Fly(int mass, String name) {
        super(mass, name);
    }

    public void eat(Plant food) {
        System.out.println("I am " + Animal.class.getName() + "and I am eating " + Plant.class.getName());
    }

    @Override
    public void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I amd flying to %s", getClass().getSimpleName(), this.getName(), direction).println();
    }
}

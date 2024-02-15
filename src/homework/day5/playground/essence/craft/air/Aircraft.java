package homework.day5.playground.essence.craft.air;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.craft.Transportable;

public abstract class Aircraft extends Matter implements Flyable, Transportable {

    protected String name;

    public Aircraft(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I amd flying to %s", getClass().getSimpleName(), this.getName(), direction).println();
    }

    public int move(int pointA, int pointB) {
        int distance = pointB - pointA;
        System.out.printf("I am %s, my name is %s and I am moving from point %s to point %s", getClass().getSimpleName(), this.getName(), pointA, pointB).println();
        return distance;
    }

}

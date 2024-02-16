package homework.day5.playground.essence.craft.field;

import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.craft.Rideable;
import homework.day5.playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Rideable {

    protected String name;

    public Vehicle(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int move(int pointA, int pointB) {
        int distance = pointB - pointA;
        System.out.printf("I am %s, my name is %s and I am moving from point %s to point %s", getClass().getSimpleName(), this.getName(), pointA, pointB).println();
        return distance;
    }

    public void drive(String direction) {
        System.out.printf("I am %s, my name is %s and I amd driving to %s", getClass().getSimpleName(), this.getName(), direction).println();
    }
}

package homework.day5.playground.essence.craft.field;

public class Moped extends Vehicle {
    public Moped(int mass, String name) {
        super(mass, name);
    }

    public int move(int pointA, int pointB) {
        int distance = pointB - pointA;
        System.out.printf("I am %s, my name is %s and I am moving from point %s to point %s", getClass().getSimpleName(), this.getName(), pointA, pointB).println();
        return distance;
    }
}

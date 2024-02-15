package homework.day5.playground.essence.craft.air;

public class Plane extends Aircraft {
    public Plane(int mass, String name) {
        super(mass, name);

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

package homework.day5.playground.essence.craft.field;

public class Car extends Vehicle {
    public Car(int mass, String name) {
        super(mass, name);
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

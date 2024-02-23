package homework.day5.playground.essence.creatures;

import java.io.Serializable;

public abstract class Flower extends Plant implements Serializable {
    public Flower(int mass, String name) {
        super(mass, name);
    }
}

package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Matter;

import java.io.Serializable;

public abstract class Plant extends Matter implements Serializable {

    protected String name;

    public Plant(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

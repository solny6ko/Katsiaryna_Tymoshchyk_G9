package homework.day5.playground.essence.craft.field;

import homework.day5.playground.essence.Matter;

public abstract class Vehicle extends Matter {
    public Vehicle(int mass) {
        super(mass);
    }

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
}

package homework.day5.playground.essence.creatures;

public class Carrot extends Vegetable{

    int mass;
    public Carrot(int mass, String name) {
        super(mass, name);
    }

    @Override
    public int getMass() {
        return mass;
    }

    @Override
    public void setMass(int mass) {
        this.mass = mass;
    }

//    Carrot home = new Carrot(15);
}

package homework.day5.playground.essence.creatures;

public class Fly extends Insect{
    public Fly(int mass) {
        super(mass);
    }

    public void eat(Plant food) {
        System.out.println("I am " + Animal.class.getName() + "and I am eating " + Plant.class.getName());
    }
}

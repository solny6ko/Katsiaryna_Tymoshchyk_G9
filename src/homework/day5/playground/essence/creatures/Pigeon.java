package homework.day5.playground.essence.creatures;

public class Pigeon extends Vertebrata{
    public Pigeon(int mass) {
        super(mass);
    }

    public void eat(Plant food) {
        System.out.println("I am " + Animal.class.getName() + "and I am eating " + Plant.class.getName());
    }

    public void eat(Insect food) {
        System.out.println("I am " + Vertebrata.class.getName() + "and I am eating " + Insect.class.getName());
    }
}

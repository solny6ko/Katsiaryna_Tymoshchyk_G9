package homework.day5.playground.essence.creatures;

public class Raven extends Vertebrata{
    public Raven(int mass, String name) {
        super(mass, name);
    }

    public void eat(Plant food) {
        System.out.println("I am " + Animal.class.getName() + "and I am eating " + Plant.class.getName());
    }

    public void eat(Insect food) {
        System.out.println("I am " + Vertebrata.class.getName() + "and I am eating " + Insect.class.getName());
    }

}

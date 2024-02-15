package homework.day5.playground.essence.creatures;

public class Beetle extends Insect implements Crawlable{


//    Beetle newBeetle = new Beetle(15);

    int mass;

    public Beetle(int mass) {
        super(mass);
    }

    @Override
    public int getMass() {
        return mass;
    }

    @Override
    public void setMass(int mass) {
        this.mass = mass;
    }

    public void eat(Plant food) {
        System.out.println("I am " + Animal.class.getName() + "and I am eating " + Plant.class.getName());
    }

    public void nest(Carrot home) {
        int familyMembers = home.mass / mass;
        if (mass < home.mass) {
            System.out.println("I am " + Beetle.class.getName() + " and I will nest there with " + familyMembers + " my family members");
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }
}

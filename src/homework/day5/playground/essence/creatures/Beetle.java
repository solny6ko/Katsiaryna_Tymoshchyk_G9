package homework.day5.playground.essence.creatures;

public class Beetle extends Insect implements Crawlable{


//    Beetle newBeetle = new Beetle(15);

    int mass;

    public Beetle(int mass, String name) {
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

    public void crawl(String direction, int distance){
        System.out.printf("I am %s, my name is %s and I am crawling to %s for %s units", this.getClass().getSimpleName(), this.getName(), direction, distance).println();
        System.out.println("vz-vz-vzz-zz..");
    }
}

package homework.day5.playground.essence.creatures;

public class Crocodile extends Vertebrata implements Crawlable{
    public Crocodile(int mass, String name) {
        super(mass, name);
    }

    public void eat(Plant food) {
        System.out.println("I am " + Animal.class.getName() + "and I am eating " + Plant.class.getName());
    }

    public void eat(Insect food) {
        System.out.println("I am " + Vertebrata.class.getName() + "and I am eating " + Insect.class.getName());
    }

    public void crawl(String direction, int distance){
        System.out.printf("I am %s, my name is %s and I am crawling to %s for %s units", this.getClass().getSimpleName(), this.getName(), direction, distance).println();
        System.out.println("wr-wr-wrr-r..");
    }
}

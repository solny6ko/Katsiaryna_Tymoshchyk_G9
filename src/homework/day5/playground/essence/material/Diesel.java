package homework.day5.playground.essence.material;

import homework.day5.playground.essence.Matter;

public class Diesel extends Matter implements Pourable, Powerable {
    public Diesel(int mass) {
        super(mass);
    }

    public void spread(String storeName){
        System.out.printf("I am %s and I am spreading in %s", this.getClass().getSimpleName(), storeName).println();
        System.out.println("whooh..");
    };
}

package project.boxing;

import project.filling.SparklingWater;
import project.filling.Water;

public class Bottle {
    private double volume;
    private Water water;

    public Bottle(double volume) {
        this.volume = volume;
        System.out.println("Bottle is created " + volume);
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void open() {
        System.out.println("Bottle is opened");
        this.water.degas();

    }
//
//    public void setBubbles(){
//
//    }


}
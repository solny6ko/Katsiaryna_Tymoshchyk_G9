package project.boxing;

import project.filling.Bubble;
import project.filling.SparklingWater;
import project.filling.Water;

public class Bottle {
    private double volume;
    private SparklingWater water;
    private static final double BUBBLES_PER_LITER = 1000;
    SparklingWater sparklingWater = new SparklingWater(water);

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

    public void open(){
        this.water.setOpened();
    }

    public void warm(int temperature){
        water.setTemperature();
    }

    public Water getWater(){
        return water;
    }

    public void setWater(Water water){
        this.water=water;
    }

    public void setBubbles(){
        Bubble[] newBubble = water.getBubbles();
        water.bubbles = new Bubble[(int) (volume * BUBBLES_PER_LITER)];
        water.pump(water.bubbles);
    }


    public void open() {
        System.out.println("Bottle is opened");

        sparklingWater.degas();

    }


}
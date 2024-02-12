package project.boxing;

import project.filling.Bubble;
import project.filling.SparklingWater;
import project.filling.Water;

public class Bottle {
    private double volume;
    private Water water;
    private static final double BUBBLES_PER_LITER = 1000;
    SparklingWater sparklingWater = new SparklingWater("red", "nope", "digusting", 10);

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
        Bubble[] newBubble = sparklingWater.getBubbles();
        sparklingWater.bubbles = new Bubble[(int) (volume * BUBBLES_PER_LITER)];
        sparklingWater.pump(sparklingWater.bubbles);
    }


    public void open() {
        System.out.println("Bottle is opened");

        sparklingWater.degas();

    }


}
package BubbleTask;



import java.util.Random;

public class SparklingWater extends Water {

    private Bubble[] bubbles;

    public SparklingWater() {
        int litr = 10000;
        bubbles = new Bubble[litr];
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void degas() {
        for (Bubble bubble : bubbles) {
            bubble.bubbleCramp();
        }
        bubbles = new Bubble[0];
    }
}



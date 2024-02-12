package project.filling;

public class SparklingWater extends Water {

    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);
        isOpened();
    }

    public Bubble[] getBubbles() {
        return bubbles;
    }

    public Bubble[] pump(Bubble[] bubbles) {
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("TLEN");
        }
        System.out.println("Gas is pumpped");
        return bubbles;
    }

    public void setOpened() {
        boolean isOpened = true;
        degas();
    }

    public void degas() {
        System.out.println("we are in degas method");
        for (Bubble bubble : bubbles) {
            bubble.cramp();
        }
        bubbles = null;
    }

    private void isOpened() {

    }
}




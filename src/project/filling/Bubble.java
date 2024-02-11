package project.filling;

public class Bubble {

    private static final double BUBBLE_VOLUME = 0.3;

    private String gas;

    public Bubble(String gas) {
        this.gas = gas;
    }
//    public Bubble() {
//    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public String getGas() {
        return gas;

    }

    public void cramp() {
        System.out.println("Cramp!");
    }

    public double getVolume() {
        return BUBBLE_VOLUME;
    }

}

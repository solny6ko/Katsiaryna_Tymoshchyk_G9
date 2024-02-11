package project.filling;

public class Bubble {

    private static final double BUBBLE_VOLUME = 0.3;

    private String bubbleGasComposition;

    public Bubble(String bubbleGasComposition) {
        this.bubbleGasComposition = bubbleGasComposition;
    }

    public Bubble() {
    }


    public void setBubbleGasComposition(String bubbleGasComposition) {
        this.bubbleGasComposition = bubbleGasComposition;
    }

    public String getBubbleGasComposition() {
        return bubbleGasComposition;

    }

    public void bubbleCramp() {
        System.out.println("Cramp!");
    }

}

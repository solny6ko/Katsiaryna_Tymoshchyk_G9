package BubbleTask;

public class Bubble {

    private final double BUBBLE_VOLUME = 0.3;

    private String bubbleGasComposition;

    public Bubble(String bubbleGasComposition){
        this.bubbleGasComposition = bubbleGasComposition;
    }

    public void setBubbleGasComposition(String bubbleGasComposition) {
        this.bubbleGasComposition = bubbleGasComposition;
    }
    public String getBubbleGasComposition(){
        return bubbleGasComposition;

    }

    public void bubbleCramp() {
        System.out.println("Cramp!");
    }

}

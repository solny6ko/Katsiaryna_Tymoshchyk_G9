package project.filling;

public class SparklingWater extends Water {

    boolean isOpened;
    Bubble[] bubbles;

    public SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);

    }

    private double bottleVolume;
    //    объявляем постоянную про 1 литр воды содержит 10 тыс пузырьков
    private final int BUBBLES_PER_LITER = 10000;
    private int bubblesQuantity;

    //    создаем конструктор для газировки и считаем, сколько пузырьков накачается в бутылку в зависимости от ее объема
    public setBubbles(double volume) {
        this.volume = volume;
        this.bubblesQuantity = (int) (volume * BUBBLES_PER_LITER);
        System.out.println("SparklingWater is created. bubblesQuantity equals to " + bubblesQuantity);
        Bubble[] bubbles = new Bubble[this.bubblesQuantity];
        System.out.println("Array Bubbles length is " + bubbles.length);
    }


//декларируем массив пузырьков с ячейками типа Bubble
//массив будет заполнен количеством пузырьков = bubblesQuantity


    private Bubble[] pump(Bubble[] bubbles) {
//        System.out.println(bubbles.length);
        for (int i = 0; i < bubbles.length; i++) {
            System.out.println(i);
            bubbles[i] = new Bubble("TLEN");
        }
        System.out.println("Gas is pumpped");
        return bubbles;
    }

    public void degas() {
        System.out.println("we are in degas method");
        System.out.println("Length of Bubbles " + bubbles.length);
        for (int i = 0; i < bubbles.length; i++) {
            System.out.println(i);
            bubbles[i].cramp();
        }
    }
}



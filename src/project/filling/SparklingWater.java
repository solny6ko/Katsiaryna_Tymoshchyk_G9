package project.filling;

//- создать класс SparklingWater, являющийся дочерним Water
//- у газировки есть пузырьки
//- вода заполняется пузырьками при упаковке на заводе, для этого у нее есть метод pump(Bubble[] bubbles)
//- у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье
//- 1 литр воды содержит 10 тыс пузырьков

public class SparklingWater extends Water {

    private double bottleVolume;
    //    объявляем постоянную про 1 литр воды содержит 10 тыс пузырьков
    private final int BUBBLES_PER_LITER = 10000;
    private int bubblesQuantity;
    Bubble[] bubbles;

    //    создаем конструктор для газировки и считаем, сколько пузырьков накачается в бутылку в зависимости от ее объема
    public SparklingWater(double bottleVolume) {
        this.bottleVolume = bottleVolume;
        this.bubblesQuantity = (int) (bottleVolume * BUBBLES_PER_LITER);
        System.out.println("SparklingWater is created. bubblesQuantity equals to " + bubblesQuantity);
        Bubble[] bubbles = new Bubble[this.bubblesQuantity];
        System.out.println("Array Bubbles length is " + bubbles.length);
    }
//декларируем массив пузырьков с ячейками типа Bubble
//массив будет заполнен количеством пузырьков = bubblesQuantity


    public void pump(Bubble[] bubbles) {
//        System.out.println(bubbles.length);
        for (int i = 0; i < bubbles.length; i++) {
            System.out.println(i);
            this.bubbles[i] = new Bubble();
        }
        System.out.println("Gas is pumpped");

    }

    public void degas() {
        System.out.println("we are in degas method");
        System.out.println("Length of Bubbles " + bubbles.length);
        for (Bubble i : bubbles) {
            System.out.println(i);
            i.bubbleCramp();
        }
    }
}



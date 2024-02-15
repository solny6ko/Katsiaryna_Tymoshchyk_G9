package homework.day5.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {
    public static int generateCoordinate() {
        Random random = new Random();
        int coordinate = random.nextInt(79) + 1;
        System.out.printf("CoordinatesGenerator: I have generated point with value: %s", coordinate).println();
        return coordinate;


    }
}

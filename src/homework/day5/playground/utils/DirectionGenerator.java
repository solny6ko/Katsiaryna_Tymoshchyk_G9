package homework.day5.playground.utils;

import java.util.Random;

public class DirectionGenerator {
    public static String generateDirection() {
        String direction = "";
        Random random = new Random();
        int randomNum = random.nextInt(39) + 1;
        if (randomNum < 10) {
            direction = "NORTH";
        } else if (randomNum > 9 && randomNum < 20) {
            direction = "SOUTH";
        } else if (randomNum > 19 && randomNum < 30) {
            direction = "WEST";
        } else if (randomNum > 29 && randomNum < 39) {
            direction = "EAST";
        }

        return direction;

    }
}

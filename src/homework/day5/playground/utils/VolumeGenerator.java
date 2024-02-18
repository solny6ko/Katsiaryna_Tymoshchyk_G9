package homework.day5.playground.utils;

import homework.day5.playground.essence.material.Diesel;
import homework.day5.playground.essence.material.Petrol;
import homework.day5.playground.essence.material.Pourable;
import homework.day5.playground.essence.material.Water;

import java.util.Random;

public class VolumeGenerator {
    public static int generateVolume(Pourable pourable) {
        int volume = 0;
        Random random = new Random();
        if (pourable instanceof Petrol || pourable instanceof Diesel) {
            volume = random.nextInt(49) + 1;
        } else if (pourable instanceof Water) {
            volume = random.nextInt(49, 99) + 1;
        }
        System.out.printf("VolumeGenerator: I have generated volume of %s with value: %s", pourable.getClass().getSimpleName(), volume).println();

        return volume;
    }

}

package homework.day5.playground.runners;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.craft.air.Aircraft;
import homework.day5.playground.essence.craft.air.Copter;
import homework.day5.playground.essence.craft.air.Plane;
import homework.day5.playground.essence.craft.air.Rocket;
import homework.day5.playground.essence.creatures.Fly;
import homework.day5.playground.essence.creatures.Insect;
import homework.day5.playground.essence.creatures.Mosquito;
import homework.day5.playground.processors.FlyableProcessor;

public class FlyableProcessorRunner {
    public static void main(String[] args) {
        FlyableProcessor flyableProcessor = new FlyableProcessor();
        Flyable flyableCopter = new Copter(223, "Mi8 Flyable");
        flyableProcessor.runFlyable(flyableCopter);
        Flyable flyablePlane = new Plane(3452, "Boeing 837 Flyable");
        flyableProcessor.runFlyable(flyablePlane);
        Flyable flyableRocket = new Rocket(7623, "Super Heavy Flyable");
        flyableProcessor.runFlyable(flyableRocket);
        Flyable flyableFly = new Fly(23, "Domestica Flyable");
        flyableProcessor.runFlyable(flyableFly);
        Flyable flyableMosquito = new Mosquito(12, "Vulgaris Flyable");
        flyableProcessor.runFlyable(flyableMosquito);
        Aircraft aircraftCopter = new Copter(223, "Mi8 Aircraft");
        flyableProcessor.runFlyable(aircraftCopter);
        Aircraft aircraftPlane = new Plane(3452, "Boeing 837 Aircraft");
        flyableProcessor.runFlyable(aircraftPlane);
        Aircraft aircraftRocket = new Rocket(7623, "Super Heavy Aircraft");
        flyableProcessor.runFlyable(aircraftRocket);
//        Insect insectFly = new Fly(23, "Domestica Insect");  - для родительского класса Insect не заимплеменчен интерфейс Flyable
//        flyableProcessor.runFlyable(insectFly);
//        Insect insectMosquito = new Mosquito(12, "Vulgaris Insect"); - для родительского класса Insect не заимплеменчен интерфейс Flyable
//        flyableProcessor.runFlyable(insectMosquito);
        Copter aCopter = new Copter(223, "Mi8 Copter");
        flyableProcessor.runFlyable(aCopter);
        Plane aPlane = new Plane(3452, "Boeing 837 Plane");
        flyableProcessor.runFlyable(aPlane);
        Rocket aRocket = new Rocket(7623, "Super Heavy Rocket");
        flyableProcessor.runFlyable(aRocket);
        Fly aFly = new Fly(23, "Domestica Fly");
        flyableProcessor.runFlyable(aFly);
        Mosquito aMosquito = new Mosquito(12, "Vulgaris Mosquito");
        flyableProcessor.runFlyable(aMosquito);
        Mosquito bMosquito = new Mosquito(12, "Vulgaris Mosquito");
        flyableProcessor.runFlyable(bMosquito, "NOWHERE");
        Fly bFly = new Fly(23, "Domestica Fly");
        flyableProcessor.runFlyable(bFly, "EVERYWHERE");


    }
}

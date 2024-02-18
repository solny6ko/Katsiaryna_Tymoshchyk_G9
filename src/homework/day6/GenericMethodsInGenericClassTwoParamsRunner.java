package homework.day6;

import homework.day5.playground.essence.craft.air.Copter;
import homework.day5.playground.essence.craft.air.Plane;
import homework.day5.playground.essence.craft.air.Rocket;
import homework.day5.playground.essence.craft.field.Car;
import homework.day5.playground.essence.craft.field.Moped;
import homework.day5.playground.essence.craft.field.Motorbike;
import homework.day5.playground.essence.craft.hand.Bottle;
import homework.day5.playground.essence.craft.hand.Can;
import homework.day5.playground.essence.craft.hand.Mug;
import homework.day5.playground.essence.creatures.*;
import homework.day5.playground.essence.material.Diesel;
import homework.day5.playground.essence.material.Petrol;
import homework.day5.playground.essence.material.Water;

public class GenericMethodsInGenericClassTwoParamsRunner {
    public static void main(String[] args) {

        GenericMethodsInGenericClassTwoParams<String, String> genericMethodsInGenericClassTwoParamsString = new GenericMethodsInGenericClassTwoParams<>();
        genericMethodsInGenericClassTwoParamsString.genericMethodGenArgs("dksfj");
        genericMethodsInGenericClassTwoParamsString.genericMethodGenArgs("dksfj", "fghgj");
        genericMethodsInGenericClassTwoParamsString.genericMethodHalfGenArgs("dsfdg","dfsgb");
        genericMethodsInGenericClassTwoParamsString.genericMethodHalfGenArgs("dsfdg","dfsgb", "sfdgb");

        System.out.println("");

        GenericMethodsInGenericClassTwoParams<String, Integer> genericMethodsInGenericClassTwoParamsStrInt = new GenericMethodsInGenericClassTwoParams<>();
        genericMethodsInGenericClassTwoParamsStrInt.genericMethodGenArgs("dksfj");
        genericMethodsInGenericClassTwoParamsStrInt.genericMethodGenArgs("dksfj", 6);
        genericMethodsInGenericClassTwoParamsStrInt.genericMethodHalfGenArgs("dsfdg","dfsgb");
        genericMethodsInGenericClassTwoParamsStrInt.genericMethodHalfGenArgs("dsfdg",6, "dsfgdhjkh,nmbvc");

        System.out.println("");

        GenericMethodsInGenericClassTwoParams<String, Double> genericMethodsInGenericClassTwoParamsStrDoub = new GenericMethodsInGenericClassTwoParams<>();
        genericMethodsInGenericClassTwoParamsStrDoub.genericMethodGenArgs("dksfj");
        genericMethodsInGenericClassTwoParamsStrDoub.genericMethodGenArgs("dksfj", 6.0);
        genericMethodsInGenericClassTwoParamsStrDoub.genericMethodHalfGenArgs("dsfdg","dfsgb");
        genericMethodsInGenericClassTwoParamsStrDoub.genericMethodHalfGenArgs("dsfdg",7.9, "sfdsdfgnhmjgb");

        System.out.println("");

        GenericMethodsInGenericClassTwoParams<Integer, Integer> genericMethodsInGenericClassTwoParamsIntInt = new GenericMethodsInGenericClassTwoParams<>();
        genericMethodsInGenericClassTwoParamsIntInt.genericMethodGenArgs(8);
        genericMethodsInGenericClassTwoParamsIntInt.genericMethodGenArgs(4675, 687987);
        genericMethodsInGenericClassTwoParamsIntInt.genericMethodHalfGenArgs(35467589,"dfsgb");
        genericMethodsInGenericClassTwoParamsIntInt.genericMethodHalfGenArgs(354768769,564789, "sfds567iuykjhgfer5tydfgnhmjgb");

        System.out.println("");

        GenericMethodsInGenericClassTwoParams<Copter, Plane> genericMethodsInGenericClassTwoParamsCopterPlane = new GenericMethodsInGenericClassTwoParams<>();
        genericMethodsInGenericClassTwoParamsCopterPlane.genericMethodGenArgs(new Copter(5,"name"));
        genericMethodsInGenericClassTwoParamsCopterPlane.genericMethodGenArgs(new Copter(5,"name"), new Plane(5,"name"));
        genericMethodsInGenericClassTwoParamsCopterPlane.genericMethodHalfGenArgs(new Copter(5,"name"),"dfsgb");
        genericMethodsInGenericClassTwoParamsCopterPlane.genericMethodHalfGenArgs(new Copter(5,"name"),new Plane(5,"name"), "s");

        System.out.println("");

        GenericMethodsInGenericClassTwoParams<Rocket, Car> genericMethodsInGenericClassTwoParamsRocketCar = new GenericMethodsInGenericClassTwoParams<>();
        genericMethodsInGenericClassTwoParamsRocketCar.genericMethodGenArgs(new Rocket(5,"name"));
        genericMethodsInGenericClassTwoParamsRocketCar.genericMethodGenArgs(new Rocket(5,"name"), new Car(5,"name"));
        genericMethodsInGenericClassTwoParamsRocketCar.genericMethodHalfGenArgs(new Rocket(5,"name"),"dfefrgthyjghgsgb");
        genericMethodsInGenericClassTwoParamsRocketCar.genericMethodHalfGenArgs(new Rocket(5,"name"),new Car(5,"name"), "rgth");

        System.out.println("");

        GenericMethodsInGenericClassTwoParams<Moped, Motorbike> genericMethodsInGenericClassTwoParamsMopedMotorbike = new GenericMethodsInGenericClassTwoParams<>();
        genericMethodsInGenericClassTwoParamsMopedMotorbike.genericMethodGenArgs(new Moped(5,"name"));
        genericMethodsInGenericClassTwoParamsMopedMotorbike.genericMethodGenArgs(new Moped(5,"name"), new Motorbike(5,"name"));
        genericMethodsInGenericClassTwoParamsMopedMotorbike.genericMethodHalfGenArgs(new Moped(5,"name"),"dfsghhhhhhhhhhhgfhgb");
        genericMethodsInGenericClassTwoParamsMopedMotorbike.genericMethodHalfGenArgs(new Moped(5,"name"),new Motorbike(5,"name"), "jukh");

        System.out.println("");

        GenericMethodsInGenericClassTwoParams<Bottle, Can> genericMethodsInGenericClassTwoParamsBottleCan = new GenericMethodsInGenericClassTwoParams<>();
        genericMethodsInGenericClassTwoParamsBottleCan.genericMethodGenArgs(new Bottle(5, "sdgfb"));
        genericMethodsInGenericClassTwoParamsBottleCan.genericMethodGenArgs(new Bottle(5, "sdgfb"), new Can(5, "sdgfb"));
        genericMethodsInGenericClassTwoParamsBottleCan.genericMethodHalfGenArgs(new Bottle(5, "sdgfb"),"dfsgb");
        genericMethodsInGenericClassTwoParamsBottleCan.genericMethodHalfGenArgs(new Bottle(5, "sdgfb"),new Can(5, "sdgfb"), "sfds567iuykjhgfer5tydfgnhmjgb");

        System.out.println("");

        GenericMethodsInGenericClassTwoParams<Mug, Beetle> genericMethodsInGenericClassTwoParamsMugBeetle = new GenericMethodsInGenericClassTwoParams<>();
        genericMethodsInGenericClassTwoParamsMugBeetle.genericMethodGenArgs(new Mug(5, "sdgfb"));
        genericMethodsInGenericClassTwoParamsMugBeetle.genericMethodGenArgs(new Mug(5, "sdgfb"), new Beetle(5, "sdgfb"));
        genericMethodsInGenericClassTwoParamsMugBeetle.genericMethodHalfGenArgs(new Mug(5, "sdgfb"),"dfsgb");
        genericMethodsInGenericClassTwoParamsMugBeetle.genericMethodHalfGenArgs(new Mug(5, "sdgfb"),new Beetle(5, "sdgfb"), "sfds567iuykjhgfer5tydfgnhmjgb");

        System.out.println("");

        GenericMethodsInGenericClassTwoParams<Carrot, Chamomile> genericMethodsInGenericClassTwoParamsCarrotChamomile = new GenericMethodsInGenericClassTwoParams<>();
        genericMethodsInGenericClassTwoParamsCarrotChamomile.genericMethodGenArgs(new Carrot(5, "sdgfb"));
        genericMethodsInGenericClassTwoParamsCarrotChamomile.genericMethodGenArgs(new Carrot(5, "sdgfb"), new Chamomile(5, "sdgfb"));
        genericMethodsInGenericClassTwoParamsCarrotChamomile.genericMethodHalfGenArgs(new Carrot(5, "sdgfb"),"dfsgb");
        genericMethodsInGenericClassTwoParamsCarrotChamomile.genericMethodHalfGenArgs(new Carrot(5, "sdgfb"),new Chamomile(5, "sdgfb"), "sfds567iuykjhgfer5tydfgnhmjgb");

        System.out.println("");

        GenericMethodsInGenericClassTwoParams<Crocodile, Fly> genericMethodsInGenericClassTwoParamsCrocodileFly = new GenericMethodsInGenericClassTwoParams<>();
        genericMethodsInGenericClassTwoParamsCrocodileFly.genericMethodGenArgs(new Crocodile(5, "sdgfb"));
        genericMethodsInGenericClassTwoParamsCrocodileFly.genericMethodGenArgs(new Crocodile(5, "sdgfb"), new Fly(5, "sdgfb"));
        genericMethodsInGenericClassTwoParamsCrocodileFly.genericMethodHalfGenArgs(new Crocodile(5, "sdgfb"),"dfsgb");
        genericMethodsInGenericClassTwoParamsCrocodileFly.genericMethodHalfGenArgs(new Crocodile(5, "sdgfb"),new Fly(5, "sdgfb"), "sfds567iuykjhgfer5tydfgnhmjgb");

        System.out.println("");

        GenericMethodsInGenericClassTwoParams<Maylily, Mosquito> genericMethodsInGenericClassTwoParamsMaylilyMosquito = new GenericMethodsInGenericClassTwoParams<>();
        genericMethodsInGenericClassTwoParamsMaylilyMosquito.genericMethodGenArgs(new Maylily(5, "sdgfb"));
        genericMethodsInGenericClassTwoParamsMaylilyMosquito.genericMethodGenArgs(new Maylily(5, "sdgfb"), new Mosquito(5, "sdgfb"));
        genericMethodsInGenericClassTwoParamsMaylilyMosquito.genericMethodHalfGenArgs(new Maylily(5, "sdgfb"),"dfsgb");
        genericMethodsInGenericClassTwoParamsMaylilyMosquito.genericMethodHalfGenArgs(new Maylily(5, "sdgfb"),new Mosquito(5, "sdgfb"), "sfds567iuykjhgfer5tydfgnhmjgb");

        System.out.println("");

        GenericMethodsInGenericClassTwoParams<Pigeon, Potato> genericMethodsInGenericClassTwoParamsPigeonPotato = new GenericMethodsInGenericClassTwoParams<>();
        genericMethodsInGenericClassTwoParamsPigeonPotato.genericMethodGenArgs(new Pigeon(5, "sdgfb"));
        genericMethodsInGenericClassTwoParamsPigeonPotato.genericMethodGenArgs(new Pigeon(5, "sdgfb"), new Potato(5, "sdgfb"));
        genericMethodsInGenericClassTwoParamsPigeonPotato.genericMethodHalfGenArgs(new Pigeon(5, "sdgfb"),"dfsgb");
        genericMethodsInGenericClassTwoParamsPigeonPotato.genericMethodHalfGenArgs(new Pigeon(5, "sdgfb"),new Potato(5, "sdgfb"), "sfds567iuykjhgfer5tydfgnhmjgb");

        System.out.println("");

        GenericMethodsInGenericClassTwoParams<Radish, Raven> genericMethodsInGenericClassTwoParamsRadishRaven = new GenericMethodsInGenericClassTwoParams<>();
        genericMethodsInGenericClassTwoParamsRadishRaven.genericMethodGenArgs(new Radish(5, "sdgfb"));
        genericMethodsInGenericClassTwoParamsRadishRaven.genericMethodGenArgs(new Radish(5, "sdgfb"), new Raven(5, "sdgfb"));
        genericMethodsInGenericClassTwoParamsRadishRaven.genericMethodHalfGenArgs(new Radish(5, "sdgfb"),"dfsgb");
        genericMethodsInGenericClassTwoParamsRadishRaven.genericMethodHalfGenArgs(new Radish(5, "sdgfb"),new Raven(5, "sdgfb"), "sfds567iuykjhgfer5tydfgnhmjgb");

        System.out.println("");

        GenericMethodsInGenericClassTwoParams<Rose, Diesel> genericMethodsInGenericClassTwoParamsRoseDiesel = new GenericMethodsInGenericClassTwoParams<>();
        genericMethodsInGenericClassTwoParamsRoseDiesel.genericMethodGenArgs(new Rose(5, "sdgfb"));
        genericMethodsInGenericClassTwoParamsRoseDiesel.genericMethodGenArgs(new Rose(5, "sdgfb"), new Diesel(5));
        genericMethodsInGenericClassTwoParamsRoseDiesel.genericMethodHalfGenArgs(new Rose(5, "sdgfb"),"dfsgb");
        genericMethodsInGenericClassTwoParamsRoseDiesel.genericMethodHalfGenArgs(new Rose(5, "sdgfb"),new Diesel(5), "sfds567iuykjhgfer5tydfgnhmjgb");

        System.out.println("");


        GenericMethodsInGenericClassTwoParams<Petrol, Water> genericMethodsInGenericClassTwoParamsPetrolWater = new GenericMethodsInGenericClassTwoParams<>();
        genericMethodsInGenericClassTwoParamsPetrolWater.genericMethodGenArgs(new Petrol(5));
        genericMethodsInGenericClassTwoParamsPetrolWater.genericMethodGenArgs(new Petrol(5), new Water(5));
        genericMethodsInGenericClassTwoParamsPetrolWater.genericMethodHalfGenArgs(new Petrol(5),"dfsgb");
        genericMethodsInGenericClassTwoParamsPetrolWater.genericMethodHalfGenArgs(new Petrol(5),new Water(5), "sfds567iuykjhgfer5tydfgnhmjgb");

        System.out.println("");







    }
}

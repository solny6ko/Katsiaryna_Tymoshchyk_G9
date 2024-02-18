package homework.day6;

import homework.day5.playground.essence.craft.air.Aircraft;
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


public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassT<String> genericMethodsInGenericClassTString = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTString.genericMethodOneGenArgT("Let's gooo!");
        genericMethodsInGenericClassTString.genericMethodTwoGenArgs("sdf", "dfgdf");
        genericMethodsInGenericClassTString.genericMethodHalfGenArgs("Let's gooo!", "Hello!");

        System.out.println("");

        GenericMethodsInGenericClassT<Integer> genericMethodsInGenericClassTInteger = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTInteger.genericMethodOneGenArgT(6);
        genericMethodsInGenericClassTInteger.genericMethodTwoGenArgs(6, 8);
        genericMethodsInGenericClassTInteger.genericMethodHalfGenArgs(6, "Hello!");

        System.out.println("");

        GenericMethodsInGenericClassT<Double> genericMethodsInGenericClassTDouble = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTDouble.genericMethodOneGenArgT(6.8);
        genericMethodsInGenericClassTDouble.genericMethodTwoGenArgs(6.0, 8.6);
        genericMethodsInGenericClassTDouble.genericMethodHalfGenArgs(6.5, "Hello!");

        System.out.println("");

        GenericMethodsInGenericClassT<Copter> genericMethodsInGenericClassTStringCopter = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringCopter.genericMethodOneGenArgT(new Copter(5,"name"));
        genericMethodsInGenericClassTStringCopter.genericMethodTwoGenArgs(new Copter(5,"name"), new Copter(5,"name"));
        genericMethodsInGenericClassTStringCopter.genericMethodHalfGenArgs(new Copter(5,"name"), "Hello!");

        System.out.println("");

        GenericMethodsInGenericClassT<Plane> genericMethodsInGenericClassTStringPlane = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringPlane.genericMethodOneGenArgT(new Plane(5,"name"));
        genericMethodsInGenericClassTStringPlane.genericMethodTwoGenArgs(new Plane(5,"name"), new Plane(5,"name"));
        genericMethodsInGenericClassTStringPlane.genericMethodHalfGenArgs(new Plane(5,"name"), "Hello!");

        System.out.println("");


        GenericMethodsInGenericClassT<Rocket> genericMethodsInGenericClassTStringRocket = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringRocket.genericMethodOneGenArgT(new Rocket(5,"name"));
        genericMethodsInGenericClassTStringRocket.genericMethodTwoGenArgs(new Rocket(5,"name"), new Rocket(5,"name"));
        genericMethodsInGenericClassTStringRocket.genericMethodHalfGenArgs(new Rocket(5,"name"), "Hello!");


        System.out.println("");


        GenericMethodsInGenericClassT<Car> genericMethodsInGenericClassTStringCar = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringCar.genericMethodOneGenArgT(new Car(5,"name"));
        genericMethodsInGenericClassTStringCar.genericMethodTwoGenArgs(new Car(5,"name"), new Car(5,"name"));
        genericMethodsInGenericClassTStringCar.genericMethodHalfGenArgs(new Car(5,"name"), "Hello!");


        System.out.println("");


        GenericMethodsInGenericClassT<Moped> genericMethodsInGenericClassTStringMoped = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringMoped.genericMethodOneGenArgT(new Moped(5,"name"));
        genericMethodsInGenericClassTStringMoped.genericMethodTwoGenArgs(new Moped(5,"name"), new Moped(5,"name"));
        genericMethodsInGenericClassTStringMoped.genericMethodHalfGenArgs(new Moped(5,"name"), "Hello!");


        System.out.println("");


        GenericMethodsInGenericClassT<Motorbike> genericMethodsInGenericClassTStringMotorbike = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringMotorbike.genericMethodOneGenArgT(new Motorbike(5,"name"));
        genericMethodsInGenericClassTStringMotorbike.genericMethodTwoGenArgs(new Motorbike(5,"name"), new Motorbike(5,"name"));
        genericMethodsInGenericClassTStringMotorbike.genericMethodHalfGenArgs(new Motorbike(5,"name"), "Hello!");


        System.out.println("");


        GenericMethodsInGenericClassT<Bottle> genericMethodsInGenericClassTStringBottle = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringBottle.genericMethodOneGenArgT(new Bottle(5, "sdgfb"));
        genericMethodsInGenericClassTStringBottle.genericMethodTwoGenArgs(new Bottle(5,"name"), new Bottle(5,"name"));
        genericMethodsInGenericClassTStringBottle.genericMethodHalfGenArgs(new Bottle(5,"name"), "Hello!");


        System.out.println("");


        GenericMethodsInGenericClassT<Can> genericMethodsInGenericClassTStringCan = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringCan.genericMethodOneGenArgT(new Can(5, "sdgfb"));
        genericMethodsInGenericClassTStringCan.genericMethodTwoGenArgs(new Can(5,"name"), new Can(5,"name"));
        genericMethodsInGenericClassTStringCan.genericMethodHalfGenArgs(new Can(5,"name"), "Hello!");


        System.out.println("");


        GenericMethodsInGenericClassT<Mug> genericMethodsInGenericClassTStringMug = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringMug.genericMethodOneGenArgT(new Mug(5, "sdgfb"));
        genericMethodsInGenericClassTStringMug.genericMethodTwoGenArgs(new Mug(5,"name"), new Mug(5,"name"));
        genericMethodsInGenericClassTStringMug.genericMethodHalfGenArgs(new Mug(5,"name"), "Hello!");


        System.out.println("");


        GenericMethodsInGenericClassT<Beetle> genericMethodsInGenericClassTStringBeetle = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringBeetle.genericMethodOneGenArgT(new Beetle(5, "sdgfb"));
        genericMethodsInGenericClassTStringBeetle.genericMethodTwoGenArgs(new Beetle(5,"name"), new Beetle(5,"name"));
        genericMethodsInGenericClassTStringBeetle.genericMethodHalfGenArgs(new Beetle(5,"name"), "Hello!");

        System.out.println("");


        GenericMethodsInGenericClassT<Carrot> genericMethodsInGenericClassTStringCarrot = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringCarrot.genericMethodOneGenArgT(new Carrot(5, "sdgfb"));
        genericMethodsInGenericClassTStringCarrot.genericMethodTwoGenArgs(new Carrot(5,"name"), new Carrot(5,"name"));
        genericMethodsInGenericClassTStringCarrot.genericMethodHalfGenArgs(new Carrot(5,"name"), "Hello!");


        System.out.println("");


        GenericMethodsInGenericClassT<Chamomile> genericMethodsInGenericClassTStringChamomile = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringChamomile.genericMethodOneGenArgT(new Chamomile(5, "sdgfb"));
        genericMethodsInGenericClassTStringChamomile.genericMethodTwoGenArgs(new Chamomile(5,"name"), new Chamomile(5,"name"));
        genericMethodsInGenericClassTStringChamomile.genericMethodHalfGenArgs(new Chamomile(5,"name"), "Hello!");

        System.out.println("");

        GenericMethodsInGenericClassT<Crocodile> genericMethodsInGenericClassTStringCrocodile = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringCrocodile.genericMethodOneGenArgT(new Crocodile(5, "sdgfb"));
        genericMethodsInGenericClassTStringCrocodile.genericMethodTwoGenArgs(new Crocodile(5,"name"), new Crocodile(5,"name"));
        genericMethodsInGenericClassTStringCrocodile.genericMethodHalfGenArgs(new Crocodile(5,"name"), "Hello!");

        System.out.println("");

        GenericMethodsInGenericClassT<Fly> genericMethodsInGenericClassTStringFly = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringFly.genericMethodOneGenArgT(new Fly(5, "sdgfb"));
        genericMethodsInGenericClassTStringFly.genericMethodTwoGenArgs(new Fly(5,"name"), new Fly(5,"name"));
        genericMethodsInGenericClassTStringFly.genericMethodHalfGenArgs(new Fly(5,"name"), "Hello!");


        System.out.println("");


        GenericMethodsInGenericClassT<Maylily> genericMethodsInGenericClassTStringMaylily = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringMaylily.genericMethodOneGenArgT(new Maylily(5, "sdgfb"));
        genericMethodsInGenericClassTStringMaylily.genericMethodTwoGenArgs(new Maylily(5,"name"), new Maylily(5,"name"));
        genericMethodsInGenericClassTStringMaylily.genericMethodHalfGenArgs(new Maylily(5,"name"), "Hello!");


        System.out.println("");


        GenericMethodsInGenericClassT<Mosquito> genericMethodsInGenericClassTStringMosquito = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringMosquito.genericMethodOneGenArgT(new Mosquito(5, "sdgfb"));
        genericMethodsInGenericClassTStringMosquito.genericMethodTwoGenArgs(new Mosquito(5,"name"), new Mosquito(5,"name"));
        genericMethodsInGenericClassTStringMosquito.genericMethodHalfGenArgs(new Mosquito(5,"name"), "Hello!");


        System.out.println("");


        GenericMethodsInGenericClassT<Pigeon> genericMethodsInGenericClassTStringPigeon = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringPigeon.genericMethodOneGenArgT(new Pigeon(5, "sdgfb"));
        genericMethodsInGenericClassTStringPigeon.genericMethodTwoGenArgs(new Pigeon(5,"name"), new Pigeon(5,"name"));
        genericMethodsInGenericClassTStringPigeon.genericMethodHalfGenArgs(new Pigeon(5,"name"), "Hello!");


        System.out.println("");


        GenericMethodsInGenericClassT<Potato> genericMethodsInGenericClassTStringPotato = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringPotato.genericMethodOneGenArgT(new Potato(5, "sdgfb"));
        genericMethodsInGenericClassTStringPotato.genericMethodTwoGenArgs(new Potato(5,"name"), new Potato(5,"name"));
        genericMethodsInGenericClassTStringPotato.genericMethodHalfGenArgs(new Potato(5,"name"), "Hello!");


        System.out.println("");


        GenericMethodsInGenericClassT<Radish> genericMethodsInGenericClassTStringRadish = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringRadish.genericMethodOneGenArgT(new Radish(5, "sdgfb"));
        genericMethodsInGenericClassTStringRadish.genericMethodTwoGenArgs(new Radish(5,"name"), new Radish(5,"name"));
        genericMethodsInGenericClassTStringRadish.genericMethodHalfGenArgs(new Radish(5,"name"), "Hello!");


        System.out.println("");


        GenericMethodsInGenericClassT<Raven> genericMethodsInGenericClassTStringRaven = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringRaven.genericMethodOneGenArgT(new Raven(5, "sdgfb"));
        genericMethodsInGenericClassTStringRaven.genericMethodTwoGenArgs(new Raven(5,"name"), new Raven(5,"name"));
        genericMethodsInGenericClassTStringRaven.genericMethodHalfGenArgs(new Raven(5,"name"), "Hello!");


        System.out.println("");


        GenericMethodsInGenericClassT<Rose> genericMethodsInGenericClassTStringRose = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringRose.genericMethodOneGenArgT(new Rose(5, "sdgfb"));
        genericMethodsInGenericClassTStringRose.genericMethodTwoGenArgs(new Rose(5,"name"), new Rose(5,"name"));
        genericMethodsInGenericClassTStringRose.genericMethodHalfGenArgs(new Rose(5,"name"), "Hello!");


        System.out.println("");


        GenericMethodsInGenericClassT<Diesel> genericMethodsInGenericClassTStringDiesel = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringDiesel.genericMethodOneGenArgT(new Diesel(5));
        genericMethodsInGenericClassTStringDiesel.genericMethodTwoGenArgs(new Diesel(5), new Diesel(5));
        genericMethodsInGenericClassTStringDiesel.genericMethodHalfGenArgs(new Diesel(5), "Hello!");


        System.out.println("");


        GenericMethodsInGenericClassT<Petrol> genericMethodsInGenericClassTStringPetrol = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringPetrol.genericMethodOneGenArgT(new Petrol(5));
        genericMethodsInGenericClassTStringPetrol.genericMethodTwoGenArgs(new Petrol(5), new Petrol(5));
        genericMethodsInGenericClassTStringPetrol.genericMethodHalfGenArgs(new Petrol(5), "Hello!");


        System.out.println("");


        GenericMethodsInGenericClassT<Water> genericMethodsInGenericClassTStringWater = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassTStringWater.genericMethodOneGenArgT(new Water(5));
        genericMethodsInGenericClassTStringWater.genericMethodTwoGenArgs(new Water(5), new Water(5));
        genericMethodsInGenericClassTStringWater.genericMethodHalfGenArgs(new Water(5), "Hello!");
















    }

}

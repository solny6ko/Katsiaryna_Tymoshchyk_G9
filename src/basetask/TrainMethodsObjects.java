package basetask;


public class TrainMethodsObjects {

    public static void processMouse(Mouse mouseObject) {
        System.out.println(mouseObject.getName());
        System.out.println(mouseObject.getAge());
        mouseObject.printMouseDetails();
    }

    public static void processSouce(Souce souceObject) {
        System.out.println(souceObject.getName());
        System.out.println(souceObject.getColor());
        souceObject.printSouceDetails();
    }

    public static void processBee(Bee beeObject) {
        System.out.println(beeObject.getGender());
        System.out.println(beeObject.getWeight());
        beeObject.printBeeDetails();
    }

    public static void processObstacle(Obstacle obstacleObject) {
        System.out.println(obstacleObject.getDescription());
        System.out.println(obstacleObject.getSeverity());
        obstacleObject.printObstacleDetails();
    }

    public static void processPineapple(Pineapple pineappleObject) {
        System.out.println(pineappleObject.getGrade());
        System.out.println(pineappleObject.getHeatCapacity());
        pineappleObject.printPineappleDetails();
    }
}



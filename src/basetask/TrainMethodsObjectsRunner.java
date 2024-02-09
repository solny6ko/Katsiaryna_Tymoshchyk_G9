package basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {

        TrainMethodsObjects TrainMethodsObjects = new TrainMethodsObjects();

        Mouse MouseMikkie = new Mouse("Mikkie", 10);
        TrainMethodsObjects.processMouse(MouseMikkie);

        Souce SouceOne = new Souce("Грибной", "зеленый");
        TrainMethodsObjects.processSouce(SouceOne);

        Bee BeeOne = new Bee("kobieta", 10L);
        TrainMethodsObjects.processBee(BeeOne);

        Obstacle ObstacleOne = new Obstacle("eiffpjmdam", "critical");
        TrainMethodsObjects.processObstacle(ObstacleOne);

        Pineapple PineappleOne = new Pineapple("eiffpjmdam", 54.7f);
        TrainMethodsObjects.processPineapple(PineappleOne);

    }


}

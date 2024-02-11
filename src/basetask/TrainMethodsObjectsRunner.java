package basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {

        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();

        Mouse mouseMikkie = new Mouse("Mikkie", 10);
        trainMethodsObjects.processMouse(mouseMikkie);

        Souce souceOne = new Souce("Грибной", "зеленый");
        trainMethodsObjects.processSouce(souceOne);

        Bee beeOne = new Bee("kobieta", 10L);
        trainMethodsObjects.processBee(beeOne);

        Obstacle obstacleOne = new Obstacle("eiffpjmdam", "critical");
        trainMethodsObjects.processObstacle(obstacleOne);

        Pineapple pineappleOne = new Pineapple("eiffpjmdam", 54.7f);
        trainMethodsObjects.processPineapple(pineappleOne);

    }


}

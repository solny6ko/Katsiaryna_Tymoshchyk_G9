package BubbleTask;

public class Bottle {
   private double bottleVolume;
   private SparklingWater sparklingWater;

   public Bottle(double bottleVolume){
      this.bottleVolume = bottleVolume;
      this.sparklingWater = new SparklingWater(bottleVolume);
//      sparklingWater.pump();
      System.out.println("Bottle is created " + bottleVolume);
   }

//   SparklingWater sparklingWater = new SparklingWater(bottleVolume);



      public void open() {
         System.out.println("Bottle is opened");
         sparklingWater.degas();

      }


   }
package homework.day5.playground.runners;

import homework.day5.playground.essence.creatures.*;
import homework.day5.playground.processors.CrawlableProcessor;

public class CrawlableProcessorRunner {
    public static void main(String[] args) {
        CrawlableProcessor crawlableProcessor = new CrawlableProcessor();
        Crawlable crawlableCrocodile = new Crocodile(1723, "Neel Crawlable");
        crawlableProcessor.runCrawlable(crawlableCrocodile);
        System.out.println("");

        Crawlable crawlableBeetle = new Beetle(43, "Christmas Crawlable");
        crawlableProcessor.runCrawlable(crawlableBeetle);
        System.out.println("");

//        Vertebrata vertebrataCrocodile = new Crocodile(1723, "Neel Vertebrata");   - Vertebrata is an abstract class not related to Crawlable
//        crawlableProcessor.runCrawlable(vertebrataCrocodile);

//        Insect insectBeetle = new Beetle(43, "Christmas Insect");
//        crawlableProcessor.runCrawlable(insectBeetle);

        Crocodile aCrocodile = new Crocodile(1723, "Neel Crocodile");
        crawlableProcessor.runCrawlable(aCrocodile);
        System.out.println("");

        Beetle aBeetle = new Beetle(43, "Christmas Beetle");
        crawlableProcessor.runCrawlable(aBeetle);
        System.out.println("");

        Crawlable anonymousCrawlable = new Crawlable() {
            String name = "Anonymous";
            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        };
        crawlableProcessor.runCrawlable(anonymousCrawlable);
        System.out.println("");

        Crocodile bCrocodile = new Crocodile(1723, "Neel B Crocodile");
        crawlableProcessor.runCrawlable(bCrocodile, "NOWHERE");
        System.out.println("");

        Beetle bBeetle = new Beetle(43, "Christmas BBBBBBeetle");
        crawlableProcessor.runCrawlable(bBeetle, "LEFT");
        System.out.println("");

        Beetle cBeetle = new Beetle(43, "Christmas Befeeeeeteetle");
        crawlableProcessor.runCrawlable(cBeetle, "BACK", 98);
        System.out.println("");


        Crawlable banonymousCrawlable = new Crawlable() {
            String name = "BAnonymous";
            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        };
        crawlableProcessor.runCrawlable(banonymousCrawlable, "DOWN", 100);
        System.out.println("");


    }
}

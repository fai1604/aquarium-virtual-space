package org.aquarium;

import java.util.Random;

public class BaseFishes extends Entity {
    private static final int FISH_TYPE_COUNT = 5;

    public BaseFishes() {
        try {
            Random random = new Random();
        
            switch(random.nextInt(FISH_TYPE_COUNT)) {
                case 0:
                    this.name = "arapaima";
                    this.appearance = new Appearance(App.class.getResource("images/arapaima.png").toExternalForm());
                    break;
                case 1:
                    this.name = "mackerel";
                    this.appearance = new Appearance(App.class.getResource("images/mackerel.png").toExternalForm());
                    break;
                case 2:
                    this.name = "sardine";
                    this.appearance = new Appearance(App.class.getResource("images/sardine.png").toExternalForm());
                    break;
                case 3:
                    this.name = "tilapia";
                    this.appearance = new Appearance(App.class.getResource("images/tilapia.png").toExternalForm());
                    break;
                case 4:
                    this.name = "toman";
                    this.appearance = new Appearance(App.class.getResource("images/toman.png").toExternalForm());
                    break;
                default:
                    throw new Exception();
            }

            this.location = new Location(10, 10);
        } 
        catch (Exception e) {
            System.out.println("An exception occurred when generating fishes");
        }
    }
}
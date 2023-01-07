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
                    this.appearance = new Appearance("src\\main\\resources\\org\\aquarium\\images\\arapaima.png");
                    break;
                case 1:
                    this.name = "mackerel";
                    this.appearance = new Appearance("src\\main\\resources\\org\\aquarium\\images\\mackerel.png");
                    break;
                case 2:
                    this.name = "sardine";
                    this.appearance = new Appearance("src\\main\\resources\\org\\aquarium\\images\\sardine.png");
                    break;
                case 3:
                    this.name = "tilapia";
                    this.appearance = new Appearance("src\\main\\resources\\org\\aquarium\\images\\tilapia.png");
                    break;
                case 4:
                    this.name = "toman";
                    this.appearance = new Appearance("src\\main\\resources\\org\\aquarium\\images\\toman.png");
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
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
                    this.assetPath = App.class.getResource("images/arapaimas.png").toExternalForm();
                    break;
                case 1:
                    this.name = "mackerel";
                    this.assetPath = App.class.getResource("images/mackerels.png").toExternalForm();
                    break;
                case 2:
                    this.name = "sardine";
                    this.assetPath = App.class.getResource("images/sardines.png").toExternalForm();
                    break;
                case 3:
                    this.name = "tilapia";
                    this.assetPath = App.class.getResource("images/tilapias.png").toExternalForm();
                    break;
                case 4:
                    this.name = "toman";
                    this.assetPath = App.class.getResource("images/tomans.png").toExternalForm();
                    break;
                default:
                    throw new Exception();
            }
        } 
        catch (Exception e) {
            System.out.println("An exception occurred when generating fishes");
        }
    }
}
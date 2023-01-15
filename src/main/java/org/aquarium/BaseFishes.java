package org.aquarium;

import java.util.Random;

public class BaseFishes extends Entity {
    private static final int FISH_TYPE_COUNT = 5;
    public AquariumSpace aquarium;
    public Space space;

    public BaseFishes(AquariumSpace aquarium, Space space) {
        this.aquarium = aquarium;
        this.space = space;

        try {
            Random random = new Random();
            // int i = 0;
            // random.nextInt(FISH_TYPE_COUNT)
            switch(random.nextInt(FISH_TYPE_COUNT)) {
                case 0:
                    this.name = "arapaima";
                    this.assetPath = App.class.getResource("images/arapaimas.png").toExternalForm();
                    Badge arapaimaBadge = ArapaimaBadge.getInstance(aquarium);
                    if(arapaimaBadge != null){
                        arapaimaBadge.printBadgeWithDescription();
                    }
                    space.getBadgeList().get(0).setVisible(true);
                    break;
                case 1:
                    this.name = "mackerel";
                    this.assetPath = App.class.getResource("images/mackerels.png").toExternalForm();
                    Badge mackerelBadge = MackerelBadge.getInstance(aquarium);
                    if(mackerelBadge != null){
                        mackerelBadge.printBadgeWithDescription();
                    }
                    space.getBadgeList().get(1).setVisible(true);
                    break;
                case 2:
                    this.name = "sardine";
                    this.assetPath = App.class.getResource("images/sardines.png").toExternalForm();
                    Badge sardinBadge = SardinBadge.getInstance(aquarium);
                    if(sardinBadge != null){
                        sardinBadge.printBadgeWithDescription();
                    }
                    space.getBadgeList().get(2).setVisible(true);
                    break;
                case 3:
                    this.name = "tilapia";
                    this.assetPath = App.class.getResource("images/tilapias.png").toExternalForm();
                    Badge tilapiaBadge = TilapiaBadge.getInstance(aquarium);
                    if(tilapiaBadge != null){
                        tilapiaBadge.printBadgeWithDescription();
                    }
                    space.getBadgeList().get(3).setVisible(true);
                    break;
                case 4:
                    this.name = "toman";
                    this.assetPath = App.class.getResource("images/tomans.png").toExternalForm();
                    Badge tomanBadge = TomanBadge.getInstance(aquarium);
                    if(tomanBadge != null){
                        tomanBadge.printBadgeWithDescription();
                    }
                    space.getBadgeList().get(4).setVisible(true);
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
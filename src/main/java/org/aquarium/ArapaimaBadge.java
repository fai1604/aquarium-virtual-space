package org.aquarium;

import javafx.scene.image.Image;

public class ArapaimaBadge extends Badge{

    private static ArapaimaBadge uniqueArapaimaBadge;

    private ArapaimaBadge() {
        
    }

    public static ArapaimaBadge getInstance(){
        if (uniqueArapaimaBadge == null) {
			System.out.println("Creating unique instance of a badge");
			uniqueArapaimaBadge = new ArapaimaBadge();
            return uniqueArapaimaBadge;
		}
        else{
            return null;
        }
		
    }

    @Override
    public void printBadgeWithDescription() {
        // super.setImage(new Image(App.class.getResourceAsStream("/org/aquarium/images/Arapaima-Badge.png")));
        this.badgeName = "arapaima";
        this.badgeAssetPath = App.class.getResource("images/Arapaima-Badge.png").toExternalForm();
    }
    
}

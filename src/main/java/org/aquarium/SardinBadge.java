package org.aquarium;

import javafx.scene.image.Image;

public class SardinBadge extends Badge{

    private static SardinBadge uniqueSardinBadge;
    
    private SardinBadge() {
        printBadgeWithDescription();
    }

    public static SardinBadge getInstance(){
        if (uniqueSardinBadge == null) {
			System.out.println("Creating unique instance of a badge");
			uniqueSardinBadge = new SardinBadge();
		}
		return uniqueSardinBadge;
    }

    @Override
    public void printBadgeWithDescription() {
        super.setImage(new Image(App.class.getResourceAsStream("/org/aquarium/images/Sardine-Badge.png")));
    }
    
}

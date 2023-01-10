package org.aquarium;

import javafx.scene.image.Image;

public class MackerelBadge extends Badge{

    private static MackerelBadge uniqueMackerelBadge;
    
    private MackerelBadge() {
        printBadgeWithDescription();
    }

    public static MackerelBadge getInstance(){
        if (uniqueMackerelBadge == null) {
			System.out.println("Creating unique instance of a badge");
			uniqueMackerelBadge = new MackerelBadge();
		}
		return uniqueMackerelBadge;
    }

    @Override
    public void printBadgeWithDescription() {
        super.setImage(new Image(App.class.getResourceAsStream("/org/aquarium/images/Mackerel-Badge.png")));
    }
    
}

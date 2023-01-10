package org.aquarium;

import javafx.scene.image.Image;

public class TilapiaBadge extends Badge{

    private static TilapiaBadge uniqueTilapiaBadge;
    
    private TilapiaBadge() {
        printBadgeWithDescription();
    }

    public static TilapiaBadge getInstance(){
        if (uniqueTilapiaBadge == null) {
			System.out.println("Creating unique instance of a badge");
			uniqueTilapiaBadge = new TilapiaBadge();
		}
		return uniqueTilapiaBadge;
    }

    @Override
    public void printBadgeWithDescription() {
        super.setImage(new Image(App.class.getResourceAsStream("/org/aquarium/images/Tilapia-Badge.png")));
    }
    
}

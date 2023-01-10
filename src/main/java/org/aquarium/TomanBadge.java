package org.aquarium;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TomanBadge extends Badge {

    private static TomanBadge uniqueTomanBadge;
    
    private TomanBadge() {
        printBadgeWithDescription();
    }

    public static TomanBadge getInstance(){
        if (uniqueTomanBadge == null) {
			System.out.println("Creating unique instance of a badge");
			uniqueTomanBadge = new TomanBadge();
            return uniqueTomanBadge;
		}
        else{
            return null;
        }
		
    }

    @Override
    public void printBadgeWithDescription() {
        super.setImage(new Image(App.class.getResourceAsStream("/org/aquarium/images/Toman-Badge.png")));
    }
    
}

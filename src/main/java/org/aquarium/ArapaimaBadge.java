package org.aquarium;

import javafx.scene.image.Image;

public class ArapaimaBadge extends Badge{

    public ArapaimaBadge() {
        printBadgeWithDescription();
    }

    @Override
    public void printBadgeWithDescription() {
        super.setImage(new Image(App.class.getResourceAsStream("/org/aquarium/images/Arapaima-Badge.png")));
    }
    
}

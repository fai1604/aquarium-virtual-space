package org.aquarium;

import javafx.scene.image.Image;

public class TilapiaBadge extends Badge{

    public TilapiaBadge() {
        printBadgeWithDescription();
    }

    @Override
    public void printBadgeWithDescription() {
        super.setImage(new Image(App.class.getResourceAsStream("/org/aquarium/images/Tilapia-Badge.png")));
    }
    
}

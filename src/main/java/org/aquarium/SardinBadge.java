package org.aquarium;

import javafx.scene.image.Image;

public class SardinBadge extends Badge{

    public SardinBadge() {
        printBadgeWithDescription();
    }

    @Override
    public void printBadgeWithDescription() {
        super.setImage(new Image(App.class.getResourceAsStream("/org/aquarium/images/Sardine-Badge.png")));
    }
    
}

package org.aquarium;

import javafx.scene.image.Image;

public class TongkolBadge extends Badge{

    public TongkolBadge() {
        printBadgeWithDescription();
    }

    @Override
    public void printBadgeWithDescription() {
        super.setImage(new Image(App.class.getResourceAsStream("/org/aquarium/images/Mackerel-Badge.png")));
    }
    
}

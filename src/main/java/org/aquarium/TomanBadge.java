package org.aquarium;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TomanBadge extends Badge {

    // public void printBadgeWithDescription() {
    //     // TODO Auto-generated method stub
    //     List<Image> images = new ArrayList<Image>();
    //     Image toman = new Image(App.class.getResource("images/toman.png").toExternalForm());
    // }
    
    public TomanBadge() {
        printBadgeWithDescription();
    }

    @Override
    public void printBadgeWithDescription() {
        super.setImage(new Image(App.class.getResourceAsStream("/org/aquarium/images/Toman-Badge.png")));
    }
    
}

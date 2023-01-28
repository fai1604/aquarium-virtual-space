package org.aquarium;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Popup;

public class TomanBadge extends Badge {

    private static TomanBadge uniqueTomanBadge;

    private TomanBadge(AquariumSpace aquarium) {
        this.aquarium = aquarium;
    }

    public static TomanBadge getInstance(AquariumSpace aquarium){
        if (uniqueTomanBadge == null) {
			System.out.println("Creating unique instance of a badge");
			uniqueTomanBadge = new TomanBadge(aquarium);
            return uniqueTomanBadge;
		}
        else{
            return null;
        }
		
    }

    @Override
    public void printBadgeWithDescription() {
        Image badge = new Image(App.class.getResourceAsStream("/org/aquarium/images/Toman-Badge.png"));
        ImageView badgeView = new ImageView(badge);
        Popup popup = new Popup();
        Label plabel = new Label();
        Button close = new Button();

        plabel.setMinHeight(350);
        plabel.setMinWidth(650);
        plabel.setStyle("-fx-background-color: #808080; -fx-font-size:25");

        close.setText("Close");
        close.setOnAction(e -> {
            popup.hide();
        });

        popup.getContent().add(plabel);
        popup.getContent().add(close);
        popup.getContent().add(badgeView);
        System.out.println(aquarium.getStage());
        popup.show(aquarium.getStage());
    }
    
}

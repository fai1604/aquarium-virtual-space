package org.aquarium;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Popup;

public class ArapaimaBadge extends Badge{

    private static ArapaimaBadge uniqueArapaimaBadge;
    AquariumSpace aquarium;

    private ArapaimaBadge(AquariumSpace aquarium) {
        this.aquarium = aquarium;
    }

    public static ArapaimaBadge getInstance(AquariumSpace aquarium){
        if (uniqueArapaimaBadge == null) {
			System.out.println("Creating unique instance of a badge");
			uniqueArapaimaBadge = new ArapaimaBadge(aquarium);
            return uniqueArapaimaBadge;
		}
        else{
            return null;
        }
		
    }

    @Override
    public void printBadgeWithDescription() {
        // super.setImage(new Image(App.class.getResourceAsStream("/org/aquarium/images/Arapaima-Badge.png")));
        // this.badgeName = "arapaima";
        // this.badgeAssetPath = App.class.getResource("images/Arapaima-Badge.png").toExternalForm();
        Popup popup = new Popup();
        Label plabel = new Label();
        plabel.setText("Test Arapaima");
        plabel.setMinHeight(160);
        plabel.setMinWidth(300);
        plabel.setStyle("-fx-background-color: #0000FF; -fx-font-size:25");
        popup.getContent().add(plabel);
        popup.getContent().add(new Button("test"));
        System.out.println(aquarium.getStage());
        popup.show(aquarium.getStage());
        // long mTime = System.currentTimeMillis();
        // long end = mTime + 10000; // 5 seconds 
        // while (mTime < end) 
        // {
        //     mTime = System.currentTimeMillis();
        //     if(mTime == end){
        //         popup.hide();
        //     }
        // } 
    }
    
}

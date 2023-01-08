package org.aquarium;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;

public class Space extends StackPane {

    public Space() {
        initializeBackground(); 
        initializeElements(); 
    }

    public void initializeBackground() {
        Image image = new Image(App.class.getResourceAsStream("/org/aquarium/images/background-2.jpeg"));
        // Image image = new Image(App.class.getResource("sardine.png").toExternalForm());
        // Image image = new Image("https://thumbs.dreamstime.com/b/underwater-aquarium-scene-5421127.jpg");
        BackgroundImage bgImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1.0, 1.0, true, true, false, false));
        this.setBackground(new Background(bgImage));
    }

    public void initializeElements() {
        Badge toman = new TomanBadge();
        // ImageView toman = new ImageView();
        // toman.setImage(new Image(App.class.getResourceAsStream("/org/aquarium/images/toman.png")));
        this.getChildren().add(toman);
    }
    
}

package org.aquarium;

import java.io.FileInputStream;
import java.io.InputStream;

import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;

public class Space extends StackPane {

    public Space() {
        initializeBackground();    
    }

    public void initializeBackground() {
        Image image = new Image(App.class.getResource("images/background.webp").toExternalForm());
        // Image image = new Image("https://thumbs.dreamstime.com/b/underwater-aquarium-scene-5421127.jpg");
        BackgroundImage bgImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        super.setBackground(new Background(bgImage));
    }
    
}

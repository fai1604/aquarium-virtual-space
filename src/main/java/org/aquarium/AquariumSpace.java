package org.aquarium;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;

public class AquariumSpace {
    public Stage stage;

    public AquariumSpace(Stage stage) {
        this.stage = stage;
    }

    public void startAquarium() {
        BorderPane root = new BorderPane();
        Controls controls = new Controls();
        Space space = new Space();
        root.setTop(space);
        root.setBottom(controls);

        // set to full screen at start
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        stage.setFullScreen(true);
        stage.setHeight(screenBounds.getHeight());
        stage.setWidth(screenBounds.getWidth());

        Scene scene = new Scene(root, stage.getWidth(), stage.getHeight());
        //set application icon
        Image image = new Image(getClass().getResourceAsStream("/org/aquarium/images/NeonFish.png"));
        ImageView imageView = new ImageView();
        stage.getIcons().add(image);

        stage.setTitle("Aquarium Space");

        stage.setResizable(true);
        stage.setScene(scene);
        stage.show();
    }

}
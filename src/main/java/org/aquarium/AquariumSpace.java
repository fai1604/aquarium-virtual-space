package org.aquarium;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
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
        // ImageView test = new ImageView();
        // test.setImage(new Image(App.class.getResourceAsStream("/org/aquarium/images/toman.png")));
        // space.getChildren().add(test);
        root.setTop(space);
        root.setBottom(controls);
        Scene scene = new Scene(root, 700, 480);
        stage.setTitle("Aquarium Space");
        // stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

}
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
        Space space = new Space();
        Controls controls = new Controls();

        root.setTop(space);
        root.setBottom(controls);

        Scene scene = new Scene(root, 1300, 900);
        
        stage.setTitle("Aquarium Space");
        stage.setScene(scene);
        stage.show();
    }
}
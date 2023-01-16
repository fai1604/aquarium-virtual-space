package org.aquarium;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.TilePane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;

public class Controls extends TilePane {
    public Button[] controlButtons = new Button[10];
    public String[] buttonNames = {"Generate Fishes", "Add Seahorse", "Add Seaweed", 
        "Add Crab", "Add Wrecked Ship", "Add Bubbles", 
        "Play BG Music", "Switch On Lights", "See Badges", 
        "Exit"};

    public Controls() {
        initializeButtons();
    }



    public void initializeButtons() {
        // TilePane tilePane = new TilePane();
        for (int i = 0; i < controlButtons.length; i++) {
            controlButtons[i] = new Button(buttonNames[i]);
            controlButtons[i].setMinSize(120, 20);
            controlButtons[i].setPadding(new Insets(10));

            // controlButtons[i].setOnAction(event);

            this.getChildren().add(controlButtons[i]);
            this.setAlignment(Pos.CENTER);
        }

        this.setBackground(new Background(new BackgroundFill(Color.web("#C2C5CC"), CornerRadii.EMPTY, Insets.EMPTY)));
        this.setPadding(new Insets(10));
        this.setHgap(10);
        this.setVgap(20);
    }

    
}

package org.aquarium;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;

public class Controls extends TilePane {
    public Button[] controlButtons = new Button[10];
    public String[] buttonNames = {"Generate Fishes", "Add Seahorse", "Add Seaweed", 
        "Add Crab", "Add Wrecked Ship", "Add Bubbles", 
        "Play BG Music", "Switch On Lights", "See Badges", 
        "Exit"};
    public Space space;

    public Controls(Space space) {
        this.space = space;
        initializeButtons();
    }

    public void initializeButtons() {
        // TilePane tilePane = new TilePane();
        // for (int i = 0; i < controlButtons.length; i++) {
        //     controlButtons[i] = new Button(buttonNames[i]);
        //     controlButtons[i].setMinSize(120, 20);
        //     controlButtons[i].setPadding(new Insets(10));
        //     this.getChildren().add(controlButtons[i]);
        //     this.setAlignment(Pos.CENTER);
        // }
        Button fishBtn = new Button("Generate Fishes");
        fishBtn.setMinSize(120, 20);
        fishBtn.setPadding(new Insets(10));
        fishBtn.setOnAction(e -> {
            space.addFishes();
        });

        this.setBackground(new Background(new BackgroundFill(Color.web("#C2C5CC"), CornerRadii.EMPTY, Insets.EMPTY)));
        this.setPadding(new Insets(10));
        this.setHgap(10);
        this.setVgap(20);
        this.getChildren().add(fishBtn);
    }
}

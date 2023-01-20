package org.aquarium;

import java.util.Stack;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.stage.Popup;

public class Controls extends TilePane {
    public Button[] entityButtons = new Button[5];
    public String[] entityButtonNames = { "Bubbles", "Wrecked Ship", "Crab", "Seahorse", "Seaweed" };
    public Space space;
    private Stack<Button> stackBtn = new Stack<>();
    private Stack<Integer> stackInt = new Stack<>();
    private Stack<String> stackStr = new Stack<>();

    public Controls(Space space) {
        this.space = space;
        initializeButtons();
    }

    public void initializeButtons() {

        Button fishBtn = new Button("Generate Fishes");
        fishBtn.setMinSize(120, 20);
        fishBtn.setPadding(new Insets(10));
        fishBtn.setOnAction(e -> {
            space.toggleFishes(fishBtn);
        });
        this.getChildren().add(fishBtn);

        for (int i = 0; i < entityButtonNames.length; i++) {
            final Integer innerIndex = i;
            entityButtons[innerIndex] = new Button("Add " + entityButtonNames[innerIndex]);
            entityButtons[innerIndex].setMinSize(120, 20);
            entityButtons[innerIndex].setPadding(new Insets(10));
            entityButtons[innerIndex].setOnAction(e -> {
                toggleEntityVisibility(entityButtons[innerIndex], innerIndex, entityButtonNames[innerIndex]);
            });
            this.getChildren().add(entityButtons[innerIndex]);
            this.setAlignment(Pos.CENTER);
        }

        // Stack<ToggleEntityVisibilityCommand> stack = new Stack<>();
        // for (int i = 0; i < entityButtonNames.length; i++) {
        //     final Integer innerIndex = i;
        //     entityButtons[innerIndex] = new Button("Add " + entityButtonNames[innerIndex]);
        //     entityButtons[innerIndex].setMinSize(120, 20);
        //     entityButtons[innerIndex].setPadding(new Insets(10));
        //     entityButtons[innerIndex].setOnAction(e -> {
        //         ToggleEntityVisibilityCommand cmd = new ToggleEntityVisibilityCommand(stack, entityButtons[innerIndex], innerIndex, entityButtonNames[innerIndex]);
        //         cmd.execute();
        //     });
        //     this.getChildren().add(entityButtons[innerIndex]);
        //     this.setAlignment(Pos.CENTER);
        // }

        Button badgeBtn = new Button("See Badges");
        badgeBtn.setMinSize(120, 20);
        badgeBtn.setPadding(new Insets(10));
        badgeBtn.setOnAction(e -> {
            toggleBadgeListVisibility(badgeBtn);
        });
        this.getChildren().add(badgeBtn);

        Button musicBtn = new Button("Play BG Music");
        musicBtn.setMinSize(120, 20);
        musicBtn.setPadding(new Insets(10));
        musicBtn.setOnAction(e -> {
            toggleMusic(musicBtn);
        });
        this.getChildren().add(musicBtn);

        Button lightsBtn = new Button("Toggle Lights");
        lightsBtn.setMinSize(120, 20);
        lightsBtn.setPadding(new Insets(10));
        // musicBtn.setOnAction(e -> {
        // });
        this.getChildren().add(lightsBtn);

        Button undoBtn = new Button("Undo");
        undoBtn.setMinSize(120, 20);
        undoBtn.setPadding(new Insets(10));
        undoBtn.setOnAction(e -> {
            UndotoggleEntityVisibility();
        });
        this.getChildren().add(undoBtn);

        Button exitBtn = new Button("Exit");
        exitBtn.setMinSize(120, 20);
        exitBtn.setPadding(new Insets(10));
        // exitBtn.setOnAction(e -> {
        // });
        this.getChildren().add(exitBtn);

        this.setBackground(new Background(new BackgroundFill(Color.web("#C2C5CC"), CornerRadii.EMPTY, Insets.EMPTY)));
        this.setPadding(new Insets(10));
        this.setHgap(10);
        this.setVgap(20);
    }

    public void toggleEntityVisibility(Button button, int index, String entityName) {
        stackBtn.push(button);
        stackInt.push(index);
        stackStr.push(entityName);
        boolean visibility = space.toggleEntity(index);
        if (!visibility) {
            button.setText("Add " + entityName);
        } else {
            button.setText("Remove " + entityName);
        }
    }
    
    public void UndotoggleEntityVisibility() {
        if (!stackBtn.isEmpty()){
            
            Button button = stackBtn.pop();
            Integer index = stackInt.pop();
            String entityName = stackStr.pop();

            // String next;
            // while (!stackBtn.empty()) {
            //     next = stackStr.peek();
            //     if (entityName.equals(next)) {
            //         stackBtn.remove(stackBtn.size()-1);
            //         stackInt.remove(stackInt.size()-1);
            //         stackStr.remove(stackStr.size()-1);
            //     }
            // }
            boolean visibility = space.toggleEntity(index);
            if (!visibility) {
                button.setText("Add " + entityName);
            } else {
                button.setText("Remove " + entityName);
            }
        }
    }

    public void toggleBadgeListVisibility(Button button) {
        boolean visibility = space.toggleBadgeListPopup();
        if (!visibility) {
            button.setText("See Badges List");
        } else {
            button.setText("Hide Badges List");
        }
    }

    public void toggleMusic(Button button) {
        boolean playing = space.toggleMusic();
        if (!playing) {
            button.setText("Stop Music");
        } else {
            button.setText("Play Music");
        }
    }
}

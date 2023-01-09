package org.aquarium;

import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;

public class Space extends StackPane {
    private ArrayList<EntityImageViewAdapter> entities = new ArrayList<EntityImageViewAdapter>();

    public Space() {
        this.initializeBackground();
        this.initializeEntities();
    }

    public void initializeBackground() {
        Image image = new Image(App.class.getResource("images/background.png").toExternalForm());
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1.0, 1.0, true, true, false, false));
        this.setBackground(new Background(backgroundImage));
    }

    public void initializeEntities() {
        this.initializeEntities(new BaseEntityFactory());
    }

    public void initializeEntities(EntityFactory entityFactory) {
        this.entities.add(new EntityImageViewAdapter(entityFactory.createFishesEntity()));
        this.entities.add(new EntityImageViewAdapter(entityFactory.createCrabEntity()));
        this.entities.add(new EntityImageViewAdapter(entityFactory.createSeahorseEntity()));
        this.entities.add(new EntityImageViewAdapter(entityFactory.createSeaweedsEntity()));
        this.entities.add(new EntityImageViewAdapter(entityFactory.createWreckedShipEntity()));
        this.entities.add(new EntityImageViewAdapter(entityFactory.createBubblesEntity()));

        this.getChildren().addAll(entities);
    }
}
package org.aquarium;

import java.util.ArrayList;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.stage.Popup;

public class Space extends StackPane {
    private ArrayList<EntityImageViewAdapter> entities = new ArrayList<EntityImageViewAdapter>();
    private ArrayList<Badge> badges = new ArrayList<Badge>();
    public AquariumSpace aquarium;

    public Space(AquariumSpace aquarium) {
        this.aquarium = aquarium;
        // this.initializeBackground();
        // this.initializeEntities();
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
        // this.entities.add(new EntityImageViewAdapter(entityFactory.createFishesEntity(aquarium)));
        // this.entities.add(new EntityImageViewAdapter(entityFactory.createBubblesEntity()));
        // this.entities.add(new EntityImageViewAdapter(entityFactory.createWreckedShipEntity()));
        // this.entities.add(new EntityImageViewAdapter(entityFactory.createCrabsEntity()));
        // this.entities.add(new EntityImageViewAdapter(entityFactory.createSeahorsesEntity()));
        // this.entities.add(new EntityImageViewAdapter(entityFactory.createSeaweedsEntity()));

        // this.badges.add(new TomanBadge());
        // this.badges.add(new ArapaimaBadge());
        // this.badges.add(new TongkolBadge());
        // this.badges.add(new TilapiaBadge());
        // this.badges.add(new SardinBadge());

        this.getChildren().addAll(entities);
        this.getChildren().addAll(badges);
    }

    public void addFishes() {
        this.addFishes(new BaseEntityFactory());
    }

    public void addFishes(EntityFactory entityFactory) {
        this.entities.add(new EntityImageViewAdapter(entityFactory.createFishesEntity(aquarium)));
        this.getChildren().addAll(entities);
    }
}
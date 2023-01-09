package org.aquarium;

public class BaseSeaweeds extends Entity {
    public BaseSeaweeds() {
        this.name = "seaweeds";
        this.appearance = new Appearance(App.class.getResource("images/seaweeds.png").toExternalForm());
        this.location = new Location(10, 10);

    }
}
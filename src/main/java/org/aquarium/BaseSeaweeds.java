package org.aquarium;

public class BaseSeaweeds extends Entity {
    public BaseSeaweeds() {
        this.name = "seaweeds";
        this.appearance = new Appearance("src\\main\\resources\\org\\aquarium\\images\\seaweeds.png");
        this.location = new Location(10, 10);

    }
}
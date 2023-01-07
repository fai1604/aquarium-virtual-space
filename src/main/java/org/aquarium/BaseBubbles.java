package org.aquarium;

public class BaseBubbles extends Entity {
    public BaseBubbles() {
        this.name = "bubbles";
        this.appearance = new Appearance("src\\main\\resources\\org\\aquarium\\images\\bubbles.png");
        this.location = new Location(10, 10);
    }
}
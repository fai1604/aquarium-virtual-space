package org.aquarium;

public class BaseBubbles extends Entity {
    public BaseBubbles() {
        this.name = "bubbles";
        this.appearance = new Appearance(App.class.getResource("images/bubbles.png").toExternalForm());
        this.location = new Location(10, 10);
    }
}
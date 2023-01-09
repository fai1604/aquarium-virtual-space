package org.aquarium;

public class BaseCrab extends Entity {
    public BaseCrab() {
        this.name = "crab";
        this.appearance = new Appearance(App.class.getResource("images/crab.png").toExternalForm());
        this.location = new Location(10, 10);
    }
}
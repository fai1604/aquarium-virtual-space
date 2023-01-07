package org.aquarium;

public class BaseCrab extends Entity {
    public BaseCrab() {
        this.name = "crab";
        this.appearance = new Appearance("src\\main\\resources\\org\\aquarium\\images\\crab.png");
        this.location = new Location(10, 10);
    }
}
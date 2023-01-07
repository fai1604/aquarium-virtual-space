package org.aquarium;

public class BaseSeahorse extends Entity {
    public BaseSeahorse() {
        this.name = "seahorse";
        this.appearance = new Appearance("src\\main\\resources\\org\\aquarium\\images\\seahorse.png");
        this.location = new Location(10, 10);
    }
}
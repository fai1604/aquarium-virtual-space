package org.aquarium;

public class BaseSeahorse extends Entity {
    public BaseSeahorse() {
        this.name = "seahorse";
        this.appearance = new Appearance(App.class.getResource("images/seahorse.png").toExternalForm());
        this.location = new Location(10, 10);
    }
}
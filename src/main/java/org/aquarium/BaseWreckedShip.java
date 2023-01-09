package org.aquarium;

public class BaseWreckedShip extends Entity {
    public BaseWreckedShip() {
        this.name = "wrecked ship";
        this.appearance = new Appearance(App.class.getResource("images/wrecked-ship.png").toExternalForm());
        this.location = new Location(10, 10);

    }
}
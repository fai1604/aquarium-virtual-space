package org.aquarium;

public class BaseWreckedShip extends Entity {
    public BaseWreckedShip() {
        this.name = "wrecked ship";
        this.appearance = new Appearance("src\\main\\resources\\org\\aquarium\\images\\wrecked-ship.png");
        this.location = new Location(10, 10);

    }
}
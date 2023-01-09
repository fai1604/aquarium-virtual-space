package org.aquarium;

public interface EntityFactory {
    public abstract Entity createFishesEntity();
    public abstract Entity createCrabEntity();
    public abstract Entity createSeahorseEntity();
    public abstract Entity createWreckedShipEntity();
    public abstract Entity createSeaweedsEntity();
    public abstract Entity createBubblesEntity();
}
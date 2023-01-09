package org.aquarium;

public interface EntityFactory {
    public abstract Entity createFishesEntity();
    public abstract Entity createCrabsEntity();
    public abstract Entity createSeahorsesEntity();
    public abstract Entity createWreckedShipEntity();
    public abstract Entity createSeaweedsEntity();
    public abstract Entity createBubblesEntity();
}
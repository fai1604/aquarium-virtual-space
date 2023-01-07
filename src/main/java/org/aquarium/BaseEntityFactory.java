package org.aquarium;

public class BaseEntityFactory implements EntityFactory{
    @Override
    public Entity createFishesEntity() {
        return new BaseFishes();
    }

    @Override
    public Entity createCrabEntity() {
        return new BaseCrab();
    }

    @Override
    public Entity createSeahorseEntity() {
        return new BaseSeahorse();
    }

    @Override
    public Entity createWreckedShipEntity() {
        return new BaseWreckedShip();
    }

    @Override
    public Entity createSeaweedEntity() {
        return new BaseSeaweeds();
    }

    @Override
    public Entity createBubblesEntity() {
        return new BaseBubbles();
    }
}
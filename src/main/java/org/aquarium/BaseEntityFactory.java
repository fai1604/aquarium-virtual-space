package org.aquarium;

public class BaseEntityFactory implements EntityFactory{
    @Override
    public Entity createFishesEntity(AquariumSpace aquarium) {
        return new BaseFishes(aquarium);
    }

    @Override
    public Entity createCrabsEntity() {
        return new BaseCrab();
    }

    @Override
    public Entity createSeahorsesEntity() {
        return new BaseSeahorse();
    }

    @Override
    public Entity createWreckedShipEntity() {
        return new BaseWreckedShip();
    }

    @Override
    public Entity createSeaweedsEntity() {
        return new BaseSeaweeds();
    }

    @Override
    public Entity createBubblesEntity() {
        return new BaseBubbles();
    }
}
package org.aquarium;

public abstract class Command {
    AquariumSpace space;

    Command(AquariumSpace space){
        this.space = space;
    }

    public abstract void execute();
    public abstract void undo();

}

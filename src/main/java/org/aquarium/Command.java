package org.aquarium;

import javafx.scene.media.MediaPlayer;

public abstract class Command {

    public abstract void execute();

    public abstract void undo();

}

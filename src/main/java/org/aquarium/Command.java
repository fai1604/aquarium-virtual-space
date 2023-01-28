package org.aquarium;

import javafx.scene.media.MediaPlayer;

public interface Command {


    public abstract void execute();

    public abstract void undo();

}

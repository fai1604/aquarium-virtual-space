package org.aquarium;

import javafx.scene.media.MediaPlayer;

public abstract class Command {

    MediaPlayer mediaPlayer;

    public Command(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public abstract void execute();

    public abstract void undo();

}

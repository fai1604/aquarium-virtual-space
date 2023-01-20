package org.aquarium;

import javafx.scene.media.MediaPlayer;

public class ToggleBGMusic implements Command {
    MediaPlayer mediaPlayer;

    public ToggleBGMusic(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
        // TODO Auto-generated constructor stub
    }

    @Override
    public void execute() {
        mediaPlayer.play();
        // TODO Auto-generated method stub

    }

    @Override
    public void undo() {
        mediaPlayer.pause();
        // TODO Auto-generated method stub

    }

}

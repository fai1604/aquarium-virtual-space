package org.aquarium;

import javafx.scene.media.MediaPlayer;

public class ToggleBGMusic extends Command {

    public ToggleBGMusic(MediaPlayer mediaPlayer) {
        super(mediaPlayer);
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

package org.aquarium;
import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer; 
public class ToggleBGMusic extends Command {

    ToggleBGMusic(AquariumSpace space) {
        super(space);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void execute() {
        
        this.space.changeMusic(true); 

        
    }

    @Override
    public void undo() {
        this.space.changeMusic(false);
    }
    
}

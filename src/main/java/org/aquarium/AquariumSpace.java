package org.aquarium;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;

public class AquariumSpace {
    public Stage stage;
    MediaPlayer mediaPlayer;
    boolean music = false;

    public AquariumSpace(Stage stage) {
        this.stage = stage;
    }

    private void InitializeMusicPlayer(){
        String path = "src/main/java/org/aquarium/Spongebob Music - Background Music.mp3";  

        Media media = new Media(new File(path).toURI().toString());  
          
        //Instantiating MediaPlayer class   
        this.mediaPlayer = new MediaPlayer(media);  
    }

    public void changeMusic(boolean state){
        this.mediaPlayer.setAutoPlay(state);  
        System.out.println(state + "hi");
    }

    public void performCommand(Command cmd){
        cmd.execute();
    }

    public void startAquarium() {
        BorderPane root = new BorderPane();
        Space space = new Space();
        Controls controls = new Controls();
        this.InitializeMusicPlayer();

        System.out.print(controls.controlButtons[6]);
        controls.controlButtons[6].setOnAction(event);

        root.setTop(space);
        root.setBottom(controls);

        Scene scene = new Scene(root, 1300, 900);
        
        stage.setTitle("Aquarium Space");
        stage.setScene(scene);
        stage.show();
    }

    EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e)
        {
            this.performCommand(new ToggleBGMusic(AquariumSpace.this));
        }

        private void performCommand(Command cmd) {
            if(AquariumSpace.this.music){
                AquariumSpace.this.changeMusic(false);
            } else{
            System.out.print("again");
            AquariumSpace.this.changeMusic(true);

                // cmd.execute();
            }

            AquariumSpace.this.music= !AquariumSpace.this.music;
            
        }
    };
}
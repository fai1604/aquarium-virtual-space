package org.aquarium;

import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {
    AquariumSpace aquariumSpace;

    @Override
    public void start(Stage stage) throws IOException {
        aquariumSpace = new AquariumSpace(stage);
        aquariumSpace.startAquarium();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        aquariumSpace.stopAquarium();
    }

    // static void setRoot(String fxml) throws IOException {
    //     scene.setRoot(loadFXML(fxml));
    // }

    // private static Parent loadFXML(String fxml) throws IOException {
    //     FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
    //     return fxmlLoader.load();
    // }

    public static void main(String[] args) {
        launch();
    }
}
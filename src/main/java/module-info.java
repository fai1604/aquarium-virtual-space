module org.aquarium {
    requires transitive javafx.controls;
    requires transitive javafx.graphics;
    requires javafx.fxml;
    requires transitive javafx.media;

    opens org.aquarium to javafx.fxml;

    exports org.aquarium;
}
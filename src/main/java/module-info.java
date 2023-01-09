module org.aquarium {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens org.aquarium to javafx.fxml;

    exports org.aquarium;
}
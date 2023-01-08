module org.aquarium {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens org.aquarium to javafx.fxml;
    exports org.aquarium;
}

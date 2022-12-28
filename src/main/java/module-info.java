module org.aquarium {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.aquarium to javafx.fxml;
    exports org.aquarium;
}

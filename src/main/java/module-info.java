module com.example.javafxangel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxangel to javafx.fxml;
    exports com.example.javafxangel;
}
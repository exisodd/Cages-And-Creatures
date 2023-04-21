module com.cagesandcreatures {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cagesandcreatures to javafx.fxml;
    exports com.cagesandcreatures;
    exports com.cagesandcreatures.controllers;
    opens com.cagesandcreatures.controllers to javafx.fxml;
}
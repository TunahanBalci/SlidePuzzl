module com.binarybrotherhood.slidepuzzle {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.binarybrotherhood.slidepuzzle to javafx.fxml;
    exports com.binarybrotherhood.slidepuzzle;
}
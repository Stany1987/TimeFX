module com.example.timefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.timefx to javafx.fxml;
    exports com.example.timefx;
}
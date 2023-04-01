module com.example.multiplechoice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.multiplechoice to javafx.fxml;
    exports com.example.multiplechoice;
}
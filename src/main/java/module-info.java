module com.example.sudokuproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sudokuproject to javafx.fxml;
    exports com.example.sudokuproject;
}
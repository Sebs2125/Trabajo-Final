module com.example.mapa
{
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.mapa to javafx.fxml;
    exports com.example.mapa;
}
module com.mycompany.luka {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.luka to javafx.fxml;
    exports com.mycompany.luka;
}

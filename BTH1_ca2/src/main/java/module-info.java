module com.mycompany.bth1_ca2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.mycompany.bth1_ca2 to javafx.fxml;
    exports com.mycompany.bth1_ca2;
}

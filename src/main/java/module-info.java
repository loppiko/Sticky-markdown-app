module stickyApp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens stickyApp to javafx.fxml;
    exports stickyApp;
    exports stickyApp.leftPanel;
    opens stickyApp.leftPanel to javafx.fxml;
    exports stickyApp.upperPanel;
    opens stickyApp.upperPanel to javafx.fxml;
}
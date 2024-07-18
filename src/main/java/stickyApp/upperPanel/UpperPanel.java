package stickyApp.upperPanel;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class UpperPanel {

    @FXML
    private MenuItem saveMenuItem;

    @FXML
    private MenuItem saveAsMenuItem;

    @FXML
    private MenuItem openMenuItem;

    @FXML
    private MenuItem exitMenuItem;

    @FXML
    protected void handleExitOnClick(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    protected void UpperPanelNewOnClick() {
//        newText.setText("new has been clicked");
    }
}

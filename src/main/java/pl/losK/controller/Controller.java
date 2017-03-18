package pl.losK.controller;

import javafx.scene.control.Alert;

/**
 * Created by m.losK on 2017-03-16.
 */
public class Controller {

    protected MainController mainController;

    protected MenuController menuController;

    protected MainController getMainController() {
        return mainController;
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    protected void showErrorAlert(String message) {
        showAlert(Alert.AlertType.ERROR, message);
    }

    protected void showConfirmationAlert(String message) {
        showAlert(Alert.AlertType.CONFIRMATION, message);
    }

    private void showAlert(Alert.AlertType alertType, String message) {
        new Alert(alertType, message).show();
    }
}
package example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

public class RegistrationFormController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button submitButton;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {

        Window owner = submitButton.getScene().getWindow();

        if (nameField.getText().isEmpty()) {
            showAlert(owner, "Form Error!", "Please enter your name");
            return;
        }

        if (emailField.getText().isEmpty()) {
            showAlert(owner, "Form Error!", "Please enter your email");
            return;
        }

        if (passwordField.getText().isEmpty()) {
            showAlert(owner, "Form Error!", "Please enter your password");
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registration Successful!");
        alert.setHeaderText(null);
        alert.setContentText("Welcome " + nameField.getText());
        alert.initOwner(owner);
        alert.show();
    }

    private void showAlert(Window owner, String title, String message) {

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
}
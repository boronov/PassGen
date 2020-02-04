package boronov;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private JFXTextField password;

    @FXML
    private JFXTextField setLenOfPassword;

    @FXML
    private JFXButton generatePasswordLabel;

    @FXML
    private Label passwordLenLabel;


    @FXML
    private void exitButton() {
        System.exit(0);
    }


    @FXML
    private void changeToTJ(MouseEvent mouseEvent) {
        generatePasswordLabel.setText("Ҳосил кардан");
        passwordLenLabel.setText("Миқдори аломатҳо: ");
    }

    @FXML
    private void changeToRu(MouseEvent mouseEvent) {
        generatePasswordLabel.setText("Сгенерировать");
        passwordLenLabel.setText("Количество символов: ");
    }

    @FXML
    private void changeToEn(MouseEvent mouseEvent) {
        generatePasswordLabel.setText("Generate");
        passwordLenLabel.setText("Characters: ");
    }

    @FXML
    private void generatePassword(MouseEvent mouseEvent) {
        int lenOfPass;
        try {
            lenOfPass = Integer.parseInt(setLenOfPassword.getText());
        } catch (Exception e) {
            setLenOfPassword.setText("8");
            lenOfPass = 0;
        }
        Until passGen = new Until();
        StringBuilder pass = new StringBuilder();

        for (int j = 0; j < lenOfPass; j++) {
            pass.append(passGen.randChar());
        }
        password.setText(pass.toString());
        pass.setLength(0);
    }
}

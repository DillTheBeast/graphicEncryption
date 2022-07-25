package Encryption;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button alphabet;

    @FXML
    private Button caesar;

    @FXML
    private TextField inputField;

    @FXML
    private TextField keyField;

    @FXML
    private TextField outputField;

    @FXML
    private Button railFence;

    @FXML
    private Button vignere;

    @FXML
    void onAlphabetClick(ActionEvent event) {
        String plainText = inputField.getText();
        String plainOutput = "";
        for(int a = 0; a < plainText.length(); a++) {
            plainOutput += plainText.charAt(a) + 0 + " ";
        }  
        outputField.setText(plainOutput);
    }

    @FXML
    void onCaesarClick(ActionEvent event) {

    }

    @FXML
    void onRailFenceClick(ActionEvent event) {

    }

    @FXML
    void onVignere(ActionEvent event) {

    }

}

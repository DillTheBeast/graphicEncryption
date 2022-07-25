package Encryption;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

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
    public static String railFence(String input, int key) {
        ArrayList<ArrayList<Character>> al = new ArrayList<ArrayList<Character>>(key); 
        int position;
        char letter;
        int n = 0;
        boolean isGoingUp = true;

        for(int  i = 0; i < key; i++){
            al.add(new ArrayList<Character>());
        }


        for(int i = 0; i < input.length(); i++) {
            letter = input.charAt(i);
            position = n % key;
            al.get(position).add(letter);
            
            if(isGoingUp == false) {
                n--; 
            }

            if(isGoingUp == true) {
                n++;
            }
            if(n == key-1) {
                isGoingUp = false;
            }

            if(n == 0) {
                isGoingUp = true;
            } 

            //System.out.println(al.get(position).toString());
        }
        String output = "";
        /*
        for(int i = 0; i < key; i++) {
            al.addAll(al);
            int finalposition = i % key;
            output += al.get(finalposition) + " ";
        }
        */
        //For loop for an arraylist. It is used when you iterate over the whole array and don't need the index
        for (ArrayList<Character> row : al) {
            for (Character item : row) {
                output += item;
            }
        }

        return output;
    }

    @FXML
    void onRailFenceClick(ActionEvent event) {
        //Integer.parseInt is converting from a String to an int
        //Try Catch anticipates and fixes the error
        try {
            int key = Integer.parseInt(keyField.getText());
            outputField.setText(railFence(inputField.getText(), key));
        } catch (Exception e) {
            for(int i = 0; i < 10; i++) {
            Alert badInput = new Alert(AlertType.ERROR);
            badInput.setHeaderText("Invalid Key");
            badInput.setContentText("Key has to be a number");
            badInput.setX(Math.random() * 400);
            badInput.show();
            }
        }
        
    }

    @FXML
    void onVignere(ActionEvent event) {

    }

}

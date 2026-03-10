package com.example.javafxobserver;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ExampleController {
    @FXML
    public TextField input1;
    public TextField input2;
    @FXML
    private Label text;

    @FXML
    private void updateText() {
        //Change text
        text.setText(input1.getText() + " and " + input2.getText());
    }

    @FXML
    public void initialize() {
        //Add observers
        //Thankfully JavaFX implements observers by default, so we only need to worry about attaching listeners.
        input1.textProperty().addListener((observable, oldValue, newValue) -> {
            updateText();
        });
        input2.textProperty().addListener((observable, oldValue, newValue) -> {
            updateText();
        });
    }
}
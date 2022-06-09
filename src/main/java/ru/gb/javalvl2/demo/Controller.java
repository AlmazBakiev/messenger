package ru.gb.javalvl2.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextArea messageWindow;
    @FXML
    private TextField userWrite;

    public void clickCheckButton(ActionEvent actionEvent) {
        String text = userWrite.getText();
        if (text.isEmpty()) {
            userWrite.requestFocus();
            return;
        }
        messageWindow.appendText(text + "\n");
        userWrite.clear();
        userWrite.requestFocus();
    }
}
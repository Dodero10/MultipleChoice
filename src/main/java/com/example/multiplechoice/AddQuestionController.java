package com.example.multiplechoice;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddQuestionController {
    @FXML
    private TextField categoryText;
    @FXML
    private TextField questionID;
    @FXML
    private TextField questionText;
    @FXML
    private TextField mark;
    @FXML
    private Button Add;
    @FXML
    private Button Cancel;

    public void setAdd(Button add) {
        Add = add;
        Question newQuestion = new Question();
        newQuestion.setCategoryID(categoryText.getText());
        newQuestion.setQuestionID(questionID.getText());
        newQuestion.setQuestionText(questionText.getText());
        newQuestion.setMarkQuestion(Integer.valueOf(mark.getText()));
        // Lưu lại data chỗ nào thì chưa làm được
    }
}

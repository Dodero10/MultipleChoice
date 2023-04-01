package com.example.multiplechoice;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class TableQuestionController implements Initializable {
    @FXML
    private TableView<Question> tableQuestion;
    @FXML
    private TableColumn<Question, String> idQuestionColumn;
    @FXML
    private TableColumn<Question, String> textQuestionColumn;
    @FXML
    private TableColumn<Question, String> categoryQuestionColumn;
    @FXML
    private TableColumn<Question, Integer> markQuestionColumn;
    @FXML
    private Button creatQuestion;

    public ObservableList<Question> questionList;

    public ObservableList<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(ObservableList<Question> questionList) {
        this.questionList = questionList;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idQuestionColumn.setCellValueFactory(new PropertyValueFactory<Question, String>("idQuestion"));
        textQuestionColumn.setCellValueFactory(new PropertyValueFactory<Question, String>("textQuestion"));
        categoryQuestionColumn.setCellValueFactory(new PropertyValueFactory<Question, String>("categoryQuestion"));
        markQuestionColumn.setCellValueFactory(new PropertyValueFactory<Question, Integer>("markQuestion"));
        tableQuestion.setItems(questionList);
    }
}

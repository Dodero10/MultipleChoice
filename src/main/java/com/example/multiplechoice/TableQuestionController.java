package com.example.multiplechoice;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
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
    public void creatQuestionButton(ActionEvent e) throws IOException {
        Stage stage = (Stage)((Node) e.getSource()).getScene().getWindow();
        FXMLLoader AddQuestion = new FXMLLoader();
        AddQuestion.setLocation(getClass().getResource("AddQuestion.fxml"));
        Parent questionViewAdd = AddQuestion.load();
        Scene sceneAddQuestion = new Scene(questionViewAdd);
        stage.setScene(sceneAddQuestion);

    }
}

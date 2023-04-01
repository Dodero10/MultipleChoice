package com.example.multiplechoice;

import javafx.fxml.Initializable;

import java.util.ArrayList;

public class Question {
    private String questionID;
    private String questionText;
    private ArrayList<ChoiceQuestion> listChoice;
    private String categoryID;
    private Integer markQuestion;

    public Question(String questionID, String questionText, ArrayList<ChoiceQuestion> listChoice, String categoryID, Integer markQuestion) {
        this.questionID = questionID;
        this.questionText = questionText;
        this.listChoice = listChoice;
        this.categoryID = categoryID;
        this.markQuestion = markQuestion;
    }

    public Question(String questionID, String questionText, String categoryID, Integer markQuestion) {
        this.questionID = questionID;
        this.questionText = questionText;
        this.categoryID = categoryID;
        this.markQuestion = markQuestion;
    }

    public Question() {

    }

    public Integer getMarkQuestion() {
        return markQuestion;
    }

    public void setMarkQuestion(Integer markQuestion) {
        this.markQuestion = markQuestion;
    }

    public String getQuestionID() {
        return questionID;
    }

    public void setQuestionID(String questionID) {
        this.questionID = questionID;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public ArrayList<ChoiceQuestion> getListChoice() {
        return listChoice;
    }

    public void setListChoice(ArrayList<ChoiceQuestion> listChoice) {
        this.listChoice = listChoice;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }
}

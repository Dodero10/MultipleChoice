package com.example.multiplechoice;

public class ChoiceQuestion {
    private double gradeChoice;
    private String choiceText;
    private boolean isChoosed;

    public ChoiceQuestion(double gradeChoice, String choiceText, boolean isChoosed) {
        this.gradeChoice = gradeChoice;
        this.choiceText = choiceText;
        this.isChoosed = isChoosed;
    }

    public ChoiceQuestion() {
    }

    public double getGradeChoice() {
        return gradeChoice;
    }

    public void setGradeChoice(double gradeChoice) {
        this.gradeChoice = gradeChoice;
    }

    public String getChoiceText() {
        return choiceText;
    }

    public void setChoiceText(String choiceText) {
        this.choiceText = choiceText;
    }

    public boolean isChoosed() {
        return isChoosed;
    }

    public void setChoosed(boolean choosed) {
        isChoosed = choosed;
    }
}

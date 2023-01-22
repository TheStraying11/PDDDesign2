package io.github.thestraying11.pdddesign2.data;

public class questionnaire {
    private String medicalHistory;
    private int mentalHealthScore;
    private String existingConditions;
    private String mentalHealthQuestions;

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public int getMentalHealthScore() {
        return mentalHealthScore;
    }

    public void setMentalHealthScore(int mentalHealthScore) {
        this.mentalHealthScore = mentalHealthScore;
    }

    public String getExistingConditions() {
        return existingConditions;
    }

    public void setExistingConditions(String existingConditions) {
        this.existingConditions = existingConditions;
    }

    public String getMentalHealthQuestions() {
        return mentalHealthQuestions;
    }

    public void setMentalHealthQuestions(String mentalHealthQuestions) {
        this.mentalHealthQuestions = mentalHealthQuestions;
    }

    public questionnaire(String medicalHistory, int mentalHealthScore, String existingConditions, String mentalHealthQuestions) {
        this.medicalHistory = medicalHistory;
        this.mentalHealthScore = mentalHealthScore;
        this.existingConditions = existingConditions;
        this.mentalHealthQuestions = mentalHealthQuestions;
    }
}

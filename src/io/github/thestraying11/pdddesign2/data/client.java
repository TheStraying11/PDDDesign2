package io.github.thestraying11.pdddesign2.data;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class client {
    private String fName;
    private ArrayList<String> mNames;
    private String lName;
    private String email;
    private String address;
    private String phoneNumber;
    private ZonedDateTime dateOfBirth;
    private boolean completedQuestionnaire;
    private boolean isCorporate;
    private questionnaire questionnaireResults;


    private client() {
        this.fName = "";
        this.mNames = new ArrayList<>();
        this.lName = "";
        this.email = "";
        this.address = "";
        this.phoneNumber = "";
        this.dateOfBirth = ZonedDateTime.of(2001, 1, 25, 0, 0, 0, 0, ZoneId.systemDefault());
        this.completedQuestionnaire = false;
        this.isCorporate = false;
        this.questionnaireResults = new questionnaire("", 0, "", "");
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public ArrayList<String> getMNames() {
        return mNames;
    }

    public void setMNames(ArrayList<String> mNames) {
        this.mNames = mNames;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ZonedDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(ZonedDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isCompletedQuestionnaire() {
        return completedQuestionnaire;
    }

    public void setCompletedQuestionnaire(boolean completedQuestionnaire) {
        this.completedQuestionnaire = completedQuestionnaire;
    }

    public boolean isCorporate() {
        return isCorporate;
    }

    public void setCorporate(boolean corporate) {
        isCorporate = corporate;
    }

    public questionnaire getQuestionnaireResults() {
        return questionnaireResults;
    }

    public void setQuestionnaireResults(questionnaire questionnaireResults) {
        this.questionnaireResults = questionnaireResults;
    }
    public static class clientBuilder {
        private final client client;

        public clientBuilder( // required arguments
                String fName, String lName, String email, String address,
                ZonedDateTime dateOfBirth, boolean completedQuestionnaire, boolean isCorporate,
                questionnaire questionnaireResults
        ) {
            this.client = new client();
            this.client.setFName(fName);
            this.client.setLName(lName);
            this.client.setEmail(email);
            this.client.setAddress(address);
            this.client.setDateOfBirth(dateOfBirth);
            this.client.setCompletedQuestionnaire(completedQuestionnaire);
            this.client.setCorporate(isCorporate);
            this.client.setQuestionnaireResults(questionnaireResults);
        }

        public clientBuilder withMNames(String ...mNames) { // optional argument
            this.client.setMNames(new ArrayList<>(Arrays.asList(mNames)));

            return this;
        }

        public clientBuilder withPhoneNumber(String phoneNumber) { // optional argument
            this.client.setPhoneNumber(phoneNumber);

            return this;
        }

        public client build() {
            return this.client;
        }
    }
}

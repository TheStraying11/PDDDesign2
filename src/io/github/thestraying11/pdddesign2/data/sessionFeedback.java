package io.github.thestraying11.pdddesign2.data;

public class sessionFeedback {
    private int sessionNum;
    private client fName;
    private client lName;
    private String Q1;
    private String Q2;
    private String Q3;
    private String Q4;
    private String Q5;

    public sessionFeedback(int sessionNum, client fName, client lName, String Q1, String Q2, String Q3, String Q4, String Q5){
        this.sessionNum = sessionNum;
        this.fName = fName;
        this.lName = lName;
        this.Q1 = Q1;
        this.Q2 = Q2;
        this.Q3 = Q3;
        this.Q4 = Q4;
        this.Q5 = Q5;

    }

    public int getSessionNum() {
        return sessionNum;
    }

    public void setSessionNum(int sessionNum) {
        this.sessionNum = sessionNum;
    }

    public client getfName() {
        return fName;
    }

    public void setfName(client fName) {
        this.fName = fName;
    }

    public client getlName() {
        return lName;
    }

    public void setlName(client lName) {
        this.lName = lName;
    }

    public String getQ1() {
        return Q1;
    }

    public void setQ1(String q1) {
        Q1 = q1;
    }

    public String getQ2() {
        return Q2;
    }

    public void setQ2(String q2) {
        Q2 = q2;
    }

    public String getQ3() {
        return Q3;
    }

    public void setQ3(String q3) {
        Q3 = q3;
    }

    public String getQ4() {
        return Q4;
    }

    public void setQ4(String q4) {
        Q4 = q4;
    }

    public String getQ5() {
        return Q5;
    }

    public void setQ5(String q5) {
        Q5 = q5;
    }
}

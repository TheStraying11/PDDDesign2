package io.github.thestraying11.pdddesign2.data;

import io.github.thestraying11.pdddesign2.courses.courses;

import java.util.ArrayList;

public class sessionSummary {
        private ArrayList<String> brainLevel;
        private ArrayList<String> brainFreq;
        private int avgLevel;
        private int avgFreq;
        private String sessionEffectiveness;
        private courses course;
        private int sessionNum;

    public sessionSummary(ArrayList<String> brainLevel, ArrayList<String> brainFreq, int avgLevel, int avgFreq, String sessionEffectiveness, courses course, int sessionNum) {
        this.brainLevel = brainLevel;
        this.brainFreq = brainFreq;
        this.avgLevel = avgLevel;
        this.avgFreq = avgFreq;
        this.sessionEffectiveness = sessionEffectiveness;
        this.course = course;
        this.sessionNum = sessionNum;
    }

    public ArrayList<String> getBrainLevel() {
        return brainLevel;
    }

    public void setBrainLevel(ArrayList<String> brainLevel) {
        this.brainLevel = brainLevel;
    }

    public ArrayList<String> getBrainFreq() {
        return brainFreq;
    }

    public void setBrainFreq(ArrayList<String> brainFreq) {
        this.brainFreq = brainFreq;
    }

    public int getAvgLevel() {
        return avgLevel;
    }

    public void setAvgLevel(int avgLevel) {
        this.avgLevel = avgLevel;
    }

    public int getAvgFreq() {
        return avgFreq;
    }

    public void setAvgFreq(int avgFreq) {
        this.avgFreq = avgFreq;
    }

    public String getSessionEffectiveness() {
        return sessionEffectiveness;
    }

    public void setSessionEffectiveness(String sessionEffectiveness) {
        this.sessionEffectiveness = sessionEffectiveness;
    }

    public courses getCourse() {
        return course;
    }

    public void setCourse(courses course) {
        this.course = course;
    }

    public int getSessionNum() {
        return sessionNum;
    }

    public void setSessionNum(int sessionNum) {
        this.sessionNum = sessionNum;
    }

}

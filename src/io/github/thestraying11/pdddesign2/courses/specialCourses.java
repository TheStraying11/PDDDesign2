package io.github.thestraying11.pdddesign2.courses;

import io.github.thestraying11.pdddesign2.data.doctor;

import java.util.ArrayList;

public class specialCourses {
    private int ScourseID;
    private String SCName;
    private String SCDesc;
    private int sessionAmount;
    private int sessionLength;
    private ArrayList<String> medicalReq;
    private doctor doctor;

    public int getScourseID() {
        return ScourseID;
    }

    public void setScourseID(int ScourseID) {
        this.ScourseID = ScourseID;
    }

    public String getSCName() {
        return SCName;
    }

    public void setSCName(String SCName) {
        this.SCName = SCName;
    }

    public String getSCDesc() {
        return SCDesc;
    }

    public void setSCDesc(String SCDesc) {
        this.SCDesc = SCDesc;
    }

    public int getSessionAmount() {
        return sessionAmount;
    }

    public void setSessionAmount(int sessionAmount) {
        this.sessionAmount = sessionAmount;
    }

    public int getSessionLength() {
        return sessionLength;
    }

    public void setSessionLength(int sessionLength) {
        this.sessionLength = sessionLength;
    }

    public ArrayList<String> getMedicalReq() {
        return medicalReq;
    }

    public void setMedicalReq(ArrayList<String> medicalReq) {
        this.medicalReq = medicalReq;
    }

    public doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(doctor doctor) {
        this.doctor = doctor;
    }

    public specialCourses(int ScourseID, String SCName, String SCDesc, int sessionAmount, int sessionLength, ArrayList<String> medicalReq, doctor doctor) {
        this.ScourseID = ScourseID;
        this.SCName = SCName;
        this.SCDesc = SCDesc;
        this.sessionAmount = sessionAmount;
        this.sessionLength = sessionLength;
        this.medicalReq = medicalReq;
        this.doctor = doctor;
    }

}

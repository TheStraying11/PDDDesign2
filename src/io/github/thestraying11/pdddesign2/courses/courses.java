package io.github.thestraying11.pdddesign2.courses;

import io.github.thestraying11.pdddesign2.data.doctor;

import java.util.ArrayList;

public class courses {
    private int courseID;
    private String cName;
    private String cDesc;
    private int sessionCount;
    private int sessionLength;
    private ArrayList<String> medicalReq;
    private doctor doctor;
    private float price;

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcDesc() {
        return cDesc;
    }

    public void setcDesc(String cDesc) {
        this.cDesc = cDesc;
    }

    public int getSessionCount() {
        return sessionCount;
    }

    public void setSessionCount(int sessionCount) {
        this.sessionCount = sessionCount;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public courses(int courseID, String cName, String cDesc, int sessionCount, int sessionLength, ArrayList<String> medicalReq, doctor doctor, int price) {
        this.courseID = courseID;
        this.cName = cName;
        this.cDesc = cDesc;
        this.sessionCount = sessionCount;
        this.sessionLength = sessionLength;
        this.medicalReq = medicalReq;
        this.doctor = doctor;
        this.price = price;
    }


    }


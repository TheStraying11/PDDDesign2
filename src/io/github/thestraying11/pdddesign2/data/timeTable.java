package io.github.thestraying11.pdddesign2.data;
import io.github.thestraying11.pdddesign2.courses.courses;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class timeTable {
    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy kk:mm:ss z");
    private ZonedDateTime time;
    private String courseName;
    private String doctorFName;
    private String doctorLName;

    public ZonedDateTime getTime() {
        return time;
    }

    public void setTime(ZonedDateTime time) {
        this.time = time;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDoctorFName() {
        return doctorFName;
    }

    public void setDoctorFName(String doctorFName) {
        this.doctorFName = doctorFName;
    }

    public String getDoctorLName() {
        return doctorLName;
    }

    public void setDoctorLName(String doctorLName) {
        this.doctorLName = doctorLName;
    }

    public timeTable(ZonedDateTime time) {
        this.time = time;
        // TODO: finish
    }
}

package io.github.thestraying11.pdddesign2.data;
import java.util.ArrayList;
import java.util.Arrays;

public class doctor {
        private String fName;
        private ArrayList<String> mNames;
        private String lName;
        private String email;
        private String address;
        private String phoneNumber;
        private ArrayList<String> degrees;
        private String mainField;

        private doctor() {
            this.fName="";
            this.mNames = new ArrayList<>();
            this.lName = "";
            this.email = "";
            this.address = "";
            this.phoneNumber = "";
            this.degrees = new ArrayList<>();
            this.mainField="";
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

    public ArrayList<String> getDegrees() {
            return degrees;
        }

    public void setDegrees(ArrayList<String> degrees) {
            this.degrees = degrees;
    }

    public String getMainField() {
        return mainField;
    }

    public void setMainField(String mainField) {
        this.mainField = mainField;
    }

    public static class doctorBuilder {
        private final doctor doctor;

        public doctorBuilder( // required arguments
                String fName, String lName, String email, String address,
                ArrayList<String> degrees, String mainField
        ) {
            this.doctor = new doctor();
            this.doctor.setFName(fName);
            this.doctor.setLName(lName);
            this.doctor.setEmail(email);
            this.doctor.setAddress(address);
            this.doctor.setDegrees(degrees);
            this.doctor.setMainField(mainField);

        }
        public doctorBuilder withMNames(String ...mNames) { // optional argument
            this.doctor.setMNames(new ArrayList<>(Arrays.asList(mNames)));

            return this;
        }
        public doctorBuilder withPhoneNumber(String phoneNumber) { // optional argument
            this.doctor.setPhoneNumber(phoneNumber);

            return this;
        }
        public doctor build() {
                    return this.doctor;
                }
        }
}
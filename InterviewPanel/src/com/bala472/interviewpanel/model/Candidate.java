package com.bala472.interviewpanel.model;

public class Candidate {
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String qualification;
    private String password;
    private int marks;

    public void setMarks(int mark){
        this.marks=mark;
    }
    public int getMarks(){
        return marks;
    }


    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}

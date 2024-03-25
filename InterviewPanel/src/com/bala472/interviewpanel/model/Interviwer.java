package com.bala472.interviewpanel.model;

public class Interviwer {
    private String name;
    private String email;
    private long phonenumber;
    private String password;

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
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
    public long getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }
}

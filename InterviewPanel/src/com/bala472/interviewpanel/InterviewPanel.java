package com.bala472.interviewpanel;

import com.bala472.interviewpanel.login.LoginView;

public class InterviewPanel {
    private static InterviewPanel interviewPanel;

    private String appName = "Interview Panel management";

    private String version = "1";
    private InterviewPanel(){

    }
    public String getAppName() {
        return appName;
    }
    public String getVersion() {
        return version;
    }
    public static InterviewPanel getInstance(){
        if(interviewPanel==null){
            interviewPanel=new InterviewPanel();
        }
        return interviewPanel;
    }
    private void create(){
        LoginView loginView = new LoginView();

    }
    public static void main(String[] args) {

    }
}
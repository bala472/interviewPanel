package com.bala472.interviewpanel.login;

import com.bala472.interviewpanel.InterviewPanel;

import java.util.Scanner;

public class LoginView {
    private LoginModel loginModel;
    public LoginView(){
        loginModel=new LoginModel(this);
    }
    public void init() {
        System.out.println("--- " + InterviewPanel.getInstance().getAppName() + " --- \n\n--- version "
                + InterviewPanel.getInstance().getVersion()+" ---");
        System.out.println("\n\nPlease login to proceed.");
        proceedLogin();
    }
    private void proceedLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the user name:");
        String userName = scanner.next();
        System.out.println("Enter the password:");
        String password = scanner.next();
        loginModel.validateUser(userName, password);
    }
    public void onSuccess() {
        System.out.flush();
        System.out.println(
                "\n\nLogin successful...\n\n ---- welcome to " + InterviewPanel.getInstance().getAppName()
                        + " - v" + InterviewPanel.getInstance().getVersion() + "----");
       // InterviewPanelSetUpView interviewPanelSetUpView = new InterviewPanelSetUpView();
       // interviewPanelSetUpView.init();
    }
    public void onLoginFailed(String alertText) {
        System.out.println(alertText);
   //     checkForLogin();
    }

}

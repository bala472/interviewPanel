package com.bala472.interviewpanel.login;

import com.bala472.interviewpanel.InterviewPanel;
import com.bala472.interviewpanel.candidate.CandidateView;
import com.bala472.interviewpanel.interviewSetup.InterviewSetupView;
import com.bala472.interviewpanel.login.LoginView;

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
    public void proceedLogin() {
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
        InterviewSetupView interviewSetupView = new InterviewSetupView();
        interviewSetupView.mainMenu();
    }
    public void onLoginFailed(String alertText) {
        System.out.println(alertText);
   //     checkForLogin();
        proceedLogin();
    } 
    public void loginSucess(int text ){
        if(text==1)
        System.out.println("Logged in as Interviewer Sucessfully\n");
        if(text==2)
        System.out.println("Logged in as Candidate Sucessfully\n");
    }

}

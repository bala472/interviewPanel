package com.bala472.interviewpanel.interviewSetup;

import java.util.Scanner;
import com.bala472.interviewpanel.assign.*;
import com.bala472.interviewpanel.login.LoginView;

public class InterviewSetupView {
    private InterviewSetupModel interviewSetupModel;
   public InterviewSetupView(){
        interviewSetupModel=new InterviewSetupModel(this);
    }
    public void mainMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("Click 1 -----> Add Candidate");
        System.out.println("Click 2 -----> View Candidate List");
        System.out.println("Click 3 -----> Add Interviewer");
        System.out.println("Click 4 -----> View Interviewer");
        System.out.println("Click 5 -----> Assign Interviewer to Candidate ");
        System.out.println("Click 6 -----> Send result to the Candidates");
        System.out.println("Click 9 -----> Logout");
        int userInput = in.nextInt();
        if(userInput==1){
            interviewSetupModel.callCandidateView();
        } else if (userInput==2) {
            interviewSetupModel.viewCandidateList();
        } else if (userInput==3) {
            interviewSetupModel.callInterviewerView();
        } else if (userInput==4) {
            interviewSetupModel.viewInterviwerList();
        } else if(userInput==5){
            AssignView assignView = new AssignView();
            assignView.init();
        }else if(userInput==6){
            interviewSetupModel.setResult();
            System.out.println("Result send to candidates sucesfully\n");
            mainMenu();
        }
        else if (userInput==9) {
            System.out.println("Logged Out Successfully");
            LoginView login = new LoginView();
            login.init();
        }
        else{
            System.out.println("Please enter valid Input");
        }
    }

}


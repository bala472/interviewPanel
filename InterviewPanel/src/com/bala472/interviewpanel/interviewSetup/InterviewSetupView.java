package com.bala472.interviewpanel.interviewSetup;

import java.util.Scanner;

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
        int userInput = in.nextInt();
        if(userInput==1){
            interviewSetupModel.callCandidateView();
        } else if (userInput==2) {
            interviewSetupModel.viewCandidateList();
        } else if (userInput==3) {
            interviewSetupModel.callInterviewerView();
        } else if (userInput==4) {
            interviewSetupModel.viewInterviwerList();
        } else if (userInput==6) {
            System.out.println("Logged Out Successfully");
        }
        else{
            System.out.println("Please enter valid Input");
        }
    }

}

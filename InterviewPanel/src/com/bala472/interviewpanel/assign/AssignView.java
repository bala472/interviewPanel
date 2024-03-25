package com.bala472.interviewpanel.assign;

import java.util.Scanner;
import com.bala472.interviewpanel.interviewSetup.InterviewSetupView;

public class AssignView {
    private AssignModel assignModel;
   public AssignView(){
        assignModel = new AssignModel(this);
    }
    public void init(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Email of Interviewer : ");
        String interviewerEmail = in.nextLine();
        System.out.println("Enter Email of Candidate : ");
        String candidateEmail =in.nextLine();
        assignModel.addAssign(interviewerEmail,candidateEmail);

    }
    public void showAlert(int i){
        if(i==0){
            System.out.println("\nInterviewer does not exsists \n");
            nextStep();
        }
        else if(i==2){
            System.out.println("\nCandidate does not exsists\n ");
            nextStep();
        }
        else if(i==3){
            System.out.println("\nCandidate already assigned to the interviewer \n");
            nextStep();
        }else if(i==4){
            System.out.println("\nCandidate assigned to the interviewer sucessfully \n");
            nextStep();
        }else if(i==5){
            System.out.println("\nInvalid Input");
            nextStep();
        }
       
        }
        public void nextStep(){
            Scanner in = new Scanner(System.in);
            System.out.println("Click 1 -----> To assign interviewer to candidate");
            System.out.println("Clcik 2 -----> To go to Main Menu");
            int input = in.nextInt();
            if(input==1)
            init();
            else if(input==2){
                InterviewSetupView interviewSetup = new InterviewSetupView();
                interviewSetup.mainMenu();
        }else{
            showAlert(5);
        }
    }
}

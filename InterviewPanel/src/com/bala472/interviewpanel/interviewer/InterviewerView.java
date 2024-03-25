package com.bala472.interviewpanel.interviewer;

import com.bala472.interviewpanel.login.LoginView;
import com.bala472.interviewpanel.model.Interviwer;

import java.util.List;
import java.util.Scanner;

public class InterviewerView {
    private InterviewerModel interviewerModel;
    public InterviewerView(){
        interviewerModel=new InterviewerModel(this);
    }
    public void addinterviewer(){
        Scanner in = new Scanner(System.in);
        Interviwer interviwer = new Interviwer();
        System.out.println("\n\nEnter interviwer name : ");
        interviwer.setName(in.nextLine());
        System.out.println("Enter email : ");
        interviwer.setEmail(in.nextLine());
        System.out.println("Create Interviewer password");
        interviwer.setPassword(in.nextLine());
        System.out.println("Enter Phone Number : ");
        interviwer.setPhonenumber(in.nextInt());
        interviewerModel.addCandidate(interviwer);
    }
    public void showInterviewer(){
        interviewerModel.interviewerList();
    }
    public void viewInterviewerList(List<Interviwer> InterviewerList){
        System.out.printf("%-15s %-15s %-15s\n","Name","Email","Phone Number");
        for(Interviwer interviwer:InterviewerList){
            System.out.printf("%-15s %-15s %-15s \n",interviwer.getName(),interviwer.getEmail(),interviwer.getPhonenumber());
        }
    }
    public void interviewerMainMenu(String interviewerMail){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter candidate's email : ");
        String candidateEmail = in.nextLine();
       interviewerModel.interviewEvalution(interviewerMail, candidateEmail);
    }
    public int nextStep(int next,String interviewerMail){
        Scanner in = new Scanner(System.in);
        if(next==1){
            System.out.println("\nEnter marks for candidate");
            int input = in.nextInt();
            return input;
        }else if(next==2){
            System.out.println("Score added for candidate successfully\n");
            nextStep(4,interviewerMail);
        }
        else if(next==3){
            System.out.println("Please check candidate mail id. you can only set score for candidates alloted to you!!!\n");
            nextStep(4,interviewerMail);
        }else if(next==4){
            System.out.println("Click 1 -----> To add score for next candidate ");
            System.out.println("Click 2 -----> Logout");
            int input = in.nextInt();
            if(input==1){
                interviewerMainMenu(interviewerMail);
            }else{
                System.out.println("Logged out Sucessfully\n");
                new LoginView().init();
            }
        }
        return 0;
    }
}


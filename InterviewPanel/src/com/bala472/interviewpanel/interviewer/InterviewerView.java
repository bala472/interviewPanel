package com.bala472.interviewpanel.interviewer;


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
}


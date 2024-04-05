package com.bala472.interviewpanel.candidate;
import com.bala472.interviewpanel.login.LoginView;
import com.bala472.interviewpanel.model.Candidate;

import java.util.List;
import java.util.Scanner;

public class CandidateView {
    private CandidateModel candidateModel;
    public CandidateView(){
        candidateModel=new CandidateModel(this);
    }
    public void addCandidate(){
        Scanner in = new Scanner(System.in);
        Candidate candidate = new Candidate();
        System.out.println("\n\nEnter candidate name : ");
        candidate.setName(in.nextLine());
        System.out.println("Enter Phone Number : ");
        candidate.setPhoneNumber(in.nextLine());
        System.out.println("Enter email : ");
        candidate.setEmail(in.nextLine());
        System.out.println("Create candidate password");
        candidate.setPassword(in.nextLine());
        System.out.println("Enter qualification : ");
        candidate.setQualification(in.nextLine());
        System.out.println("Enter address : ");
        candidate.setAddress(in.nextLine());
        candidateModel.addCandidate(candidate);
    }
    public void showCandidate(){
        candidateModel.candidateList();
    }
    public void viewCandidateList(List<Candidate> candidateList){
        System.out.printf("%-20s %-15s %-40s %-40s %-20s %-8s \n","Name","Phone Number","email","Address","Qualification","Marks");
        for(Candidate candidate:candidateList){
            System.out.printf("%-20s %-15s %-40s %-40s %-20s %-8s\n",candidate.getName(),candidate.getPhoneNumber(),candidate.getEmail(),candidate.getAddress(),candidate.getQualification(),candidate.getMarks());
        }
    }
    public void candidateMainMenu(String email){
        Scanner in = new Scanner(System.in);
        System.out.println("Click 1 -----> To see the result");
        System.out.println("Click 2 -----> Logout");
        int userInput = in.nextInt();
        if(userInput==1){
            System.out.println( candidateModel.result(email));
            candidateMainMenu(email);
        } else if(userInput==2){
            System.out.println("Logged out sucessfully");
            new LoginView().init();
        }
    }
}

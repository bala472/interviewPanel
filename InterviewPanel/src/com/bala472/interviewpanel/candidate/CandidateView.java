package com.bala472.interviewpanel.candidate;
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
        System.out.printf("%-15s %-15s %-15s %-15s \n","Name","Phone Number","email","Address","Qualification");
        for(Candidate candidate:candidateList){
            System.out.printf("%-15s %-15s %-15s %-15s \n",candidate.getName(),candidate.getPhoneNumber(),candidate.getEmail(),candidate.getAddress(),candidate.getQualification());
        }
    }
}

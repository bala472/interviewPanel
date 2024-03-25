package com.bala472.interviewpanel.interviewer;

import java.util.Scanner;

import com.bala472.interviewpanel.datalayer.DataLayer;
import com.bala472.interviewpanel.login.LoginView;
import com.bala472.interviewpanel.model.Assign;
import com.bala472.interviewpanel.model.Candidate;
import com.bala472.interviewpanel.model.Interviwer;
public class InterviewerModel {
    private InterviewerView interviewerView;
    InterviewerModel(InterviewerView interviewerView){
        this.interviewerView=interviewerView;
    }
    public void addCandidate(Interviwer interviwer){
        DataLayer.getInstance().setInterviwerList(interviwer);
    }
    public void interviewerList(){
        interviewerView.viewInterviewerList( DataLayer.getInstance().getInterviwerList());
    }
    public void interviewEvalution(String interviewerMail,String candidateMail){
        int flag =0;
        for(Assign assign : DataLayer.getInstance().getAssign()){
                if(assign.getInterviewerMail().equals(interviewerMail)&&assign.getCandidateMail().equals(candidateMail)){
                    flag=1;
                    for(Candidate candidate:DataLayer.getInstance().getCandidateList()){
                        if(candidate.getEmail().equals(candidateMail)){
                          int score =  interviewerView.nextStep(1,interviewerMail);
                          candidate.setMarks(score);
                           // interviewerView.nextStep(2);
                           interviewerView.nextStep(2,interviewerMail);
                        }
                    }
                }
        }
        if(flag==0){
            interviewerView.nextStep(3,interviewerMail);
        }
        
    }
   
}

package com.bala472.interviewpanel.assign;

import com.bala472.interviewpanel.datalayer.DataLayer;
import com.bala472.interviewpanel.model.Assign;
import com.bala472.interviewpanel.model.Candidate;
import com.bala472.interviewpanel.model.Interviwer;

public class AssignModel {
    private AssignView assignView;
    AssignModel(AssignView assignView){
        this.assignView=assignView;
    }
    public void addAssign(String interviewer,String candidate){
       int flag=0;
        for(Interviwer interviwerEmail: DataLayer.getInstance().getInterviwerList()){
            if(interviwerEmail.getEmail().equals(interviewer)){
                flag=1;
                break;
            }
        }
        if(flag==0){
            assignView.showAlert(0);
            return;
        }
        for(Candidate candidateEmail : DataLayer.getInstance().getCandidateList()){
            if(candidateEmail.getEmail().equals(candidate)){
                flag=2;
                break;
            }
        }
        if(flag==1){
            assignView.showAlert(2);
            return;
        }
       for(Assign check: DataLayer.getInstance().getAssign()) {
         if(check.getCandidateMail().equals(candidate)){
             assignView.showAlert(3);
             return;
         }
       }
       Assign assign = new Assign();
       assign.setCandidateMail(candidate);
       assign.setInterviewerMail(interviewer);
        DataLayer.getInstance().setAssign(assign);
        assignView.showAlert(4);
    }
}

package com.bala472.interviewpanel.candidate;

import com.bala472.interviewpanel.datalayer.DataLayer;
import com.bala472.interviewpanel.model.Candidate;

import java.util.List;

public class CandidateModel {
    private CandidateView candidateView;
    CandidateModel(CandidateView candidateView){
       this.candidateView = candidateView;
    }
    public void addCandidate(Candidate candidate){
        DataLayer.getInstance().setCandidateList(candidate);
        DataLayer.getInstance().setCandidateListJson();
    }
    public void candidateList(){
        candidateView.viewCandidateList( DataLayer.getInstance().getCandidateList());
    }
    public String result(String mail){
        if(DataLayer.getInstance().getResult()==null){
            return "Result not yet announced";
        }
       for(Candidate candidate : DataLayer.getInstance().getResult()) {
        if(candidate.getEmail().equals(mail)&&candidate.getMarks()>80){
            return "Congratulation you are selected";
        }
        if(candidate.getEmail().equals(mail)&&candidate.getMarks()<80){
            return "Thanks for attending the interview. Unfortunatly you are not eligible for next round. All the best ";
        }
       }
       return "Result not yet announced";
    }
}

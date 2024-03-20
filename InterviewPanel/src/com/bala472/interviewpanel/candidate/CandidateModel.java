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
    }
    public void candidateList(){
        candidateView.viewCandidateList( DataLayer.getInstance().getCandidateList());
    }
}

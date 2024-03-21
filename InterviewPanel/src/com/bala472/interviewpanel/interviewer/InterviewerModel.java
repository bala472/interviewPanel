package com.bala472.interviewpanel.interviewer;

import com.bala472.interviewpanel.datalayer.DataLayer;
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
}

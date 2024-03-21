package com.bala472.interviewpanel.interviewSetup;
import com.bala472.interviewpanel.candidate.CandidateView;
import com.bala472.interviewpanel.interviewer.InterviewerView;
public class InterviewSetupModel {
    private InterviewSetupView interviewSetupView;
    InterviewSetupModel(InterviewSetupView interviewSetupView){
        this.interviewSetupView=interviewSetupView;
    }
public void callCandidateView(){
    CandidateView candidateView = new CandidateView();
    candidateView.addCandidate();
    interviewSetupView.mainMenu();
}
public void viewCandidateList(){
        CandidateView candidateView= new CandidateView();
        candidateView.showCandidate();
        interviewSetupView.mainMenu();
}
public void callInterviewerView(){
    InterviewerView interviewerView = new InterviewerView();
    interviewerView.addinterviewer();
    interviewSetupView.mainMenu();
}
public void viewInterviwerList(){
    InterviewerView interviewerView= new InterviewerView();
    interviewerView.showInterviewer();
    interviewSetupView.mainMenu();
}
}

package com.bala472.interviewpanel.datalayer;

import com.bala472.interviewpanel.model.Candidate;
import com.bala472.interviewpanel.model.Interviwer;

import java.util.ArrayList;
import java.util.List;

public class DataLayer {
 private static DataLayer dataLayer;
 public static DataLayer getInstance(){
  if(dataLayer==null){
   dataLayer=new DataLayer();
  }
  return dataLayer;
 }
 private List<Candidate> candidateList = new ArrayList<>();
 private List<Interviwer> interviwerList = new ArrayList<>();
    public List<Candidate> getCandidateList() {
        return candidateList;
    }
    public void setCandidateList(Candidate candidate) {
        candidateList.add(candidate);
    }
    public List<Interviwer> getInterviwerList() {
        return interviwerList;
    }
    public void setInterviwerList(Interviwer interviwer) {
        interviwerList.add(interviwer);
    }
}

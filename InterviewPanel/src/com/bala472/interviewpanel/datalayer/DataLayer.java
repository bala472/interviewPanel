package com.bala472.interviewpanel.datalayer;

import com.bala472.interviewpanel.model.Candidate;

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
    public List<Candidate> getCandidateList() {
        return candidateList;
    }
    public void setCandidateList(Candidate candidate) {
        candidateList.add(candidate);
    }
}

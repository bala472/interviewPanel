package com.bala472.interviewpanel.datalayer;

import com.bala472.interviewpanel.model.Admin;
import com.bala472.interviewpanel.model.Assign;
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
 private List<Assign> assign = new ArrayList<>();
 private List<Candidate> result;
 private Admin admin;
/*  public Admin getAdmin(){
    this.admin.setUserName("bala");
    this.admin.setPassword("1234");
    return this.admin;
 }*/
    public void setResult(){
        result=new ArrayList<>(candidateList);
    }
    public List<Candidate> getResult(){
        return result;
    }

    public List<Assign> getAssign(){
        return assign;
    }
    public void setAssign(Assign assign){
        this.assign.add(assign);
    }
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

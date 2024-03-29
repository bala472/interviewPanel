package com.bala472.interviewpanel.datalayer;

import com.bala472.interviewpanel.model.Admin;
import com.bala472.interviewpanel.model.Assign;
import com.bala472.interviewpanel.model.Candidate;
import com.bala472.interviewpanel.model.Interviwer;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
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

    //Object Mapper

    ObjectMapper mapper = new ObjectMapper();

    public void setCandidateListJson(){
        if(new File("candidatelist.json").exists()){
            new File("candidatelist.json").delete();
        }
        try{
            mapper.writeValue(new File("candidatelist.json"),candidateList);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void loadCandidateListJson(){
        if(new File("candidatelist.json").exists()){
            if(new File("candidatelist.json").canRead()){
                try{
                    candidateList.addAll(mapper.readValue(new File("candidatelist.json"), new TypeReference<List<Candidate>>() {}));
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public void setInterviwerListJson(){
        if(new File("interviewerlist.json").exists()){
            new File("interviewerlist.json").delete();
        }
        try{
            mapper.writeValue(new File("interviewerlist.json"),interviwerList);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void loadInterviewerListJson(){
        if(new File("interviewerlist.json").exists()){
            if(new File("interviewerlist.json").canRead()){
                try{
                    interviwerList.addAll(mapper.readValue(new File("interviewerlist.json"), new TypeReference<List<Interviwer>>() {}));
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public void setAssignListJson(){
        if(new File("assignlist.json").exists()){
            new File("assignlist.json").delete();
        }
        try{
            mapper.writeValue(new File("assignlist.json"),assign);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void loadAssignListJson(){
        if(new File("assignlist.json").exists()){
            if(new File("assignlist.json").canRead()){
                try{
                    assign.addAll(mapper.readValue(new File("assignlist.json"), new TypeReference<List<Assign>>() {}));
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public void setResultJson(){
        if(new File("resultlist.json").exists()){
            new File("resultlist.json").delete();
        }
        try{
            mapper.writeValue(new File("resultlist.json"),result);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void loadResultJson(){
        if(new File("resultlist.json").exists()){
            if(new File("resultlist.json").canRead()){
                try{
                    result.addAll(mapper.readValue(new File("resultlist.json"), new TypeReference<List<Candidate>>() {}));
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

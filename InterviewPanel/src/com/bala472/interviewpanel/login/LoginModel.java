package com.bala472.interviewpanel.login;
import com.bala472.interviewpanel.candidate.CandidateView;
import com.bala472.interviewpanel.datalayer.*;
import com.bala472.interviewpanel.interviewer.InterviewerView;
import com.bala472.interviewpanel.model.Candidate;
import com.bala472.interviewpanel.model.Interviwer;

public class LoginModel {
private LoginView loginView;
public LoginModel(LoginView loginView){
    this.loginView= loginView;
}
    public void validateUser(String userName, String password) {
        
      /*  if(userName.equals(DataLayer.getInstance().getAdmin().getUserName())&&
                 password.equals(DataLayer.getInstance().getAdmin().getPassword())){
                    loginView.onSuccess();
                    return;
       }*/
       if(userName.equals("bala")&&
                 password.equals("1234")){
                    if(DataLayer.getInstance().getCandidateList().isEmpty())
                    DataLayer.getInstance().loadCandidateListJson();
                    if(DataLayer.getInstance().getInterviwerList().isEmpty())
                        DataLayer.getInstance().loadInterviewerListJson();
                    if(DataLayer.getInstance().getAssign().isEmpty())
                        DataLayer.getInstance().loadAssignListJson();
                   // if(DataLayer.getInstance().getResult()==null)
                    //    DataLayer.getInstance().loadResultJson();
                    loginView.onSuccess();
                    return;
       }
       for(Interviwer interview : DataLayer.getInstance().getInterviwerList() ){
        if(userName.equals(interview.getName()) && password.equals(interview.getPassword())){
            loginView.loginSucess(1);
            new CandidateView().showCandidate();
          new  InterviewerView().interviewerMainMenu(interview.getEmail());
            return;
        }
       }
       for(Candidate candidate:DataLayer.getInstance().getCandidateList()){
        if(userName.equals(candidate.getName())&&password.equals(candidate.getPassword())){
            loginView.loginSucess(2);
            new CandidateView().candidateMainMenu(candidate.getEmail());
            return;
        }
       }
        loginView.onLoginFailed("Invalid Username or Password");
       
    }
   /*  private boolean isValidUserName(String userName) {
        return userName.equals("bala")||userName.equals("zsgs");
    }
    private boolean isValidPassword(String userName, String password) {
        return (userName.equals("bala")&&password.equals("1234"))||(userName.equals("zsgs")&&password.equals("admin"));
    }*/

}

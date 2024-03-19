package com.bala472.interviewpanel.login;

public class LoginModel {
private LoginView loginView;
public LoginModel(LoginView loginView){
    this.loginView= loginView;
}
    public void validateUser(String userName, String password) {
        if (isValidUserName(userName)) {
            if (isValidPassword(userName,password)) {
                loginView.onSuccess();
            } else {
                loginView.onLoginFailed("Invalid password");
            }
        } else {
            loginView.onLoginFailed("Invalid User Name");
        }
    }
    private boolean isValidUserName(String userName) {
        return userName.equals("bala472")||userName.equals("zsgsAdmin");
    }
    private boolean isValidPassword(String userName, String password) {
        return (userName.equals("bala472")&&password.equals("123456789"))||(userName.equals("zsgsAdmin")&&password.equals("admin123"));
    }

}

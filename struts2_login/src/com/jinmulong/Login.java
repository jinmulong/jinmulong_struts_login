package com.jinmulong;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private  String username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private  String password;

    @Override
    public String execute() throws Exception {
        System.out.println("Validating login");
        if(!getUsername().equals("admin") || !getPassword().equals("admin")){
            addActionError("Invalid user name or password! Please try again!");
            return ERROR;
        }else{
            return SUCCESS;
        }
    }
}

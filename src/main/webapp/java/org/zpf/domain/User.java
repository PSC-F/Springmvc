package org.zpf.domain;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.io.Serializable;

public class User implements Serializable {

    public User() {
        super();
    }

    private String loginName;
    private String password;
    private String UserName;

    public User(String loginName, String password, String userName) {
        this.loginName = loginName;
        this.password = password;
        UserName = userName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return UserName;
    }
}

package org.zpf.domain;

import java.io.Serializable;
import java.util.Date;

public class UserRegister implements Serializable {
    private String loginName;
    private Date birthday;

    public UserRegister() {
        super();
    }

    public UserRegister(String loginName, Date birthday) {
        this.loginName = loginName;
        this.birthday = birthday;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

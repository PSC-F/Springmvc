package org.zpf.domain;

import java.io.Serializable;

public class UserForm implements Serializable {

    private String userName;
    private String sex;
    private Integer age;

    public UserForm() {
        super();
    }

    public UserForm(String userName, String sex, Integer age) {
        this.userName = userName;
        this.sex = sex;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "User [username=" + userName + ", sex=" + sex + ", age=" + age
                + "]";
    }
}

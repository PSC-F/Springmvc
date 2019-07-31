package org.zpf.domain;

import java.io.Serializable;
import java.util.List;

//Serializable作用:持久化对象
public class UserCheckBox implements Serializable {
    private boolean reader;
    private List<String> courses;

    public UserCheckBox() {
        super();
    }

    public UserCheckBox(boolean reader, List<String> courses) {
        this.reader = reader;
        this.courses = courses;
    }

    public boolean isReader() {
        return reader;
    }

    public void setReader(boolean reader) {
        this.reader = reader;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
}

package com.dht.bean;


import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

@ManagedBean
@Named(value = "surveyBean")
@RequestScoped

public class SurveyBean {
    private String name,gender,other,reason;
    private int year;
    private String[] languages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public SurveyBean(){
    }

    public String getResponse() {
        StringBuilder builder = new StringBuilder();
        if (this.name != null){
            builder.append(String.format("Ho ten: %s<br>",this.name));
            builder.append(String.format("Nam sinh: %d<br>",this.year));
            builder.append(String.format("Gioi tinh: %s<br>",this.gender));
        }
        return builder.toString();
    }
}

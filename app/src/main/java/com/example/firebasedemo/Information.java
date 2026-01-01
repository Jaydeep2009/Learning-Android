package com.example.firebasedemo;

public class Information {
    public String email;
    public String name;
    public Information(){
    }

    public Information(String email,String name){
        this.email=email;
        this.name=name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

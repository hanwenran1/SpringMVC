package com.vito.mvc.bean;

public class Doctor {
    private Integer id;

    private String name;

    private String password;

    public Doctor(){
        super();
        //TODO Auto-generated constructor stub
    }
    public Doctor(Integer Id,String Name,String Password){
        super();
        this.id=Id;
        this.name=Name;
        this.password=Password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}
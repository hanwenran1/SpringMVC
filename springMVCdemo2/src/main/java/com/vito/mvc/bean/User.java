package com.vito.mvc.bean;

public class User {
    private Integer id;

    private String role;

    private String sex;

    private String name;

    private String password;

    private String tel;

    private String sessionKey;

    private String openid;

    public User(){
        super();
        //TODO Auto-generated constructor stub
    }

    public User(Integer id, String role, String sex, String name, String password, String tel, String sessionKey, String openid) {
        super();
        this.id = id;
        this.role = role;
        this.sex = sex;
        this.name = name;
        this.password = password;
        this.tel = tel;
        this.sessionKey = sessionKey;
        this.openid = openid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey == null ? null : sessionKey.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }
}
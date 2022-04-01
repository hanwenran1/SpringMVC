package com.vito.mvc.bean;

public class Login {
    private Integer Id;

    private String Tel;

    private String Password;

    private String Session_key;

    private String Openid;

    public Login(){
        super();
        //TODO Auto-generated constructor stub
    }

    public Login(Integer id, String tel, String password,String session_key,String openid) {
        super();
        Id = id;
        Tel = tel;
        Password = password;
        Session_key = session_key;
        Openid = openid;

    }

    public String getSession_key() {
        return Session_key;
    }

    public void setSession_key(String session_key) {
        Session_key = session_key;
    }

    public String getOpenid() {
        return Openid;
    }

    public void setOpenid(String openid) {
        Openid = openid;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}

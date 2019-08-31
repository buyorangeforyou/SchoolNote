package com.ypi.bean;

public class Userinfo extends UserinfoKey {
    private String userPassword;

    private Integer userLevel;

    private String userNick;

    private Integer userNotes;

    public Userinfo (){}

    public Userinfo(String userPassword, Integer userLevel, String userNick, Integer userNotes) {
        this.userPassword = userPassword;
        this.userLevel = userLevel;
        this.userNick = userNick;
        this.userNotes = userNotes;
    }

    public Userinfo(Integer id, String userName, String userPassword, Integer userLevel, String userNick, Integer userNotes) {
        super(id, userName);
        this.userPassword = userPassword;
        this.userLevel = userLevel;
        this.userNick = userNick;
        this.userNotes = userNotes;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public Integer getUserNotes() {
        return userNotes;
    }

    public void setUserNotes(Integer userNotes) {
        this.userNotes = userNotes;
    }
}
package com.ypi.bean;

public class Notetalk {
    private Integer id;

    private String talkerAccount;

    private String talkerNick;

    private String talkBody;

    public Notetalk() {
    }

    public Notetalk(Integer id, String talkerAccount, String talkerNick, String talkBody) {
        this.id = id;
        this.talkerAccount = talkerAccount;
        this.talkerNick = talkerNick;
        this.talkBody = talkBody;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTalkerAccount() {
        return talkerAccount;
    }

    public void setTalkerAccount(String talkerAccount) {
        this.talkerAccount = talkerAccount;
    }

    public String getTalkerNick() {
        return talkerNick;
    }

    public void setTalkerNick(String talkerNick) {
        this.talkerNick = talkerNick;
    }

    public String getTalkBody() {
        return talkBody;
    }

    public void setTalkBody(String talkBody) {
        this.talkBody = talkBody;
    }
}
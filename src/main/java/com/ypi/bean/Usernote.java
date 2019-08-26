package com.ypi.bean;

import java.util.Date;

public class Usernote {
    private Integer id;

    private String noteTitle;

    private String noteBody;

    private Date noteTime;

    private Integer noteStatus;

    private Integer noteLevel;

    public Usernote() {
    }

    public Usernote(Integer id, String noteTitle, String noteBody, Date noteTime, Integer noteStatus, Integer noteLevel) {
        this.id = id;
        this.noteTitle = noteTitle;
        this.noteBody = noteBody;
        this.noteTime = noteTime;
        this.noteStatus = noteStatus;
        this.noteLevel = noteLevel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteBody() {
        return noteBody;
    }

    public void setNoteBody(String noteBody) {
        this.noteBody = noteBody;
    }

    public Date getNoteTime() {
        return noteTime;
    }

    public void setNoteTime(Date noteTime) {
        this.noteTime = noteTime;
    }

    public Integer getNoteStatus() {
        return noteStatus;
    }

    public void setNoteStatus(Integer noteStatus) {
        this.noteStatus = noteStatus;
    }

    public Integer getNoteLevel() {
        return noteLevel;
    }

    public void setNoteLevel(Integer noteLevel) {
        this.noteLevel = noteLevel;
    }
}
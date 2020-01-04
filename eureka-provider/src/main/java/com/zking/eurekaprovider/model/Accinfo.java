package com.zking.eurekaprovider.model;

import java.util.Date;

public class Accinfo {
    private Integer tAccid;

    private String tAccno;

    private String tAccname;

    private String tCname;

    private String tPhone;

    private String tPlatkey;

    private String tSummary;

    private String tOperno;

    private String tOpertime;

    private String tState;

    public Accinfo(Integer tAccid, String tAccno, String tAccname, String tCname, String tPhone, String tPlatkey, String tSummary, String tOperno, String tOpertime, String tState) {
        this.tAccid = tAccid;
        this.tAccno = tAccno;
        this.tAccname = tAccname;
        this.tCname = tCname;
        this.tPhone = tPhone;
        this.tPlatkey = tPlatkey;
        this.tSummary = tSummary;
        this.tOperno = tOperno;
        this.tOpertime = tOpertime;
        this.tState = tState;
    }

    public Accinfo() {
        super();
    }

    public Integer gettAccid() {
        return tAccid;
    }

    public void settAccid(Integer tAccid) {
        this.tAccid = tAccid;
    }

    public String gettAccno() {
        return tAccno;
    }

    public void settAccno(String tAccno) {
        this.tAccno = tAccno;
    }

    public String gettAccname() {
        return tAccname;
    }

    public void settAccname(String tAccname) {
        this.tAccname = tAccname;
    }

    public String gettCname() {
        return tCname;
    }

    public void settCname(String tCname) {
        this.tCname = tCname;
    }

    public String gettPhone() {
        return tPhone;
    }

    public void settPhone(String tPhone) {
        this.tPhone = tPhone;
    }

    public String gettPlatkey() {
        return tPlatkey;
    }

    public void settPlatkey(String tPlatkey) {
        this.tPlatkey = tPlatkey;
    }

    public String gettSummary() {
        return tSummary;
    }

    public void settSummary(String tSummary) {
        this.tSummary = tSummary;
    }

    public String gettOperno() {
        return tOperno;
    }

    public void settOperno(String tOperno) {
        this.tOperno = tOperno;
    }

    public String gettOpertime() {
        return tOpertime;
    }

    public void settOpertime(String tOpertime) {
        this.tOpertime = tOpertime;
    }

    public String gettState() {
        return tState;
    }

    public void settState(String tState) {
        this.tState = tState;
    }
}
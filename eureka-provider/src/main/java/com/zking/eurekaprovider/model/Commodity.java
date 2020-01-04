package com.zking.eurekaprovider.model;

import lombok.Data;

import java.util.Date;
@Data
public class  Commodity {
    private Integer tComid;

    private String tComname;

    private Double tComprice;

    private String tComremark;

    private String tComnodata;

    private Integer tState;

    private String tAmount;

    public Commodity(Integer tComid, String tComname, Double tComprice, String tComremark, String tComnodata, Integer tState, String tAmount) {
        this.tComid = tComid;
        this.tComname = tComname;
        this.tComprice = tComprice;
        this.tComremark = tComremark;
        this.tComnodata = tComnodata;
        this.tState = tState;
        this.tAmount = tAmount;
    }

    public Commodity() {
        super();
    }

    public Integer gettComid() {
        return tComid;
    }

    public void settComid(Integer tComid) {
        this.tComid = tComid;
    }

    public String gettComname() {
        return tComname;
    }

    public void settComname(String tComname) {
        this.tComname = tComname;
    }

    public Double gettComprice() {
        return tComprice;
    }

    public void settComprice(Double tComprice) {
        this.tComprice = tComprice;
    }

    public String gettComremark() {
        return tComremark;
    }

    public void settComremark(String tComremark) {
        this.tComremark = tComremark;
    }

    public String gettComnodata() {
        return tComnodata;
    }

    public void settComnodata(String tComnodata) {
        this.tComnodata = tComnodata;
    }

    public Integer gettState() {
        return tState;
    }

    public void settState(Integer tState) {
        this.tState = tState;
    }

    public String gettAmount() {
        return tAmount;
    }

    public void settAmount(String tAmount) {
        this.tAmount = tAmount;
    }
}
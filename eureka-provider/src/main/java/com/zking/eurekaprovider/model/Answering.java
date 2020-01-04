package com.zking.eurekaprovider.model;

import lombok.Data;

import java.util.Date;
@Data
public class Answering {
    private Long anid;

    private Integer antype;

    private Date createdata;

    private Integer aaction;

    private Long kid;

    private Long createid;

    private String answering;
    private User user;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Answering(Long anid, Integer antype, Date createdata, Integer aaction, Long kid, Long createid, String answering) {
        this.anid = anid;
        this.antype = antype;
        this.createdata = createdata;
        this.aaction = aaction;
        this.kid = kid;
        this.createid = createid;
        this.answering = answering;
    }

    public Answering() {
        super();
    }

    public Long getAnid() {
        return anid;
    }

    public void setAnid(Long anid) {
        this.anid = anid;
    }

    public Integer getAntype() {
        return antype;
    }

    public void setAntype(Integer antype) {
        this.antype = antype;
    }

    public Date getCreatedata() {
        return createdata;
    }

    public void setCreatedata(Date createdata) {
        this.createdata = createdata;
    }

    public Integer getAaction() {
        return aaction;
    }

    public void setAaction(Integer aaction) {
        this.aaction = aaction;
    }

    public Long getKid() {
        return kid;
    }

    public void setKid(Long kid) {
        this.kid = kid;
    }

    public Long getCreateid() {
        return createid;
    }

    public void setCreateid(Long createid) {
        this.createid = createid;
    }

    public String getAnswering() {
        return answering;
    }

    public void setAnswering(String answering) {
        this.answering = answering;
    }
}
package com.zking.eurekaprovideranzlyze.model;

import java.util.Date;

public class Attention {
    private Integer attentionId;

    private Integer cid;

    private String state;

    private Date affirmtime;

    private Date canceltime;

    public Attention(Integer attentionId, Integer cid, String state, Date affirmtime, Date canceltime) {
        this.attentionId = attentionId;
        this.cid = cid;
        this.state = state;
        this.affirmtime = affirmtime;
        this.canceltime = canceltime;
    }

    public Attention() {
        super();
    }

    public Integer getAttentionId() {
        return attentionId;
    }

    public void setAttentionId(Integer attentionId) {
        this.attentionId = attentionId;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getAffirmtime() {
        return affirmtime;
    }

    public void setAffirmtime(Date affirmtime) {
        this.affirmtime = affirmtime;
    }

    public Date getCanceltime() {
        return canceltime;
    }

    public void setCanceltime(Date canceltime) {
        this.canceltime = canceltime;
    }
}
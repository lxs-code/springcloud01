package com.zking.eurekaprovidershh.model;

public class Organization {
    private Integer orgaid;

    private String organame;

    private String  orgadate;

    private String orgastate;

    private String ordadivide;

    public Organization(Integer orgaid, String organame, String orgadate, String orgastate, String ordadivide) {
        this.orgaid = orgaid;
        this.organame = organame;
        this.orgadate = orgadate;
        this.orgastate = orgastate;
        this.ordadivide = ordadivide;
    }

    public Organization() {
        super();
    }

    public Integer getOrgaid() {
        return orgaid;
    }

    public void setOrgaid(Integer orgaid) {
        this.orgaid = orgaid;
    }

    public String getOrganame() {
        return organame;
    }

    public void setOrganame(String organame) {
        this.organame = organame;
    }

    public String getOrgadate() {
        return orgadate;
    }

    public void setOrgadate(String orgadate) {
        this.orgadate = orgadate;
    }

    public String getOrgastate() {
        return orgastate;
    }

    public void setOrgastate(String orgastate) {
        this.orgastate = orgastate;
    }

    public String getOrdadivide() {
        return ordadivide;
    }

    public void setOrdadivide(String ordadivide) {
        this.ordadivide = ordadivide;
    }
}
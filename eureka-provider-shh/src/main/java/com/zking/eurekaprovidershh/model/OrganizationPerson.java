package com.zking.eurekaprovidershh.model;

public class OrganizationPerson {
    private Integer orpId;

    private String orpName;

    private Integer orpOrgid;

    private String orptypes;

    private String orpDate;

    private Integer orptype;

    public OrganizationPerson(Integer orpId, String orpName, Integer orpOrgid, String orpDate,Integer orptype) {
        this.orpId = orpId;
        this.orpName = orpName;
        this.orpOrgid = orpOrgid;
        this.orpDate = orpDate;
        this.orptype=orptype;
    }

    public OrganizationPerson() {
        super();
    }

    public Integer getOrpId() {
        return orpId;
    }

    public void setOrpId(Integer orpId) {
        this.orpId = orpId;
    }

    public String getOrpName() {
        return orpName;
    }

    public void setOrpName(String orpName) {
        this.orpName = orpName;
    }

    public Integer getOrpOrgid() {
        return orpOrgid;
    }

    public void setOrpOrgid(Integer orpOrgid) {
        this.orpOrgid = orpOrgid;
    }

    public String getOrptypes() {
        return orptypes;
    }

    public void setOrptypes(String orptypes) {
        this.orptypes = orptypes;
    }

    public String getOrpDate() {
        return orpDate;
    }

    public void setOrpDate(String orpDate) {
        this.orpDate = orpDate;
    }

    public Integer getorptype() {
        return orptype;
    }

    public void setorptype(Integer orpDate) {
        this.orptype = orptype;
    }
}
package com.zking.eurekaprovideranzlyze.model;

import java.util.Date;

public class MenuAnalysis {
    private Integer mid;

    private Integer cid;

    private String permissionName;

    private Date menutime;

    public MenuAnalysis(Integer mid, Integer cid, String permissionName, Date menutime) {
        this.mid = mid;
        this.cid = cid;
        this.permissionName = permissionName;
        this.menutime = menutime;
    }

    public MenuAnalysis() {
        super();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public Date getMenutime() {
        return menutime;
    }

    public void setMenutime(Date menutime) {
        this.menutime = menutime;
    }
}
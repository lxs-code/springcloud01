package com.zking.eurekaprovideranzlyze.model;

import java.util.Date;

public class Client {
    private Integer cid;

    private String cname;

    private String cpassword;

    private String sex;

    private String phone;

    private Long bank;

    private Date banktime;

    private Date regtime;

    private Long integral;

    public Client(Integer cid, String cname, String cpassword, String sex, String phone, Long bank, Long integral, Date banktime, Date regtime) {
        this.cid = cid;
        this.cname = cname;
        this.cpassword = cpassword;
        this.sex = sex;
        this.phone = phone;
        this.bank = bank;
        this.integral = integral;
        this.banktime = banktime;
        this.regtime = regtime;
    }

    public Client() {
        super();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getBank() {
        return bank;
    }

    public void setBank(Long bank) {
        this.bank = bank;
    }

    public Long getIntegral() {
        return integral;
    }

    public void setIntegral(Long integral) {
        this.integral = integral;
    }

    public Date getBanktime() {
        return banktime;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public void setBanktime(Date banktime) {
        this.banktime = banktime;
    }
}

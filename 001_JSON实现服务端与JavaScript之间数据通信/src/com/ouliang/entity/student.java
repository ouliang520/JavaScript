package com.ouliang.entity;

public class student {
    private String sid;
    private String sname;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public student(String sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    public student() {
    }
}

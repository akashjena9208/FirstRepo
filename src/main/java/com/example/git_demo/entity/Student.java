package com.example.git_demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int sid;
    private String sname;
    private long pno;
    private int smark;


    public int getSid() {

        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public long getPno() {

        return pno;
    }

    public void setPno(long pno) {

        this.pno = pno;
    }

    public int getSmark() {

        return smark;
    }

    public void setSmark(int smark) {

        this.smark = smark;
    }
}

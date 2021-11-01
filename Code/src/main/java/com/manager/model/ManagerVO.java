package com.manager.model;

import java.sql.Timestamp;

public class ManagerVO implements java.io.Serializable {
    private String MG_no;
    private String MG_email;
    private String MG_password;
    private String MG_name;
    private String MG_title;
    private String Line_id;
    private String Line_url;
    private String MG_spec;
    private Timestamp MG_createtime;
    private Timestamp MG_updatetime;


    public String getMG_no() {
        return MG_no;
    }

    public void setMG_no(String MG_no) {
        this.MG_no = MG_no;
    }

    public String getMG_email() {
        return MG_email;
    }

    public void setMG_email(String MG_email) {
        this.MG_email = MG_email;
    }

    public String getMG_password() {
        return MG_password;
    }

    public void setMG_password(String MG_password) {
        this.MG_password = MG_password;
    }

    public String getMG_name() {
        return MG_name;
    }

    public void setMG_name(String MG_name) {
        this.MG_name = MG_name;
    }

    public String getMG_title() {
        return MG_title;
    }

    public void setMG_title(String MG_title) {
        this.MG_title = MG_title;
    }

    public String getLine_id() {
        return Line_id;
    }

    public void setLine_id(String Line_id) {
        this.Line_id = Line_id;
    }

    public String getLine_url() {
        return Line_url;
    }

    public void setLine_url(String Line_url) {
        this.Line_url = Line_url;
    }

    public String getMG_spec() {
        return MG_spec;
    }

    public void setMG_spec(String MG_spec) {
        this.MG_spec = MG_spec;
    }

    public Timestamp getMG_createtime() {
        return MG_createtime;
    }

    public void setMG_createtime(Timestamp MG_createtime) {
        this.MG_createtime = MG_createtime;
    }

    public Timestamp getMG_updatetime() {
        return MG_updatetime;
    }

    public void setMG_updatetime(Timestamp MG_updatetime) {
        this.MG_updatetime = MG_updatetime;
    }

}
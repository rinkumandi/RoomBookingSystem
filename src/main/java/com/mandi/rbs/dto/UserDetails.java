package com.mandi.rbs.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserDetails {
    @Id
    @GeneratedValue
    @Column(name = "userId")
    private String userId;
    private String fname;
    private String lname;
    private Date dob;
    private String password;
    private String user_type;

    // There must be a default constructor in entity class
    public UserDetails() {
    }

    public UserDetails(String userId, String fname, String lname, Date dob, String password, String user_type) {
        super();
        this.userId = userId;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.password = password;
        this.user_type = user_type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    @Override
    public String toString() {
        return "UserDetails [userId=" + userId + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob
                + ", password=" + password + ", user_type=" + user_type + "]";
    }

}

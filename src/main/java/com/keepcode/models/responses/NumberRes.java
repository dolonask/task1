package com.keepcode.models.responses;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class NumberRes {
    private String number;
    private Long country;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date updated_at;
    private String data_humans;
    private String full_number;
    private String country_text;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date maxdate;
    private String status;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getCountry() {
        return country;
    }

    public void setCountry(Long country) {
        this.country = country;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getData_humans() {
        return data_humans;
    }

    public void setData_humans(String data_humans) {
        this.data_humans = data_humans;
    }

    public String getFull_number() {
        return full_number;
    }

    public void setFull_number(String full_number) {
        this.full_number = full_number;
    }

    public String getCountry_text() {
        return country_text;
    }

    public void setCountry_text(String country_text) {
        this.country_text = country_text;
    }

    public Date getMaxdate() {
        return maxdate;
    }

    public void setMaxdate(Date maxdate) {
        this.maxdate = maxdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

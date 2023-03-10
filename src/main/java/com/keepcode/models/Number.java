package com.keepcode.models;

import java.util.Date;

public class Number {

    private String number;
    private Date updatedAt;
    private String dataHumans;
    private String fullNumber;
    private Date maxDate;
    private String status;

    public Number(String number, Date updatedAt, String dataHumans, String fullNumber, Date maxDate, String status) {
        this.number = number;
        this.updatedAt = updatedAt;
        this.dataHumans = dataHumans;
        this.fullNumber = fullNumber;
        this.maxDate = maxDate;
        this.status = status;
    }

    public Number() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDataHumans() {
        return dataHumans;
    }

    public void setDataHumans(String dataHumans) {
        this.dataHumans = dataHumans;
    }

    public String getFullNumber() {
        return fullNumber;
    }

    public void setFullNumber(String fullNumber) {
        this.fullNumber = fullNumber;
    }

    public Date getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(Date maxDate) {
        this.maxDate = maxDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

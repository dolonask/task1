package com.keepcode.models;

public class Country {
    private Long countryId;
    private String countryText;

    public Country(Long countryId, String countryText) {
        this.countryId = countryId;
        this.countryText = countryText;
    }

    public Country() {
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getCountryText() {
        return countryText;
    }

    public void setCountryText(String countryText) {
        this.countryText = countryText;
    }
}

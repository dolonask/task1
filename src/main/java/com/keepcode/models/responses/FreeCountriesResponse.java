package com.keepcode.models.responses;

import java.util.List;

public class FreeCountriesResponse {
    private int response;
    private List<CountryRes> countries;

    public int getResponse() {
        return response;
    }

    public void setResponse(int response) {
        this.response = response;
    }

    public List<CountryRes> getCountries() {
        return countries;
    }

    public void setCountries(List<CountryRes> countries) {
        this.countries = countries;
    }
}

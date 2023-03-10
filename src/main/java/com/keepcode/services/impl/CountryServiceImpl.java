package com.keepcode.services.impl;

import com.keepcode.mappers.impl.CountryMapperImpl;
import com.keepcode.models.Country;
import com.keepcode.services.CountryService;
import com.keepcode.services.HttpService;

import java.util.List;

public class CountryServiceImpl implements CountryService {

    private final HttpService httpService;

    public CountryServiceImpl(HttpService httpService) {
        this.httpService = httpService;
    }


    public List<Country> getFreeCountryList() {


        return httpService.getCountries(new CountryMapperImpl());
    }
}

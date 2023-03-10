package com.keepcode.services.impl;

import com.keepcode.mappers.impl.NumberMapperImpl;
import com.keepcode.models.Number;
import com.keepcode.services.HttpService;
import com.keepcode.services.NumberService;

import java.util.List;

public class NumberServiceImpl implements NumberService {

    private final HttpService httpService;

    public NumberServiceImpl(HttpService httpService) {
        this.httpService = httpService;
    }

    public List<Number> getNumberByCountry(Long countryId){
        return httpService.getNumbersByCountryId(countryId, new NumberMapperImpl());
    }
}

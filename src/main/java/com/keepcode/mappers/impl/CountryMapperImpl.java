package com.keepcode.mappers.impl;

import com.keepcode.mappers.CountryMapper;
import com.keepcode.models.Country;
import com.keepcode.models.responses.CountryRes;
import com.keepcode.models.responses.FreeCountriesResponse;

import java.util.List;
import java.util.stream.Collectors;

public class CountryMapperImpl implements CountryMapper {

    public Country countryResToCountry(CountryRes countryRes) {
        return null;
    }

    public List<Country> responseToCountries(FreeCountriesResponse response) {
        return response.getCountries()
                .stream()
                .map(x-> new Country(x.getCountry(), x.getCountry_text()))
                .collect(Collectors.toList());
    }
}

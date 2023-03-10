package com.keepcode.services;

import com.keepcode.mappers.CountryMapper;
import com.keepcode.mappers.NumberMapper;
import com.keepcode.models.Country;
import com.keepcode.models.Number;

import java.util.List;

public interface HttpService {


    List<Country> getCountries(CountryMapper countryMapper);

    List<Number> getNumbersByCountryId(Long countryId, NumberMapper numberMapper);
}

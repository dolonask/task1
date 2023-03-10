package com.keepcode.mappers;

import com.keepcode.mappers.impl.CountryMapperImpl;
import com.keepcode.models.Country;
import com.keepcode.models.responses.CountryRes;
import com.keepcode.models.responses.FreeCountriesResponse;

import java.util.List;

public interface CountryMapper {

    CountryMapper INSTANCE = new CountryMapperImpl();

    Country countryResToCountry(CountryRes countryRes);

    List<Country> responseToCountries(FreeCountriesResponse response);


}

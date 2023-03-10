package com.keepcode;

import com.keepcode.models.Country;
import com.keepcode.services.CountryService;
import com.keepcode.services.NumberService;
import com.keepcode.services.impl.CountryServiceImpl;
import com.keepcode.services.impl.HttpServiceImpl;
import com.keepcode.services.impl.NumberServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        CountryService countryService = new CountryServiceImpl(new HttpServiceImpl());
        NumberService numberService = new NumberServiceImpl(new HttpServiceImpl());

        List<Country> countries = countryService.getFreeCountryList();

        Map<String, List<String>> countriesAndNumbers = new HashMap<>();

        countries.forEach(
                country -> {
                    List<String> numbers = numberService.getNumberByCountry(country.getCountryId())
                            .stream()
                            .map(x->x.getNumber())
                            .collect(Collectors.toList());
                    countriesAndNumbers.put(country.getCountryText(),numbers);
                }
        );

        System.out.println(countriesAndNumbers);




    }
}

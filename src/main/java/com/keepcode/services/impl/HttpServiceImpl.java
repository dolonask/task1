package com.keepcode.services.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keepcode.mappers.CountryMapper;
import com.keepcode.mappers.NumberMapper;
import com.keepcode.models.Country;
import com.keepcode.models.Number;
import com.keepcode.models.responses.FreeCountriesResponse;
import com.keepcode.models.responses.PhoneListResponse;
import com.keepcode.services.HttpService;
import com.squareup.okhttp.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class HttpServiceImpl implements HttpService {

    private final OkHttpClient httpClient = new OkHttpClient();
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final Properties properties;

    public HttpServiceImpl() {
        this.properties = new Properties();
        try {
            InputStream a = getClass().getClassLoader().getResourceAsStream("app.properties");
            properties.load(a);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public List<Country> getCountries(CountryMapper countryMapper) {

        List<Country> countries = new ArrayList<>();


        Request request = new Request.Builder()
                .url(properties.getProperty("base_url")+properties.getProperty("countries"))
                .build();

        Call call = httpClient.newCall(request);

        try {
            Response response = call.execute();
            FreeCountriesResponse freeCountriesResponse  = objectMapper.readValue(response.body().string(), FreeCountriesResponse.class);

            if (freeCountriesResponse.getResponse() == 1){
                countries = countryMapper.responseToCountries(freeCountriesResponse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return countries;
    }

    @Override
    public List<Number> getNumbersByCountryId(Long countryId, NumberMapper numberMapper) {
        List<Number> numbers = new ArrayList<>();

        Request request = new Request.Builder()
                .url(HttpUrl
                        .parse(properties.getProperty("base_url") + properties.getProperty("numbers")).newBuilder()
                        .addQueryParameter("country", String.valueOf(countryId))
                        .build()
                        .toString()
                )
                .build();

        Call call = httpClient.newCall(request);
        try {
            Response response = call.execute();
            PhoneListResponse phoneListResponse  = objectMapper.readValue(response.body().string(), PhoneListResponse.class);

            if (phoneListResponse.getResponse() == 1){
                numbers = numberMapper.responseToNumbers(phoneListResponse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return numbers;
    }
}

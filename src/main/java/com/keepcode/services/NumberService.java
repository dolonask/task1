package com.keepcode.services;

import com.keepcode.models.Number;

import java.util.List;

public interface NumberService {

    List<Number> getNumberByCountry(Long countryId);


}

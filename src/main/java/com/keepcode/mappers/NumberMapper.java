package com.keepcode.mappers;

import com.keepcode.mappers.impl.NumberMapperImpl;
import com.keepcode.models.Number;
import com.keepcode.models.responses.PhoneListResponse;

import java.util.List;

public interface NumberMapper {

    NumberMapper INSTANCE = new NumberMapperImpl();


    List<Number> responseToNumbers(PhoneListResponse phoneListResponse);
}

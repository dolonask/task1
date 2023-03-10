package com.keepcode.mappers.impl;

import com.keepcode.mappers.NumberMapper;
import com.keepcode.models.Number;
import com.keepcode.models.responses.PhoneListResponse;

import java.util.List;
import java.util.stream.Collectors;

public class NumberMapperImpl implements NumberMapper {
    @Override
    public List<Number> responseToNumbers(PhoneListResponse phoneListResponse) {
        return phoneListResponse.getNumbers()
                .stream()
                .map(x->{
                    Number number = new Number();
                    number.setDataHumans(x.getData_humans());
                    number.setFullNumber(x.getFull_number());
                    number.setMaxDate(x.getMaxdate());
                    number.setStatus(x.getStatus());
                    number.setUpdatedAt(x.getUpdated_at());
                    number.setNumber(x.getNumber());
                    return number;
                })
                .collect(Collectors.toList());
    }
}

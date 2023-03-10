package com.keepcode.models.responses;

import java.util.List;

public class PhoneListResponse {

    private int response;
    private List<NumberRes> numbers;

    public int getResponse() {
        return response;
    }

    public void setResponse(int response) {
        this.response = response;
    }

    public List<NumberRes> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<NumberRes> numbers) {
        this.numbers = numbers;
    }
}

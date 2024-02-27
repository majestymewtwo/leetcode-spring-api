package com.example.leetcodespringapi.dto.response;

import java.util.List;

public class Response {
    private Data data;
    private List<Error> errors;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }
}

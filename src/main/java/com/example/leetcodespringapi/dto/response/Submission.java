package com.example.leetcodespringapi.dto.response;

import com.example.leetcodespringapi.dto.response.Stat;

public class Submission extends Stat {
    private Integer submissions;

    public Integer getSubmissions() {
        return submissions;
    }

    public void setSubmissions(Integer submissions) {
        this.submissions = submissions;
    }
}

package com.example.leetcodespringapi.dto.response;

import java.util.List;

public class SubmissionStats {
    private List<Submission> acSubmissionNum;
    public List<Submission> totalSubmissionNum;

    public List<Submission> getAcSubmissionNum() {
        return acSubmissionNum;
    }

    public void setAcSubmissionNum(List<Submission> acSubmissionNum) {
        this.acSubmissionNum = acSubmissionNum;
    }

    public List<Submission> getTotalSubmissionNum() {
        return totalSubmissionNum;
    }

    public void setTotalSubmissionNum(List<Submission> totalSubmissionNum) {
        this.totalSubmissionNum = totalSubmissionNum;
    }
}

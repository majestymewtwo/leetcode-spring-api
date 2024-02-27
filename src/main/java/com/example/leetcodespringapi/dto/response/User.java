package com.example.leetcodespringapi.dto.response;

public class User {
    private Contributions contributions;
    private Profile profile;
    private String submissionCalendar;
    private SubmissionStats submissionStats;

    public Contributions getContributions() {
        return contributions;
    }

    public void setContributions(Contributions contributions) {
        this.contributions = contributions;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getSubmissionCalendar() {
        return submissionCalendar;
    }

    public void setSubmissionCalendar(String submissionCalendar) {
        this.submissionCalendar = submissionCalendar;
    }

    public SubmissionStats getSubmissionStats() {
        return submissionStats;
    }

    public void setSubmissionStats(SubmissionStats submissionStats) {
        this.submissionStats = submissionStats;
    }
}

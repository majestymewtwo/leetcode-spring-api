package com.example.leetcodespringapi.dto.response;

import java.util.List;

public class Data {
    private List<Stat> allQuestionsCount;
    private User matchedUser;

    public List<Stat> getAllQuestionsCount() {
        return allQuestionsCount;
    }

    public void setAllQuestionsCount(List<Stat> allQuestionsCount) {
        this.allQuestionsCount = allQuestionsCount;
    }

    public User getMatchedUser() {
        return matchedUser;
    }

    public void setMatchedUser(User matchedUser) {
        this.matchedUser = matchedUser;
    }
}

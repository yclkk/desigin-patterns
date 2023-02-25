package com.zyc.chapterThree.sixteen;

public class AlertRule {
    public ApiRule getMatechedRule(String api) {
        return new ApiRule(api);
    }
}

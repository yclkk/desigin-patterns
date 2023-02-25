package com.zyc.chapterThree.sixteen;

public class ApiRule {
    public ApiRule(String api) {
    }

    public long getMaxTps() {
        return 1;
    }

    public long getErrorCount() {
        return 1;
    }

    public long getTimeoutCount() {
        return 1;
    }
}

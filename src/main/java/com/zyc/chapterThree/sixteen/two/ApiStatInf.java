package com.zyc.chapterThree.sixteen.two;

public class ApiStatInf {
    private String api;

    private long requsetCount;

    private long errorCount;

    private long durationOfSecond;

    private long timeoutCount;

    public ApiStatInf() {
    }

    public ApiStatInf(String api, long requsetCount, long errorCount, long durationOfSecond) {
        this.api = api;
        this.requsetCount = requsetCount;
        this.errorCount = errorCount;
        this.durationOfSecond = durationOfSecond;
    }

    public ApiStatInf(String api, long requsetCount, long errorCount, long durationOfSecond, long timeoutCount) {
        this.api = api;
        this.requsetCount = requsetCount;
        this.errorCount = errorCount;
        this.durationOfSecond = durationOfSecond;
        this.timeoutCount = timeoutCount;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public long getRequsetCount() {
        return requsetCount;
    }

    public void setRequsetCount(long requsetCount) {
        this.requsetCount = requsetCount;
    }

    public long getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(long errorCount) {
        this.errorCount = errorCount;
    }

    public long getDurationOfSecond() {
        return durationOfSecond;
    }

    public void setDurationOfSecond(long durationOfSecond) {
        this.durationOfSecond = durationOfSecond;
    }


    public long getTimeoutCount() {
        return timeoutCount;
    }

    public void setTimeoutCount(long timeoutCount) {
        this.timeoutCount = timeoutCount;
    }
}

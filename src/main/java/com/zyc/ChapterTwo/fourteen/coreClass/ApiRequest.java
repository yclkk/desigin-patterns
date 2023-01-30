package com.zyc.ChapterTwo.fourteen.coreClass;

/**
 * 核心类之一ApiRequset
 * 1. 将 token、AppID、时间戳拼接到 URL 中，形成新的 URL；
 * 2. 解析 URL，得到 token、AppID、时间戳等信息。
 */
public class ApiRequest {
    private String baseUrl;

    private String token;

    private String appId;

    private long timeStamp;

    public ApiRequest(String baseUrl, String token, String appId, long timeStamp) {
        this.baseUrl = baseUrl;
        this.token = token;
        this.appId = appId;
        this.timeStamp = timeStamp;
    }

    public static ApiRequest createFromUrl(String url) {
        return null;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getToken() {
        return token;
    }

    public String getAppId() {
        return appId;
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}

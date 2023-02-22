package com.zyc.ChapterTwo.Thirteen;

/**
 * 虽然需求描述中，我们都是以 URL 来代指接口请求，但是，接口请求并不一定是以 URL
 * 的形式来表达，还有可能是 dubbo RPC 等其他形式。为了让这个类更加通用，命名更加贴
 * 切，我们接下来把它命名为 ApiRequest。
 */
public class ApiRequest {
    private String baseUrl;

    private String appId;

    private String token;

    private long timeStamp;

    public ApiRequest(String baseUrl, String appId, String token, long timeStamp) {
        this.baseUrl = baseUrl;
        this.appId = appId;
        this.token = token;
        this.timeStamp = timeStamp;
    }

    public static ApiRequest createFromFullUrl(String url) {
        return null;
    }

    public String getBaseUrl() {
        return null;
    }

    public String getAppId() {
        return null;
    }

    public String getToken() {
        return null;
    }

    public long getTimeStamp() {
        return Long.valueOf(0);
    }
}

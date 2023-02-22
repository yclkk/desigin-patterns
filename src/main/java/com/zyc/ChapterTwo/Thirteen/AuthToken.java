package com.zyc.ChapterTwo.Thirteen;

import java.util.Map;


public class AuthToken {
    private static final long DEFAULT_EXPIRED_TIME_INTERVAL = 1 * 60 * 1000;

    /*
     第一个细节告诉我们，从业务模型上来说，不应该属于这个类的属性和方法，不应该被放到
    这个类里。比如 URL、AppID 这些信息，从业务模型上来说，不应该属于 AuthToken，
    所以我们不应该放到这个类中
     */
    private String token;

    private long createTime;

    private long expiredTimeInterval = DEFAULT_EXPIRED_TIME_INTERVAL;

    public AuthToken(String token, long createTime) {
        this.token = token;
        this.createTime = createTime;
    }

    public AuthToken(String token, long createTime, long expiredTimeInterval) {
        this.token = token;
        this.createTime = createTime;
        this.expiredTimeInterval = expiredTimeInterval;
    }

    public AuthToken create(String baseUrl, long createTime, Map<String, Object> params){
        return null;
    }
    public String getToken() {
        return null;
    }

    public boolean isExpired() {
        return false;
    }

    public boolean match(AuthToken authToken) {
        return true;
    }
}























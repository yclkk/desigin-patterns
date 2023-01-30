package com.zyc.ChapterTwo.fourteen.coreClass;

import java.util.Map;

/**
 * 核心类之一：AuthToken
 * 四个功能点：
 *  1. 把 URL、AppID、密码、时间戳拼接为一个字符串；
 *  2. 对字符串通过加密算法加密生成 token；
 *  3. 根据时间戳判断 token 是否过期失效；
 *  4. 验证两个 token 是否匹配。
 */
public class AuthToken {
    private static final long DEFAULT_EXPIRED_TIME_INTERVAL = 1 * 60 * 1000;

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

    /**
     *
     * @param baseUrl
     * @param createTime
     * @param params:id、AppId、密码
     * @return
     */
    public static AuthToken create(String baseUrl, long createTime, Map<String, String> params) {
        return null;
    }

    public String getToken() {
        return null;
    }

    public boolean isExpired() {
        return true;
    }

    public boolean match(AuthToken authToken) {
        return true;
    }


}

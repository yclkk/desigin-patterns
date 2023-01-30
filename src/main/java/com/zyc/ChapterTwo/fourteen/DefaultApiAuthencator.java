package com.zyc.ChapterTwo.fourteen;

import com.zyc.ChapterTwo.fourteen.coreClass.ApiRequest;
import com.zyc.ChapterTwo.fourteen.coreClass.AuthToken;
import com.zyc.ChapterTwo.fourteen.coreClass.CredentialStorage;

import java.util.HashMap;
import java.util.Map;

public class DefaultApiAuthencator implements ApiAuthencator{


    private CredentialStorage credentialStorage;

    public DefaultApiAuthencator() {
        this.credentialStorage = new MysqlCredentialStorage();
    }
    public DefaultApiAuthencator(CredentialStorage credentialStorage) {
        this.credentialStorage = credentialStorage;
    }

    @Override
    public void auth(String url) {
        ApiRequest apiRequest = ApiRequest.createFromUrl(url);
        auth(apiRequest);

    }

    @Override
    public void auth(ApiRequest apiRequest) {
        String appId = apiRequest.getAppId();
        String baseUrl = apiRequest.getBaseUrl();
        String token = apiRequest.getToken();
        long createTime = apiRequest.getTimeStamp();
        AuthToken clientToken = new AuthToken(token, createTime);
        if (clientToken.isExpired()) {
            throw new RuntimeException("clientToken is expired");
        }

        Map<String, String> params = new HashMap<>();
        params.put("id", "id");
        params.put("appId", "appId");
        params.put("password", "password");
        AuthToken serverToken = AuthToken.create(baseUrl,createTime, params);
        if (!serverToken.match(clientToken)) {
            throw new RuntimeException("Token verfied is failed");
        }
    }
}

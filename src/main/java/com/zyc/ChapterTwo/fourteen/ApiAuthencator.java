package com.zyc.ChapterTwo.fourteen;

import com.zyc.ChapterTwo.fourteen.coreClass.ApiRequest;

public interface ApiAuthencator {
    void auth(String url);
    void auth(ApiRequest apiRequest);
}

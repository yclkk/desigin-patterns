package com.zyc.ChapterTwo.Thirteen.inter;

import com.zyc.ChapterTwo.Thirteen.ApiRequest;

public interface ApiAuthencator {
    void auth(String url);

    void auth(ApiRequest apiRequest);
}

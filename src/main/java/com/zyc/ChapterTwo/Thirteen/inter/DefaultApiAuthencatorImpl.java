package com.zyc.ChapterTwo.Thirteen.inter;

import com.zyc.ChapterTwo.Thirteen.ApiRequest;
import com.zyc.ChapterTwo.Thirteen.CredentialStorage;

public class DefaultApiAuthencatorImpl implements ApiAuthencator{

    private CredentialStorage credentialStorage;

    public DefaultApiAuthencatorImpl(CredentialStorage credentialStorage) {
        this.credentialStorage = credentialStorage;
    }

    @Override
    public void auth(String url) {

    }

    @Override
    public void auth(ApiRequest apiRequest) {

    }
}

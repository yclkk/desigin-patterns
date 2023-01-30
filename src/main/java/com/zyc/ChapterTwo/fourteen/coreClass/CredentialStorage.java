package com.zyc.ChapterTwo.fourteen.coreClass;

/**
 * 核心类之一CredentialStorgae
 * 1. 从存储中取出 AppID 和对应的密码
 */
public interface CredentialStorage {
    public String getPasswordByAppId(String appid);
}

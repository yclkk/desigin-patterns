package com.zyc.ChapterTwo.night;

import java.awt.*;

public class AliyunImageStoreImpl implements ImageStore{
    @Override
    public String upload(Image image, String bucketName) {
        craeteBucketIfNotExisting(bucketName);
        String token = generateAccessToken();
        // 上传图片到阿里云
        // 返回图片存储在阿里云上的地址(url)
        return null;
    }

    @Override
    public Image download(String url) {
        String token = generateAccessToken();
        // 从阿里云下载图片
        return null;
    }

    private void craeteBucketIfNotExisting(String bucketName) {
        // 创建 bucket 的代码逻辑
        // 失败会抛出异常
    }
    private String generateAccessToken() {
        // 根据 accesskey/secrectkey 等生成 access token
        return null;
    }
}

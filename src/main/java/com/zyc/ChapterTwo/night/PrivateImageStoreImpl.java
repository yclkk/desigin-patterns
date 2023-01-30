package com.zyc.ChapterTwo.night;

import java.awt.*;

public class PrivateImageStoreImpl implements ImageStore{


    /**
     * 私有云不需要token
     * @param image
     * @param bucketName
     * @return
     */
    @Override
    public String upload(Image image, String bucketName) {
        craeteBucketIfNotExisting(bucketName);
        // 上传图片到阿里云
        // 返回图片存储在阿里云上的地址(url)
        return null;
    }

    @Override
    public Image download(String url) {
        // 从私有云下载图片
        return null;
    }

    private void craeteBucketIfNotExisting(String bucketName) {
        // 创建 bucket 的代码逻辑
        // 失败会抛出异常
    }

}

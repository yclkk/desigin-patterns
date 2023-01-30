package com.zyc.ChapterTwo.night;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageProcessJob {
    private static final String BUCKET_NAME = "ai_images_bucket";

    /**
     *
     */
    public void process() {
        /**
         * 使用类方式上传
         */
//        Image image = null; // 处理图片并封装Image对象
//        AliyunImageStore aliyunImageStore = new AliyunImageStore();
//        aliyunImageStore.craeteBucketIfNotExisting(BUCKET_NAME);
//        String accessToken = aliyunImageStore.generateAccessToken();
//        aliyunImageStore.uploadToAliyun(image, BUCKET_NAME, accessToken);
        /**
         * 使用接口方式上传
         */
        Image image = null;
        ImageStore aliyunImageStoreImpl = new AliyunImageStoreImpl();
        aliyunImageStoreImpl.upload(image, BUCKET_NAME);

        ImageStore privateImageStore = new PrivateImageStoreImpl();
        privateImageStore.upload(image, BUCKET_NAME);

    }


}

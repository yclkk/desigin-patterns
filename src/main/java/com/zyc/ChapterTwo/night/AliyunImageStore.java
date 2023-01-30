package com.zyc.ChapterTwo.night;

import java.awt.*;

/**
 * 这种类的定义违反了基于接口而非实现编程
 *  1. 函数命名暴露细节
 *  2. 没有封装实现的细节，使用接口定义方法时不能将uploadToAliyun、downloadFromAliyun方法暴露出来
 *  3. 如果需要变更，上传到私有云，这种写法修改代码细节的难度会增加
 */
public class AliyunImageStore {
    /**
     * 定义属性，构造函数
     */

    public void craeteBucketIfNotExisting(String bucketName) {
        // 创建 bucket 的代码逻辑
        // 失败会抛出异常
    }
    public String generateAccessToken() {
        // 根据 accesskey/secrectkey 等生成 access token
        return null;
    }

    public String uploadToAliyun(Image image, String bucketName, String accessTo) {
        // 上传图片到阿里云
        // 返回图片存储在阿里云上的地址(url)
        return null;
    }

    public Image downloadFromAliyun(String url, String accessToken) {
        // 从阿里云下载图片
        return null;
    }



}


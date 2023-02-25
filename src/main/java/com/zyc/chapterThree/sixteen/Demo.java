package com.zyc.chapterThree.sixteen;

import com.zyc.chapterThree.sixteen.two.ApiStatInf;
import com.zyc.chapterThree.sixteen.two.ApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApiStatInf apiStatInf = new ApiStatInf();
        apiStatInf.setApi("url");
        apiStatInf.setErrorCount(60);
        apiStatInf.setRequsetCount(1000);
        apiStatInf.setDurationOfSecond(70);
        apiStatInf.setTimeoutCount(60);

        ApplicationContext.getInstance().getAlert().check(apiStatInf);


    }
}

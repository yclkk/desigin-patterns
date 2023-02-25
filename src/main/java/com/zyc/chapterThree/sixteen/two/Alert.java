package com.zyc.chapterThree.sixteen.two;

import java.util.ArrayList;
import java.util.List;

public class Alert {
    private List<AlertHandler> alertHandlers = new ArrayList<>();

    public void addAlertHandler(AlertHandler alertHandler) {
        this.alertHandlers.add(alertHandler);
    }

    public void check(ApiStatInf apiStatInf) {
        for (AlertHandler handler : alertHandlers) {
            handler.check(apiStatInf);
        }
    }


}

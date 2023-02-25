package com.zyc.chapterThree.sixteen.two;

import com.zyc.chapterThree.sixteen.AlertRule;
import com.zyc.chapterThree.sixteen.Notification;
import com.zyc.chapterThree.sixteen.NotificationEmergencyLevel;

public class ErrorAlertHandler extends AlertHandler{

    public ErrorAlertHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiStatInf apiStatInf) {
        if (apiStatInf.getErrorCount() > alertRule.getMatechedRule(apiStatInf.getApi()).getErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }

    }
}

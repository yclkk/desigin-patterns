package com.zyc.chapterThree.sixteen.two;

import com.zyc.chapterThree.sixteen.AlertRule;
import com.zyc.chapterThree.sixteen.Notification;
import com.zyc.chapterThree.sixteen.NotificationEmergencyLevel;

public class TimeoutAlterHandler extends AlertHandler{

    public TimeoutAlterHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiStatInf apiStatInf) {
        if (apiStatInf.getTimeoutCount() > alertRule.getMatechedRule(apiStatInf.getApi()).getTimeoutCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}

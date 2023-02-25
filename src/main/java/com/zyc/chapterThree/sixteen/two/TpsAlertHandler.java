package com.zyc.chapterThree.sixteen.two;

import com.zyc.chapterThree.sixteen.AlertRule;
import com.zyc.chapterThree.sixteen.Notification;
import com.zyc.chapterThree.sixteen.NotificationEmergencyLevel;

public class TpsAlertHandler extends AlertHandler{

    public TpsAlertHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiStatInf apiStatInf) {
        long tps = apiStatInf.getRequsetCount() / apiStatInf.getDurationOfSecond();
        if (tps > alertRule.getMatechedRule(apiStatInf.getApi()).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
    }
}

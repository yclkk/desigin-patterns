package com.zyc.chapterThree.sixteen.first;


import com.zyc.chapterThree.sixteen.AlertRule;
import com.zyc.chapterThree.sixteen.Notification;
import com.zyc.chapterThree.sixteen.NotificationEmergencyLevel;

public class Alert {
    private AlertRule rule;
    private Notification notification;

    public Alert(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public void check(String api, long requestCount, long errorCount, long durationOfSecond) {
        long tps = requestCount / durationOfSecond;
        if (tps > rule.getMatechedRule(api).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
        if (errorCount > rule.getMatechedRule(api).getErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}

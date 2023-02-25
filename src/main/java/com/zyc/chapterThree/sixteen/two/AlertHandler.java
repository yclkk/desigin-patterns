package com.zyc.chapterThree.sixteen.two;

import com.zyc.chapterThree.sixteen.AlertRule;
import com.zyc.chapterThree.sixteen.Notification;

public abstract class AlertHandler {

    protected AlertRule alertRule;

    protected Notification notification;

    public AlertHandler(AlertRule alertRule, Notification notification) {
        this.alertRule = alertRule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInf apiStatInf);
}

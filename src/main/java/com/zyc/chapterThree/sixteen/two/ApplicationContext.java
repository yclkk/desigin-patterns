package com.zyc.chapterThree.sixteen.two;

import com.zyc.chapterThree.sixteen.AlertRule;
import com.zyc.chapterThree.sixteen.ApiRule;
import com.zyc.chapterThree.sixteen.Notification;
import com.zyc.chapterThree.sixteen.NotificationEmergencyLevel;

import java.sql.Time;

public class ApplicationContext {
    private AlertRule alertRule;

    private Alert alert;

    private Notification notification;

    public void initialBeans() {
        this.alertRule = new AlertRule();
        this.alert = new Alert();
        this.notification = new Notification();
        alert.addAlertHandler(new ErrorAlertHandler(alertRule, notification));
        alert.addAlertHandler(new ErrorAlertHandler(alertRule, notification));
        alert.addAlertHandler(new TimeoutAlterHandler(alertRule, notification));
    }

    public Alert getAlert() {
        return alert;
    }

    private static final ApplicationContext instance = new ApplicationContext();

    private ApplicationContext() {
        instance.initialBeans();
    }

    public static ApplicationContext getInstance() {
        return instance;
    }



}

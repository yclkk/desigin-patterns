package com.zyc.chapterThree.sixteen.eighteen;

import java.util.concurrent.ScheduledExecutorService;

public class ScheduledUpdater {
    private final ScheduledExecutorService scheduledExecutorService;

    public ScheduledUpdater(ScheduledExecutorService scheduledExecutorService) {
        this.scheduledExecutorService = scheduledExecutorService;
    }
}

package com.zyc.ChapterTwo.seven;

import java.io.IOException;
import java.util.logging.Level;

public abstract class Logger {
    private String name;
    private boolean enabled;
    private Level minPermittedLevel;

    public Logger(String name, boolean enabled, Level minPermittedLevel) {
        this.name = name;
        this.enabled = enabled;
        this.minPermittedLevel = minPermittedLevel;
    }

    public void log(Level level, String message) throws IOException {
        boolean loggerable = enabled && (minPermittedLevel.intValue() <= level.intValue());
        if (!loggerable) return;
        doLog(level, message);
    }

    public abstract void doLog(Level level, String message) throws IOException;
}

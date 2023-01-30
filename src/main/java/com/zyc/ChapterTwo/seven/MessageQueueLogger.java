package com.zyc.ChapterTwo.seven;

import java.io.IOException;
import java.util.logging.Level;

public class MessageQueueLogger extends Logger {
    public MessageQueueLogger(String name, boolean enabled, Level minPermittedLevel) {
        super(name, enabled, minPermittedLevel);
    }

    @Override
    public void doLog(Level level, String message) throws IOException {

    }
}

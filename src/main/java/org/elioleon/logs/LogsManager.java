package org.elioleon.logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class LogsManager {
    public static final Logger logger = LogManager.getLogger(LogsManager.class);

    private LogsManager() {
    }

    public static void info(String info){
        logger.info(info);
    }
}

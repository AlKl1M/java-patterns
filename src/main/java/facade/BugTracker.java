package facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Класс запускающий спринт, во время которого должна идти работа
 * @author alkl1m
 */
public class BugTracker {
    private boolean activeSprint;
    private final Logger logger = LogManager.getLogger(getClass());

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        logger.info("Sprint is active.");
        activeSprint = true;
    }

    public void finishSpring() {
        logger.info("Sprint is not active.");
        activeSprint = false;
    }
}

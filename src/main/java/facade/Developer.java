package facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Класс работника, который должен работать во время активного спринта
 * @author alkl1m
 */
public class Developer {

    private final Logger logger = LogManager.getLogger(getClass());

    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            logger.info("Developer is working...");
        } else {
            logger.info("Developer is chilling...");
        }
    }
}

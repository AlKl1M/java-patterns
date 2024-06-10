package facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Класс отображающий процесс работы
 * @author alkl1m
 */
public class Job {

    private final Logger logger = LogManager.getLogger(getClass());

    public void doJob() {
        logger.info("Job in progress...");
    }
}

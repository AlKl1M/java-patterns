package factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Конкретная реализация разработчика на java
 * @author alkl1m
 */
public class JavaDeveloper implements Developer {

    private final Logger logger = LogManager.getLogger(getClass());

    @Override
    public void writeCode() {
        logger.info("Java dev writes Java code...");
    }

}

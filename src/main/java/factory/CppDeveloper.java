package factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Конкретная реализация разработчика на c++
 * @author alkl1m
 */
public class CppDeveloper implements Developer {

    private final Logger logger = LogManager.getLogger(getClass());

    @Override
    public void writeCode() {
        logger.info("C++ developer writes C++ code...");
    }

}

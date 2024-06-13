package command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Database {

    private final Logger logger = LogManager.getLogger(getClass());

    public void insert() {
        logger.info("Inserting record...");
    }

    public void update() {
        logger.info("Updating record...");
    }

    public void select() {
        logger.info("Reading record...");
    }

    public void delete() {
        logger.info("Deleting record...");
    }

}

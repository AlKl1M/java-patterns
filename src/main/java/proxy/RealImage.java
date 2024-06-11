package proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Репрезентация реального объекта над которым
 * у прокси будет контроль
 * @author alkl1m
 */
public class RealImage implements Image {
    private String filename;
    private final Logger logger = LogManager.getLogger(getClass());

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    public String getFilename() {
        return filename;
    }

    public void loadImageFromDisk() {
        logger.info("Loading image: " + filename);
    }

    @Override
    public void display() {
        logger.info("Displaying image: " + filename);
    }
}

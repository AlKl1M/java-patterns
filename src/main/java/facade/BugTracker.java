package facade;

/**
 * Класс запускающий спринт, во время которого должна идти работа
 * @author alkl1m
 */
public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        System.out.println("Sprint is active.");
        activeSprint = true;
    }

    public void finishSpring() {
        System.out.println("Sprint is not active.");
        activeSprint = false;
    }
}

package facade;

/**
 * Класс работника, который должен работать во время активного спринта
 * @author alkl1m
 */
public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is working...");
        } else {
            System.out.println("Developer is chilling...");
        }
    }
}

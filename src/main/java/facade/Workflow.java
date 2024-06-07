package facade;

/**
 * Фасад, который позволяет организовывать рабочий процесс
 * @author alkl1m
 */
public class Workflow {
    private Developer developer;
    private Job job;
    private BugTracker bugTracker;

    public Workflow() {
        this.developer = new Developer();
        this.job = new Job();
        this.bugTracker = new BugTracker();
    }

    public void solveProblems() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}

package facade;

/**
 * Точка входа. Добавил для провери работоспособности
 * и просмотра логгов
 * @author alkl1m
 */
public class SprintRunner {
    public static void main(String[] args) {
        Workflow workflow = new Workflow();

        workflow.solveProblems();
    }
}

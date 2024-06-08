package facade;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class WorkflowTest {

    @Test
    void testWorkflow_withValidPayload_RunsEveryInnerMethodOfFacade() {
        Developer developer = mock(Developer.class);
        Job job = mock(Job.class);
        BugTracker bugTracker = mock(BugTracker.class);

        Workflow workflow = new Workflow(developer, job, bugTracker);

        workflow.solveProblems();

        verify(job).doJob();
        verify(bugTracker).startSprint();
        verify(developer).doJobBeforeDeadline(bugTracker);
    }

}
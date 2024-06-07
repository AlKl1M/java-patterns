package facade;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class WorkflowTest {

    @Test
    void testWorkflow_withValidPayload_ReturnsValidData() {
        Workflow workflow = new Workflow();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        workflow.solveProblems();

        String consoleOutput = outputStream.toString();

        assertTrue(consoleOutput.contains("Job in progress..."));
        assertTrue(consoleOutput.contains("Sprint is active."));
        assertTrue(consoleOutput.contains("Developer is working..."));
    }

}
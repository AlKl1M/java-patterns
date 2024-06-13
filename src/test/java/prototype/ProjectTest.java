package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class ProjectTest {

    @Test
    public void testProjectClone_WithValidPayload_NotSameAsOriginal() {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");
        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        assertNotSame(master, masterClone);
    }

    @Test
    public void testProjectClone_WithValidPayload_CloneHasSameValuesAsOriginal() {

        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");
        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        assertEquals(master.getId(), masterClone.getId());
        assertEquals(master.getProjectName(), masterClone.getProjectName());
        assertEquals(master.getSourceCode(), masterClone.getSourceCode());
    }

    @Test
    public void testProjectModifyClone_WithValidPayload_DoesNotAffectOriginal() {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");
        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        masterClone.setId(2);
        masterClone.setProjectName("NewProject");
        masterClone.setSourceCode("Modified source code");

        assertNotEquals(master.getId(), masterClone.getId());
        assertNotEquals(master.getProjectName(), masterClone.getProjectName());
        assertNotEquals(master.getSourceCode(), masterClone.getSourceCode());
    }

}
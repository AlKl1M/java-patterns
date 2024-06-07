package factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProgramTest {
    @Test
    public void testCreateDeveloperByJavaSpeciality() {
        DeveloperFactory factory = Program.createDeveloperBySpeciality("java");
        assertNotNull(factory);
        assertTrue(factory instanceof JavaDeveloperFactory);
    }

    @Test
    public void testCreateDeveloperByCppSpeciality() {
        DeveloperFactory factory = Program.createDeveloperBySpeciality("c++");
        assertNotNull(factory);
        assertTrue(factory instanceof CppDeveloperFactory);
    }

    @Test
    public void testCreateDeveloperByUnknownSpeciality() {
        assertThrows(RuntimeException.class, () -> {
            Program.createDeveloperBySpeciality("python");
        });
    }
}
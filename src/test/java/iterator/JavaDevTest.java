package iterator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JavaDevTest {

    @Test
    void testJavaDevTestSkillIterator_withSkillsArray_returnsValidData() {
        String[] skills = {"Java", "Maven", "PSQL", "Gradle", "Spring", "Hibernate"};
        JavaDev javaDev = new JavaDev("Alex Klimkovetskiy", skills);

        Iterator iterator = javaDev.getIterator();
        assertNotNull(iterator);

        int count = 0;
        while (iterator.hasNext()) {
            Object skill = iterator.next();
            assertNotNull(skill);
            assertInstanceOf(String.class, skill);
            assertTrue(Arrays.asList(skills).contains(skill));
            count++;
        }

        assertEquals(skills.length, count);
    }
}
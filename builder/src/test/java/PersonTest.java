import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testPersonBuilder_WithValidPayload_ReturnsValidPerson() {
        Person person = new Person.PersonBuilder()
                .setFirstName("Alex")
                .setLastName("Klimkovetskiy")
                .setAge(21)
                .build();

        assertNotNull(person);
        assertEquals("Alex", person.getFirstName());
        assertEquals("Klimkovetskiy", person.getLastName());
        assertEquals(21, person.getAge());
    }
}
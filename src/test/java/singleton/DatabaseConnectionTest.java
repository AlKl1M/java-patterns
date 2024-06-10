package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;


class DatabaseConnectionTest {

    @Test
    public void testDatabaseConnection_WithTwoInstances_ReturnsSameInstances() {
        DatabaseConnection connection1 = DatabaseConnection.INSTANCE;
        DatabaseConnection connection2 = DatabaseConnection.INSTANCE;

        assertSame(connection1, connection2);
    }

    @Test
    public void testDatabaseConnection_WithInstance_ReturnsConnectedData() {
        DatabaseConnection connection = DatabaseConnection.INSTANCE;
        connection.connect();
        assertTrue(connection.isConnected());
    }

    @Test
    public void testDatabaseConnection_WithInstance_ReturnsDisconnectedData() {
        DatabaseConnection connection = DatabaseConnection.INSTANCE;
        connection.disconnect();
        assertFalse(connection.isConnected());
    }

}
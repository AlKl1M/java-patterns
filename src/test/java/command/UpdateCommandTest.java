package command;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class UpdateCommandTest {
    @Test
    public void testInsertCommand() {
        Database database = mock(Database.class);
        UpdateCommand updateCommand = new UpdateCommand(database);

        updateCommand.execute();

        verify(database, times(1)).update();
    }

}
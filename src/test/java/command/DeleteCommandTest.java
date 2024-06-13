package command;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class DeleteCommandTest {

    @Test
    public void testDeleteCommand() {
        Database database = mock(Database.class);
        DeleteCommand deleteCommand = new DeleteCommand(database);

        deleteCommand.execute();

        verify(database, times(1)).delete();
    }

}
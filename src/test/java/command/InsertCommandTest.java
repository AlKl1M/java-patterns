package command;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class InsertCommandTest {

    @Test
    public void testInsertCommand() {
        Database database = mock(Database.class);
        InsertCommand insertCommand = new InsertCommand(database);

        insertCommand.execute();

        verify(database, times(1)).insert();
    }

}
package command;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class SelectCommandTest {

    @Test
    public void testInsertCommand() {
        Database database = mock(Database.class);
        SelectCommand selectCommand = new SelectCommand(database);

        selectCommand.execute();

        verify(database, times(1)).select();
    }

}
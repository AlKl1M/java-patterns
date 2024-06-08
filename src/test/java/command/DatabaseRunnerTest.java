package command;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class DatabaseRunnerTest {

    @Test
    public void testDatabaseRunner() {
        Database database = mock(Database.class);
        Developer developer = new Developer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();

        verify(database, times(1)).insert();
        verify(database, times(1)).update();
        verify(database, times(1)).select();
        verify(database, times(1)).delete();
    }
}
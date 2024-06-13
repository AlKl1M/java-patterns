package command;

/**
 * Реализует вставку, следуя общему интерфейсу
 * @author alkl1m
 */
public class InsertCommand implements Command {

    private Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }

}

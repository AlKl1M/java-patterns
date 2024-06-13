package command;

/**
 * Реализует удаление, следуя общему интерфейсу
 * @author alkl1m
 */
public class DeleteCommand implements Command {

    private Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }

}

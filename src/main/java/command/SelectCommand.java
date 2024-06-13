package command;

/**
 * Реализует выборку, следуя общему интерфейсу
 * @author alkl1m
 */
public class SelectCommand implements Command {

    private Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }

}

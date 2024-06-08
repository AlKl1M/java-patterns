package command;

/**
 * Реализует апдейт, следуя общему интерфейсу
 * @author alkl1m
 */
public class UpdateCommand implements Command {

    private Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}

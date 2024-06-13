package command;

/**
 * Клиентский класс, создает объекты конкретных команд
 * и связывает девелопера с ними
 * @author alkl1m
 */
public class DatabaseRunner {

    public static void main(String[] args) {
        Database database = new Database();

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
    }

}

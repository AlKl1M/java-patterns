package factory;

import static factory.Program.createDeveloperBySpeciality;

/**
 * Класс для демонстрации программы
 * и проверки логгов
 * @author alkl1m
 */
public class Demo {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }
}

package factory;

/**
 * Класс содержащий конфигуратор, который создаёт
 * определенную фабрику в зависимости от конфигурации
 * или окружения
 * @author alkl1m
 */
public final class Program {

    private Program() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown speciality");
        }
    }
}

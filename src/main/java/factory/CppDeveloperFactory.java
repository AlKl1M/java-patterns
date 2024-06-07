package factory;

/**
 * Конкретная реализация фабрики для c++ разработчиков
 * @author alkl1m
 */
public class CppDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}

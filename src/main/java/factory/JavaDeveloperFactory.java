package factory;

/**
 * Конкретная реализация фабрики для java разработчиков
 * @author alkl1m
 */
public class JavaDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

}

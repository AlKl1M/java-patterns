package factory;

/**
 * Конкретная реализация разработчика на java
 * @author alkl1m
 */
public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java dev writes Java code...");
    }
}

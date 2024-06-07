package factory;

/**
 * Конкретная реализация разработчика на c++
 * @author alkl1m
 */
public class CppDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("C++ developer writes C++ code...");
    }
}

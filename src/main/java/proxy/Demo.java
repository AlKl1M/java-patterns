package proxy;

/**
 * Класс для демонстрации работоспособности программы.
 * Оставил для проверки логгирования.
 * @author alkl1m
 */
public class Demo {
    public static void main(String[] args) {
        Image image = new ProxyImage("example.jpg");
        image.display();
        image.display();
    }
}

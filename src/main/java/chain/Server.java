package chain;

import java.util.HashMap;
import java.util.Map;

/**
 * Имитация сервера
 * @author alkl1m
 */
public class Server {
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    /**
     * Пользователь передает middleware в сервер. Это повышает гибкость и
     * упрощает написание тестов
     *
     * @param middleware конкретный элемент цепи
     */
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    /**
     * Сервер по данным пользователя запускает
     * проверку авторизации у цепочки
     *
     * @param email почта пользователя
     * @param password пароль пользователя
     * @return результат цепочки авторизации
     */
    public boolean logIn(String email, String password) {
        return middleware.check(email, password);
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}

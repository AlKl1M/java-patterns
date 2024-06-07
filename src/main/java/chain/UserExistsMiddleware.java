package chain;

/**
 * Конкретный элемент цепи, который проверяет существование пользователя
 * @author alkl1m
 */
public class UserExistsMiddleware extends Middleware {
    private final Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    /**
     * @param email почта пользователя
     * @param password пароль пользователя
     * @return результат существования пользователя в системе
     */
    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            return false;
        }
        return checkNext(email, password);
    }
}

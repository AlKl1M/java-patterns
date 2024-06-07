package chain;

/**
 * Конкретный элемент цепи, который проверяет доступ по ролям
 * @author alkl1m
 */
public class RoleCheckMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            return true;
        }
        return checkNext(email, password);
    }
}

/**
 * Конкретный элемент цепи, который проверяет доступ по ролям
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

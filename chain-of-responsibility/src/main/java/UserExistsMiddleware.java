/**
 * Конкретный элемент цепи, который проверяет существование пользователя
 */
public class UserExistsMiddleware extends Middleware {
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }
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

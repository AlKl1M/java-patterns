import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddlewareTest {

    @Test
    public void testMiddleware_withAdminCredentials_ReturnsValidResult() {
        Server server = new Server();
        server.register("admin@example.com", "admin_pass");

        Middleware middleware = Middleware.link(
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);

        boolean result = server.logIn("admin@example.com", "admin_pass");

        assertTrue(result);
    }

    @Test
    public void testMiddleware_withUserCredentials_ReturnsValidResult() {
        Server server = new Server();
        server.register("user@example.com", "user_pass");

        Middleware middleware = Middleware.link(
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);

        boolean result = server.logIn("user@example.com", "user_pass");

        assertTrue(result);
    }

    @Test
    public void testMiddleware_withInvalidCredentials_ReturnsValidResult() {
        Server server = new Server();
        server.register("user@example.com", "user_pass");

        Middleware middleware = Middleware.link(
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);

        boolean result = server.logIn("not-exists@example.com", "not_exists_pass");

        assertFalse(result);
    }
}
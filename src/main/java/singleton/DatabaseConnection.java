package singleton;

/**
 * Синглтон для подключения к бд на enum
 * Потокобезопасен, уникален, прост и не требует обработки сериализации
 * @author alkl1m
 */
public enum DatabaseConnection {
    INSTANCE;

    private boolean isConnected;

    public void connect() {
        isConnected = true;
    }

    public void disconnect() {
        isConnected = false;
    }

    public boolean isConnected() {
        return isConnected;
    }
}

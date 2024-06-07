package chain;

/**
 * Базовый класс цепочки
 */
public abstract class Middleware {
    private Middleware next;

    /**
     * Строит цепь из объектов проверок
     *
     * @param first первый элемент цепочки
     * @param chain последующие элементы цепочки
     * @return объект класса цепочки
     */
    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    /**
     * Метод для конкретных проверок
     *
     * @param email почта пользователя
     * @param password пароль пользователя
     * @return результат проверки на доступ по данным пользователя
     */
    public abstract boolean check(String email, String password);

    /**
     * Запускает проверку в следующем объекте или завершает её, если это
     * последний элемент цепи
     *
     * @param email почта пользователя
     * @param password пароль пользователя
     * @return true, если последний элемент цепи
     * и false, если есть еще элементы проверки
     */
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}

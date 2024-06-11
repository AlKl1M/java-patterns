package iterator;

/**
 * Итератор. Содержит контракты для проверки существования
 * следующего элемента и его получения
 * @author alkl1m
 */
public interface Iterator {
    boolean hasNext();

    Object next();
}

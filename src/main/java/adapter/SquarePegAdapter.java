package adapter;

/**
 * Адаптер, которые позволяет вставлять квадратные колышки в круглые отверстия
 * @author alkl1m
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    /**
     * @return минимальный радиус, в который пролезет колышек
     */
    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}

package adapter;

/**
 * Квадратные колышки, которые несовместимы с круглыми отверстиями.
 * Нам надо вместить их в круглые отверстия
 * @author alkl1m
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}

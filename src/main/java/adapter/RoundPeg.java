package adapter;

/**
 * Круглые колышки, которые совместимы с круглыми отверстиями
 * @author alkl1m
 */
public class RoundPeg {
    private double radius;

    public RoundPeg() {}

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

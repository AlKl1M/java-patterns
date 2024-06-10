package adapter;

/**
 * Круглое отверстие, которое совместимо с круглыми колышками
 * @author alkl1m
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /**
     * @param peg круглый колышек
     * @return проверка вместился ли колышек в отверстие или нет
     */
    public boolean fits(RoundPeg peg) {
        return (this.getRadius() >= peg.getRadius());
    }
}

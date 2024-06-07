package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RoundHoleTest {

    @Test
    void testRoundHole_WithValidRoundPeg_ReturnsValidData() {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        assertTrue(hole.fits(rpeg));
    }

    @Test
    void testRoundHole_WithLargeRoundPeg_ReturnsValidData() {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(10);
        assertFalse(hole.fits(rpeg));
    }
}
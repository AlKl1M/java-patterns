package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquarePegAdapterTest {

    @Test
    void testSquarePegAdapter_withSmallPeg_ReturnsValidData() {
        RoundHole hole = new RoundHole(5);

        SquarePeg smallSqPeg = new SquarePeg(2);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);

        assertTrue(hole.fits(smallSqPegAdapter));
    }

    @Test
    void testSquarePegAdapter_withLargePeg_ReturnsValidData() {
        RoundHole hole = new RoundHole(5);

        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        assertFalse(hole.fits(largeSqPegAdapter));
    }
}
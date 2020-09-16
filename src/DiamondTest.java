import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiamondTest {
    @Test
    public void line() {
        assertEquals("*", Diamond.line(0, 1));
        assertEquals(" *", Diamond.line(1, 1));
    }

    @Test
    public void top() {
        assertEquals("*\n", Diamond.top(1));
        assertEquals(" *\n***\n", Diamond.top(3));
        assertEquals("  *\n ***\n*****\n", Diamond.top(5));
    }

    @Test
    public void bottom() {
        assertEquals("", Diamond.bottom(1));
        assertEquals(" *\n", Diamond.bottom(3));
        assertEquals(" ***\n  *\n", Diamond.bottom(5));
    }

    @Test
    public void testDiamond3() {
        String expected =
                " *\n" +
                "***\n" +
                " *\n";
        assertEquals(expected, Diamond.print(3));
    }


}
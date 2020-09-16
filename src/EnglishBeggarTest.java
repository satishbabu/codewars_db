import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnglishBeggarTest {
    @Test
    void singleBeggarTest() {
        int[] test = {1, 2, 3, 5};
        assertEquals(11, EnglishBeggar.beggarShare(test, 0, 1));
        assertEquals(4, EnglishBeggar.beggarShare(test, 0, 2));
        assertEquals(7, EnglishBeggar.beggarShare(test, 1, 2));
    }

    @Test
    public void basicTest()  {
        int[] test = {1, 2, 3};
        int [] a2 = {4, 2};
        assertArrayEquals(a2, EnglishBeggar.beggars(test, 2));
    }

    @Test
    public void tester() throws Exception {
        int[] test = {1, 2, 3, 4, 5};
        int[] a1 = {15}, a2 = {9, 6}, a3 = {5, 7, 3}, a4 = {1, 2, 3, 4, 5, 0}, a5 = {};
        assertArrayEquals(a1, EnglishBeggar.beggars(test, 1));
        assertArrayEquals(a2, EnglishBeggar.beggars(test, 2));
        assertArrayEquals(a3, EnglishBeggar.beggars(test, 3));
        assertArrayEquals(a4, EnglishBeggar.beggars(test, 6));
        assertArrayEquals(a5, EnglishBeggar.beggars(test, 0));
    }
}
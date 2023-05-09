import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestKoko {

    @Test
    public void test1() {
        KokoEatBanana koko = new KokoEatBanana();
        int[] piles = {3, 6, 7, 11};
        int H = 8;
        int expected = 4;
        int actual = koko.findMinSpeed(piles, H);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        KokoEatBanana koko = new KokoEatBanana();
        int[] piles = {30, 11, 23, 4, 20};
        int H = 5;
        int expected = 30;
        int actual = koko.findMinSpeed(piles, H);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        KokoEatBanana koko = new KokoEatBanana();
        int[] piles3 = {30,11,23,4,20};
        int H = 6;
        int expected = 23;
        int actual = koko.findMinSpeed(piles3, H);
        assertEquals(expected, actual);
    }


}

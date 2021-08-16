package chapterFive;

import chapterFour.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaysOfChristmasTest {
    @Test
    public void twelveDayOfChristmasTest() {
        DaysOfChristmas xmas = new DaysOfChristmas();
        String result = xmas.twelveDaysOfChristmas(1);
        assertEquals("""
                On the first day of christmas, my true love sent to me
                A partridge in a pear tree.""", result);
    }

}
package segmentDisplay;

import mpThreePlayer.Mp3Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevenSegmentDisplayTest {
    SevenSegmentDisplay segment;
    int[][] screen;
    @BeforeEach
    public void beforeEach()
    {
        segment = new SevenSegmentDisplay();
        screen = SevenSegmentDisplay.getScreen();
    }
    @Test
    public void segmentAHasTheRightNumbersTest()
    {
//        segment.clearScreen();
        segment.segmentA();
        for (int i = 0; i < 4; i++) {
            assertEquals(1, screen[0][i]);}
        }
@Test
    public void segmentBHasTheRightNumbersTest()
    {
        segment.segmentB();
        for (int i = 0; i < 3; i++) {
            assertEquals(1, screen[i][3]);
        }
    }
    @Test
    public void segmentCHasTheRightNumbersTest() {
        segment.segmentC();
        for (int i = 2; i < 5; i++) {
            assertEquals(1, screen[i][3]);}
    }
    @Test
    public void segmentDHasTheRightNumbersTest() {
        segment.segmentD();
        for (int i = 0; i < 4; i++) {
            assertEquals(1, screen[4][i]);}
    }
    @Test
    public void segmentEHasTheRightNumbersTest() {
        segment.segmentE();
        for (int i = 2; i < 5; i++) {
            assertEquals(1, screen[i][0]);}
    }
    @Test
    public void segmentFHasTheRightNumbersTest() {
        segment.segmentF();
        for (int i = 0; i < 3; i++) {
            assertEquals(1, screen[i][0]);}
    }
    @Test
    public void segmentGHasTheRightNumbersTest() {
        segment.segmentG();
        for (int i = 0; i < 4; i++) {
            assertEquals(1, screen[2][i]);
        }
    }
    @Test
    public void thereCanOnlyBeEightDigitTest()
    {
        assertThrows(IllegalArgumentException.class,()-> segment.setScreen("111111111"));
    }

    @Test
    public void thereCanOnlyBeBinaryDigitTest()
    {
        SevenSegmentDisplay segment = new SevenSegmentDisplay();
        assertThrows(IllegalArgumentException.class,()-> segment.setScreen("12314111"));
    }
    @Test
    public void lastBitAtZeroTurnOffDisplay()
    {
        segment.setScreen("11111110");
        for (int i = 0; i < 4; i++) {
            assertEquals(0,screen[4][i]);
        }
    }
    @Test
    public void lessThanEightDigitAddTrailingZeroTest()
    {
        segment.setScreen("1111");
        for (int i = 1; i < 4; i++) {
            assertEquals(0, screen[4][i]);
        }
    }
}


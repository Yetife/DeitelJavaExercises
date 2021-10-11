package chapterEight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle;
    @BeforeEach
    public void setUp()
    {
        rectangle = new Rectangle();
    }

    @Test
    public void testThatRectangleHasLength()
    {

        assertNotNull(rectangle.getLength());
    }
    @Test
    public void testThatRectangleHasWidth()
    {
        assertNotNull(rectangle.getWidth());
    }
    @Test
    public void testThatRectanglrLengthCannotBeLessThanZeroAndGreaterThanTwenty()
    {
        rectangle.setLength(19.0);
        assertEquals(19.0, rectangle.getLength());
    }
    @Test
    public void calculatePerimeterOfRectangleTest()
    {
        rectangle.setLength(5.0);
        rectangle.setWidth(4.0);
        assertEquals(18.0, rectangle.calculatePerimeter());
    }
    @Test
    public void calulateAreaOfARectangleTest()
    {
        rectangle.setLength(12.0);
        rectangle.setWidth(10);
        assertEquals(120.0, rectangle.calculateArea());
    }
}
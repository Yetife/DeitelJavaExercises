package chapterSeven.turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Pen pen;
    Turtle ijapa;
    @BeforeEach
    public void startEachTestWithThis()
    {
         ijapa = new Turtle();
         pen = ijapa.getPen();
    }

    @Test
    public void turtleHasAPen()
    {
        //assert
        assertNotNull(pen);
    }

    @Test
    public  void testThatPenIsUpByDefault()
    {
        //assert
        assertSame(PenPosition.UP, pen.getPosition());
    }
    @Test
    public void testThatTurtleCanMovePenDown()
    {
        assertSame(PenPosition.UP, pen.getPosition());
        //when
        ijapa.penDown();
        //assert
        assertSame(PenPosition.DOWN, ijapa.getPen().getPosition());
    }

    @Test
    public void testThatTurtleCanMovePenUp()
    {
        ijapa.penDown();
       assertSame(PenPosition.DOWN, ijapa.getPen().getPosition());
        //when
        ijapa.penUp();
        assertSame(PenPosition.UP, ijapa.getPen().getPosition());
    }
@Test
@DisplayName("Turtle can turn right while facing east test")
    public void testThatTurtleCanTurnRight1()
{
     assertSame(Direction.EAST,ijapa.getCurrrentDirection());
        //when
    ijapa.turnRight();
    assertSame(Direction.SOUTH, ijapa.getCurrrentDirection());
}

    @Test
    @DisplayName("Turtle can turn tight while facing south test")
    public void testThatTurtleCanTurnRight2()
    {
        //given
        ijapa.turnRight();
        assertSame(Direction.SOUTH, ijapa.getCurrrentDirection());
        //when
        ijapa.turnRight();
        //assert
        assertSame(Direction.WEST, ijapa.getCurrrentDirection());
    }
    @Test
    @DisplayName("Turtle can turn right while facing west test")
    public void testThatTurtleCanTurnRight3()
    {
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.WEST, ijapa.getCurrrentDirection());
        ijapa.turnRight();
        assertSame(Direction.NORTH, ijapa.getCurrrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn right while facing north test")
    public void testThatTurtleCanTurnRight4()
    {
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.NORTH, ijapa.getCurrrentDirection());
        ijapa.turnRight();
        assertSame(Direction.EAST, ijapa.getCurrrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn left while facing east test")
    public void testThatTurtleCanTurnLeft1()
    {
        assertEquals(Direction.EAST, ijapa.getCurrrentDirection());
        //when
        ijapa.turnLeft();
        //assert
        assertSame(Direction.NORTH, ijapa.getCurrrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn left while facing north test")
    public void testThatTurtleCanTurnLeft2()
    {
        ijapa.turnLeft();
        assertEquals(Direction.NORTH, ijapa.getCurrrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.WEST, ijapa.getCurrrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn left while facing west test")
    public void testThatTurtleCanTurnLeft3()
    {
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertEquals(Direction.WEST, ijapa.getCurrrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.SOUTH, ijapa.getCurrrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn left while facing south test")
    public void testThatTurtleCanTurnLeft4()
    {
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertEquals(Direction.SOUTH, ijapa.getCurrrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.EAST, ijapa.getCurrrentDirection());
    }
    @Test
    public void testThatTurtleCanMoveForwardWhileFacingEast()
    {
        //given
        assertEquals(new Position(0,0), ijapa.getCurrrentPosition());
        //when
        ijapa.moveForward(5);
        assertEquals(new Position(0, 4), ijapa.getCurrrentPosition());
    }
    @Test
    public void testThatTurtleCanMoveForwardWhileFacingSouth()
    {
        //given
        ijapa.turnRight();
        assertSame(Direction.SOUTH, ijapa.getCurrrentDirection());
        assertEquals(new Position(0,0), ijapa.getCurrrentPosition());
        //when
        ijapa.moveForward(5);
        assertEquals(new Position(4, 0), ijapa.getCurrrentPosition());
    }
    @Test
    public void testThatTurtleCanMoveForwardWhileFacingWest()
    {
        //given
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.WEST, ijapa.getCurrrentDirection());
        assertEquals(new Position(0,0), ijapa.getCurrrentPosition());
        //when
        ijapa.moveForward(5);
        assertEquals(new Position(0, -4), ijapa.getCurrrentPosition());
    }
    @Test
    public void testThatTurtleCanMoveForwardWhileFacingNorth()
    {
        //given
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.NORTH, ijapa.getCurrrentDirection());
        assertEquals(new Position(0,0), ijapa.getCurrrentPosition());
        //when
        ijapa.moveForward(5);
        assertEquals(new Position(-4, 0), ijapa.getCurrrentPosition());
    }

    @Test
    public void turtleCanWriteOnSketchpadWhileFacingEastTest()
    {
        ijapa.penDown();
        assertSame(Direction.EAST, ijapa.getCurrrentDirection());
        SketchPad sketchPad = new SketchPad(5,5);
        //when
        ijapa.writeOn(sketchPad, 5);
        //assert
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(1, floor[0][3]);
        assertEquals(1, floor[0][4]);
        assertEquals(new Position(0, 4), ijapa.getCurrrentPosition());
        sketchPad.displayFloor();
    }
    @Test
    public void turtleCanWriteOnSketchpadWhileFacingSouthTest()
    {
        //given
        ijapa.penDown();
        SketchPad sketchPad = new SketchPad(5, 5);
        ijapa.writeOn(sketchPad, 5);
        ijapa.turnRight();
        assertSame(Direction.SOUTH, ijapa.getCurrrentDirection());
        assertEquals(new Position(0, 4), ijapa.getCurrrentPosition());
        //when
        ijapa.writeOn(sketchPad,5);
        //assert
        int [][]floor=sketchPad.getFloor();
//        for (int i = 0; i < 5; i++){
//            assertEquals(1,floor[i][0]);
//        }
        assertEquals(1, floor[0][4]);
        assertEquals(1, floor[1][4]);
        assertEquals(1, floor[2][4]);
        assertEquals(1, floor[3][4]);
        assertEquals(1, floor[4][4]);
        assertEquals(new Position(4, 4), ijapa.getCurrrentPosition());
        sketchPad.displayFloor();
    }
    @Test
    public void turtleCanWriteOnSketchPadWhileFacingWestTest()
    {
        ijapa.penUp();
        SketchPad sketchPad = new SketchPad(5,5);
        //when
        ijapa.writeOn(sketchPad, 5);
        //assert
        int[][] floor = sketchPad.getFloor();

        ijapa.penDown();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(Direction.WEST, ijapa.getCurrrentDirection());
        //when
        ijapa.writeOn(sketchPad, 5);
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(1, floor[0][3]);
        assertEquals(1, floor[0][4]);
        assertEquals(new Position(0, 0 ), ijapa.getCurrrentPosition());
        sketchPad.displayFloor();
    }

    @Test
    public void turtleCanWriteOnSketchPadWhileFacingNorthTest()
    {
        SketchPad sketchPad = new SketchPad(5, 5);
        ijapa.penUp();
        ijapa.turnRight();
        ijapa.writeOn(sketchPad,5);
        assertSame(Direction.SOUTH, ijapa.getCurrrentDirection());

        int [][]floor=sketchPad.getFloor();
        for (int i = 0; i < 5; i++){
            assertEquals(0,floor[i][0]);
        }
        assertEquals(new Position(4, 0), ijapa.getCurrrentPosition());
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.NORTH, ijapa.getCurrrentDirection());
        ijapa.penDown();
        //when
        ijapa.writeOn(sketchPad, 5);
        for (int i = 0; i < 5; i++){
            assertEquals(1,floor[i][0]);
        }
        assertEquals(new Position(0, 0), ijapa.getCurrrentPosition());
    }
    @Test
    public void testTurtle()
    {
        SketchPad sketchPad = new SketchPad(6, 6);
        ijapa.penDown();
        ijapa.writeOn(sketchPad, 5);
        ijapa.turnRight();
        ijapa.writeOn(sketchPad, 5);
        ijapa.turnRight();
        ijapa.writeOn(sketchPad, 5);
        ijapa.turnRight();
        ijapa.writeOn(sketchPad, 5);
        ijapa.turnRight();
        sketchPad.displayFloor();
    }
}
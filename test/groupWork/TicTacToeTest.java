package groupWork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe ticTacToe;
    @BeforeEach
    public void setUp()
    {
        ticTacToe = new TicTacToe();
    }

    @Test
    public void testThatTictacToeHasABoard()
    {
        //when
        Board board = ticTacToe.getBoard();
        assertNotNull(board);
    }
    @Test
    public void testThatTicTacToeIsEmptyByDefault()
    {
        assertEquals(BoardValue.EMPTY,ticTacToe.getBoardValue());
    }



}